package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Laboratorial extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.laboratorial_antigo);
        else
        setContentView(R.layout.laboratorial);
            Singleton.getInstance().setQtdMaximaDePessoas(999999);
    }

    public void chamaPremiumAmbulatorialIndividual(View v) {
        Singleton.getInstance().setIdOperadora(15);
        Intent it = new Intent(Laboratorial.this, ProdutoPremiumAmbInd.class);
        startActivity(it);
    }


    public void chamaProdutoAmbulatorialGood(View v) {
        Singleton.getInstance().setIdOperadora(16);
        Intent it = new Intent(Laboratorial.this, ProdutoAmbulatorialGood.class);
        startActivity(it);
    }

    public void chamaProdutoAmbPromed(View v) {
        Singleton.getInstance().setIdOperadora(40);
        Intent it = new Intent(Laboratorial.this, ProdutoAmbPromed.class);
        startActivity(it);
    }

}
