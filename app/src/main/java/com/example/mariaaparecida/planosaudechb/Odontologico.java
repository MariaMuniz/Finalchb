package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class Odontologico extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.odontologico_antigo);
        else

            setContentView(R.layout.odontologico);
    }
    public void chamaAmilDental(View v) {
        Singleton.getInstance().setIdOperadora(54);
        Intent it = new Intent(Odontologico.this, ProdutoAmilDentalOdonto.class);
        startActivity(it);
    }
    public void chamaPrevident(View v) {
        Singleton.getInstance().setIdOperadora(55);
        Intent it = new Intent(Odontologico.this, ProdutoPrevidentOdonto.class);
        startActivity(it);
    }

}
