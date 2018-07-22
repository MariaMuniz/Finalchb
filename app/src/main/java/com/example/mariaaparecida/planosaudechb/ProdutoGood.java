package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoGood extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtogood_antigo);
        else
        setContentView(R.layout.produtogood);


        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
    public void chamaOuroMaisGood(View v) {
        Singleton.getInstance().setIdProduto(339);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaOuroGood(View v) {
        Singleton.getInstance().setIdProduto(280);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataGood(View v) {
        Singleton.getInstance().setIdProduto(277);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPlatinaGood(View v) {
        Singleton.getInstance().setIdProduto(279);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBronzeGood(View v) {
        Singleton.getInstance().setIdProduto(278);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
}
