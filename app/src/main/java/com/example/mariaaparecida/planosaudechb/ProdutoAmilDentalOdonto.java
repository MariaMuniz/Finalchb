package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class ProdutoAmilDentalOdonto extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoamildentalodonto_antigo);
        else
        setContentView(R.layout.produtoamildentalodonto);
    }

    public void chamaPessoaFisica(View v) {
        Intent it = new Intent(ProdutoAmilDentalOdonto.this, ProdutoAmilDentalFisica.class);
        startActivity(it);
    }
    public void chamaPessoaJuridica(View v) {
        Intent it = new Intent(ProdutoAmilDentalOdonto.this, ProdutoAmilDentalJuridica.class);
        startActivity(it);
    }
        }