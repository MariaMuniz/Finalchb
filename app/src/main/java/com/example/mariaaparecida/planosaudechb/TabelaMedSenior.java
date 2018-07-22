package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import Dao.PrecoDAO;
import Entidades.Preco;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 27/04/2018.
 */

public class TabelaMedSenior extends Activity {


    private EditText edtvalor1;
    private EditText edtvalor2;
    private EditText edtvalor3;


    private EditText edtQtd1;
    private EditText edtQtd2;
    private EditText edtQtd3;

    private EditText edtTotal1;
    private EditText edtTotal2;
    private EditText edtTotal3;

    private ArrayList<EditText> todosPrecos = new ArrayList<>();
    private ArrayList<EditText> todasQtds = new ArrayList<>();
    private ArrayList<EditText> todosResultados = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.tabelamedsenior_antigo);
        else

            setContentView(R.layout.tabelamedsenior);


        edtvalor1 = (EditText)findViewById(R.id.edtPreco1);
        edtvalor2 = (EditText)findViewById(R.id.edtPreco2);
        edtvalor3 = (EditText)findViewById(R.id.edtPreco3);


        edtTotal1 = (EditText)findViewById(R.id.edtTotal1);
        edtTotal2 = (EditText)findViewById(R.id.edtTotal2);
        edtTotal3 = (EditText)findViewById(R.id.edtTotal3);

        edtQtd1 = (EditText)findViewById(R.id.edtvalor1);
        edtQtd2 = (EditText)findViewById(R.id.edtvalor2);
        edtQtd3 = (EditText)findViewById(R.id.edtvalor3);


        todosPrecos.add(edtvalor1);
        todosPrecos.add(edtvalor2);
        todosPrecos.add(edtvalor3);



        todasQtds.add(edtQtd1);
        todasQtds.add(edtQtd2);
        todasQtds.add(edtQtd3);


        todosResultados.add(edtTotal1);
        todosResultados.add(edtTotal2);
        todosResultados.add(edtTotal3);

        int idPlano = Singleton.getInstance().getIdPlano();
        int idOperadora = Singleton.getInstance().getIdOperadora();
        int idProduto = Singleton.getInstance().getIdProduto();



        PrecoDAO dao = new PrecoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  preco where id_produto = "+idProduto+" and id_plano = "+idPlano+" and id_operadora = "+idOperadora;
        List<Preco> precos = dao.recuperarPorQuery(query);
        Log.d("log_tag_query", query +" | resultados.size = "+precos.size());
        if(precos.size()==0)
        {
            Toast.makeText(this,"Erro ao executar query = "+query, Toast.LENGTH_LONG);
            return;
        }
        for(Preco r : precos)
        {
            Log.d("log_tag","P = "+r.toString());
        }

        for(int i=0;i< precos.size();i++)
        {
            todosPrecos.get(i).setText(""+precos.get(i).getValor());
            todosPrecos.get(i).setEnabled(false); //so pra desativar edicao dos precos
        }


        for(EditText e : todasQtds)
        {
            e.setText(""+0);
        }

        for(int i=0;i< precos.size();i++)
        {
            int qtd;
            try{
                qtd = Integer.parseInt(todasQtds.get(i).getText().toString());
            }catch (Exception ex)
            {
                qtd=1;
            }

            NumberFormat nf = new DecimalFormat("#0.00");

            todosResultados.get(i).setText(""+nf.format(precos.get(i).getValor()*qtd));


        }


        for(int i=0;i<todasQtds.size();i++)
        {


            todasQtds.get(i).addTextChangedListener(new MyTextWatcher(precos.get(i).getValor(),todosResultados.get(i),todasQtds.get(i)));
        }

    }


    public void Chamaresultado(View v) {

        int qtds=0;
        double res=0;
        for(EditText e:todasQtds)
        {
            qtds+= Integer.parseInt(e.getText().toString());
        }

        for(EditText e:todosResultados)
        {
            res+= Double.parseDouble(e.getText().toString());
        }

        Singleton.getInstance().setQtds(qtds);
        Singleton.getInstance().setResultados(res);



        Intent it = new Intent(TabelaMedSenior.this, Totalsimulado.class);
        startActivity(it);
    }

    class MyTextWatcher implements TextWatcher
    {
        Double preco;
        EditText resultado;
        EditText edtqtd;

        public MyTextWatcher(Double preco,EditText resultado,EditText edtqtd) {
            this.preco = preco;
            this.resultado = resultado;
            this.edtqtd = edtqtd;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            int qtd;
            try{
                qtd = Integer.parseInt(edtqtd.getText().toString());
            }catch (Exception ex)
            {
                qtd=1;
            }

            NumberFormat nf = new DecimalFormat("#0.00");

            resultado.setText(""+(nf.format(qtd*preco)));


        }


    }
}




