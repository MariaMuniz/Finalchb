package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import Dao.PrecoDAO;
import Dao.ProdutoDAO;
import Entidades.Preco;
import Entidades.Produto;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class PrecoOdonto extends Activity {

     private TextView textnomeplano;
    private ImageView imagemoperadora;
    private TextView textnomeproduto;
    private TextView textprecodonto;

    private ArrayList<ImageView> todasoperadoras = new ArrayList<>();
    private ArrayList<TextView> todosPlanos = new ArrayList<>();
    private ArrayList<EditText> todosPrecos = new ArrayList<>();
    private ArrayList<EditText> todosprodutos = new ArrayList<>();
    private ArrayList<EditText> todosResultados = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.precoodonto);



        TextView textView  = (TextView) findViewById(R.id.textnomeplano);
        ImageView imageView = (ImageView) findViewById(R.id.imagemoperadora);
        textnomeproduto = (TextView) findViewById(R.id.textnomeproduto);
        textprecodonto = (TextView) findViewById(R.id.textprecodonto);


        int idPlano = Singleton.getInstance().getIdPlano();

        switch (idPlano) {
            case 1:
                textView.setText("Adesão Affix");
                break;
            case 2:
                textView.setText("Adesão Alcare");
                break;
            case 3:
                textView.setText("Adesão Bem Benefícios");
                break;
            case 4:
                textView.setText("Adesão Qualicorp");
                break;
            case 5:
                textView.setText("Ambulatorial");
                break;
            case 6:
                textView.setText("Empresarial");
                break;
            case 7:
                textView.setText("EmpresarialII");
                break;
            case 8:
                textView.setText("Individual");
                break;
            case 9:
                textView.setText("Odontológico");
                break;
        }
        todosPlanos.add(textnomeplano);


        int idOperadora = Singleton.getInstance().getIdOperadora();

        switch (idOperadora)
        {
            case 1:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 2:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 3:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 4:
                imageView.setImageResource(R.drawable.bradescosaude);
                break;
            case 5:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 6:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 7:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 8:
                imageView.setImageResource(R.drawable.bradescoseguros);
                break;
            case 9:
                imageView.setImageResource(R.drawable.bradescoseguros);
                break;
            case 10:
                imageView.setImageResource(R.drawable.caixa);
                break;
            case 11:
                imageView.setImageResource(R.drawable.caixa);
                break;
            case 12:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 13:
                imageView.setImageResource(R.drawable.sulamerica);
                break;
            case 14:
                imageView.setImageResource(R.drawable.premium);
                break;
            case 15:
                imageView.setImageResource(R.drawable.premium);
                break;
            case 16:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 17:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 19:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 20:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 21:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 22:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 23:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 24:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 25:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 44:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 45:
                imageView.setImageResource(R.drawable.amil);
                break;
            case 46:
                imageView.setImageResource(R.drawable.onehealth);
                break;
            case 47:
                imageView.setImageResource(R.drawable.promed);
                break;
            case 48:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
            case 49:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 50:
                imageView.setImageResource(R.drawable.goodlife);
                break;
            case 51:
                imageView.setImageResource(R.drawable.unimed);
                break;
            case 52:
                imageView.setImageResource(R.drawable.vitallis);
                break;
            case 54:
                imageView.setImageResource(R.drawable.amildental);
                break;
            case 55:
                imageView.setImageResource(R.drawable.prevident);
                break;
            case 56:
                imageView.setImageResource(R.drawable.samp);
                break;
            case 57:
                imageView.setImageResource(R.drawable.vivamed);
                break;
            case 58:
                imageView.setImageResource(R.drawable.saudesistema);
                break;
        }

        todasoperadoras.add(imagemoperadora);




        int idProduto = Singleton.getInstance().getIdProduto();
        ProdutoDAO dao = new ProdutoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  produto where idProduto = "+idProduto;
        List<Produto> produtos = dao.recuperarPorQuery(query);
        Log.d("log_tag_query", query);
        if(produtos.size()==0)
        {
            Toast.makeText(this,"Erro ao executar query = "+query, Toast.LENGTH_LONG);
            return;
        }
        else{
            textnomeproduto.setText(""+produtos.get(0).getNomeProdutol());
        }

        PrecoDAO dao2 = new PrecoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query2 = "SELECT * FROM  preco where id_produto = "+idProduto+" and id_plano = "+idPlano+" and id_operadora = "+idOperadora;
        List<Preco> precos = dao2.recuperarPorQuery(query2);
        Log.d("log_tag_query", query2);
        if(precos.size()==0)
        {
            Toast.makeText(this,"Erro ao executar query = "+query2, Toast.LENGTH_LONG);
            return;
        }
        for(Preco r : precos)
        {
            Log.d("log_tag","P = "+r.toString());
        }

        textprecodonto.setText("R$"+precos.get(0).getValor());
        NumberFormat nf = new DecimalFormat("#0.00");
        String valor = (nf.format(precos.get(0).getValor()));

        textprecodonto.setText("R$"+valor);
    }

    }


