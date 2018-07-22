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

public class ProdutoAmilDentalFisica  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoamildentalfisica_antigo);
        else


            setContentView(R.layout.produtoamildentalfisica);

        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void chamaCartaoAmil(View v) {
        Singleton.getInstance().setIdProduto(296);
        Intent it = new Intent(ProdutoAmilDentalFisica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaBoletoAmil(View v) {
        Singleton.getInstance().setIdProduto(297);
        Intent it = new Intent(ProdutoAmilDentalFisica.this, PrecoOdonto.class);
        startActivity(it);
    }

    public void chamaWinOrtoAmil(View v) {
        Singleton.getInstance().setIdProduto(348);
        Intent it = new Intent(ProdutoAmilDentalFisica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaWinProteseAmil(View v) {
        Singleton.getInstance().setIdProduto(347);
        Intent it = new Intent(ProdutoAmilDentalFisica.this, PrecoOdonto.class);
        startActivity(it);
    }
}
