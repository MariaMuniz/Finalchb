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
 * Created by Maria Aparecida on 27/04/2018.
 */

public class ProdutoMedSenior  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtomedsenior_antigo);
        else
        setContentView(R.layout.produtomedsenior);

        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void chamaAmetistaMedSenior(View v) {
        Singleton.getInstance().setIdProduto(334);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoMedSenior.this, TabelaMedSenior.class);
        startActivity(it);

    }

    public void chamaTopazioMedSenior(View v) {
        Singleton.getInstance().setIdProduto(333);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutoMedSenior.this, TabelaMedSenior.class);
        startActivity(it);

    }
}