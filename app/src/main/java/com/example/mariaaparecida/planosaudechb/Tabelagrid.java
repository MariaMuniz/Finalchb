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
 * Created by Maria Aparecida on 08/01/2018.
 */

public class Tabelagrid extends Activity {


    private EditText edtvalor1;
    private EditText edtvalor2;
    private EditText edtvalor3;
    private EditText edtvalor4;
    private EditText edtvalor5;
    private EditText edtvalor6;
    private EditText edtvalor7;
    private EditText edtvalor8;
    private EditText edtvalor9;
    private EditText edtvalor10;
    private EditText edtQtd1;
    private EditText edtQtd2;
    private EditText edtQtd3;
    private EditText edtQtd4;
    private EditText edtQtd5;
    private EditText edtQtd6;
    private EditText edtQtd7;
    private EditText edtQtd8;
    private EditText edtQtd9;
    private EditText edtQtd10;
    private EditText edtTotal1;
    private EditText edtTotal2;
    private EditText edtTotal3;
    private EditText edtTotal4;
    private EditText edtTotal5;
    private EditText edtTotal6;
    private EditText edtTotal7;
    private EditText edtTotal8;
    private EditText edtTotal9;
    private EditText edtTotal10;
    private ArrayList<EditText> todosPrecos = new ArrayList<>();
    private ArrayList<EditText> todasQtds = new ArrayList<>();
    private ArrayList<EditText> todosResultados = new ArrayList<>();
    private int qtdMaxima;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.tabela);
        else

        setContentView(R.layout.tabelagrid);

        qtdMaxima = Singleton.getInstance().getQtdMaximaDePessoas();

        edtvalor1 = (EditText)findViewById(R.id.edtPreco1);
        edtvalor2 = (EditText)findViewById(R.id.edtPreco2);
        edtvalor3 = (EditText)findViewById(R.id.edtPreco3);
        edtvalor4 = (EditText)findViewById(R.id.edtPreco4);
        edtvalor5 = (EditText)findViewById(R.id.edtPreco5);
        edtvalor6 = (EditText)findViewById(R.id.edtPreco6);
        edtvalor7 = (EditText)findViewById(R.id.edtPreco7);
        edtvalor8 = (EditText)findViewById(R.id.edtPreco8);
        edtvalor9 = (EditText)findViewById(R.id.edtPreco9);
        edtvalor10 = (EditText)findViewById(R.id.edtPreco10);


        edtTotal1 = (EditText)findViewById(R.id.edtTotal1);
        edtTotal2 = (EditText)findViewById(R.id.edtTotal2);
        edtTotal3 = (EditText)findViewById(R.id.edtTotal3);
        edtTotal4 = (EditText)findViewById(R.id.edtTotal4);
        edtTotal5 = (EditText)findViewById(R.id.edtTotal5);
        edtTotal6 = (EditText)findViewById(R.id.edtTotal6);
        edtTotal7 = (EditText)findViewById(R.id.edtTotal7);
        edtTotal8 = (EditText)findViewById(R.id.edtTotal8);
        edtTotal9 = (EditText)findViewById(R.id.edtTotal9);
        edtTotal10 = (EditText)findViewById(R.id.edtTotal10);


        edtQtd1 = (EditText)findViewById(R.id.edtvalor1);
        edtQtd2 = (EditText)findViewById(R.id.edtvalor2);
        edtQtd3 = (EditText)findViewById(R.id.edtvalor3);
        edtQtd4 = (EditText)findViewById(R.id.edtvalor4);
        edtQtd5 = (EditText)findViewById(R.id.edtvalor5);
        edtQtd6 = (EditText)findViewById(R.id.edtvalor6);
        edtQtd7 = (EditText)findViewById(R.id.edtvalor7);
        edtQtd8 = (EditText)findViewById(R.id.edtvalor8);
        edtQtd9 = (EditText)findViewById(R.id.edtvalor9);
        edtQtd10 = (EditText)findViewById(R.id.edtvalor10);

        todosPrecos.add(edtvalor1);
        todosPrecos.add(edtvalor2);
        todosPrecos.add(edtvalor3);
        todosPrecos.add(edtvalor4);
        todosPrecos.add(edtvalor5);
        todosPrecos.add(edtvalor6);
        todosPrecos.add(edtvalor7);
        todosPrecos.add(edtvalor8);
        todosPrecos.add(edtvalor9);
        todosPrecos.add(edtvalor10);


        todasQtds.add(edtQtd1);
        todasQtds.add(edtQtd2);
        todasQtds.add(edtQtd3);
        todasQtds.add(edtQtd4);
        todasQtds.add(edtQtd5);
        todasQtds.add(edtQtd6);
        todasQtds.add(edtQtd7);
        todasQtds.add(edtQtd8);
        todasQtds.add(edtQtd9);
        todasQtds.add(edtQtd10);

        todosResultados.add(edtTotal1);
        todosResultados.add(edtTotal2);
        todosResultados.add(edtTotal3);
        todosResultados.add(edtTotal4);
        todosResultados.add(edtTotal5);
        todosResultados.add(edtTotal6);
        todosResultados.add(edtTotal7);
        todosResultados.add(edtTotal8);
        todosResultados.add(edtTotal9);
        todosResultados.add(edtTotal10);


        int idPlano = Singleton.getInstance().getIdPlano();
        int idOperadora = Singleton.getInstance().getIdOperadora();
        int idProduto = Singleton.getInstance().getIdProduto();



        PrecoDAO dao = new PrecoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  preco where id_produto = "+idProduto+" and id_plano = "+idPlano+" and id_operadora = "+idOperadora;
        List<Preco> precos = dao.recuperarPorQuery(query);
        Log.d("log_tag_query", query);
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
                qtd=0;
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
            res+= Double.parseDouble(e.getText().toString().replace(",","."));

        }

        Singleton.getInstance().setQtds(qtds);
        Singleton.getInstance().setResultados(res);



        if(Singleton.getInstance().isEmpresaGrande()==false && qtds>qtdMaxima)
        {
            Toast.makeText(this, "Qtd de pessoas "+ qtds+" excede a quantidade maxima permitida de "+qtdMaxima, Toast.LENGTH_LONG).show();
        }
        else if(Singleton.getInstance().isEmpresaGrande() && qtds<=qtdMaxima)
        {
            Toast.makeText(this, "Qtd de pessoas "+ qtds+" é menor do que a quantidade minima necessária de "+(qtdMaxima+1), Toast.LENGTH_LONG).show();
        }
        else{
            Intent it = new Intent(Tabelagrid.this, Totalsimulado.class);
            startActivity(it);
        }
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
            try {
                qtd = Integer.parseInt(edtqtd.getText().toString());
            } catch (Exception ex) {
                qtd = 0;
            }


            NumberFormat nf = new DecimalFormat("#0.00");

            resultado.setText("" + (nf.format(qtd * preco)));


        }
    }

}

