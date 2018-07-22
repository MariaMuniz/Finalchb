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
 * Created by Maria Aparecida on 24/01/2018.
 */

public class ProdutoAmilDentalJuridica  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoamildentajuridica_antigo);
        else
        setContentView(R.layout.produtoamildentajuridica);
        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void chamaPorteum(View v) {
        Singleton.getInstance().setIdProduto(294);
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaPortedois(View v) {
        Singleton.getInstance().setIdProduto(295);
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaProtesePME(View v) {
        Singleton.getInstance().setIdProduto(349);
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaWinOrto(View v) {
        Singleton.getInstance().setIdProduto(350);
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }



}

