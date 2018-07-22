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

public class Individual extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.activity_individual_antigo);
        else
            setContentView(R.layout.activity_individual);


        Singleton.getInstance().setQtdMaximaDePessoas(999999);
    }

    public void chamaProdutoVitallis(View v) {
        Singleton.getInstance().setIdOperadora(52);
        Intent it = new Intent(Individual.this, ProdutoVitallisind.class);
        startActivity(it);
    }

    public void chamaProdutoGood(View v) {
        Singleton.getInstance().setIdOperadora(50);
        Intent it = new Intent(Individual.this, ProdutoGood.class);
        startActivity(it);
    }


    public void chamaProdutoUnimed(View v) {
        Singleton.getInstance().setIdOperadora(51);
        Intent it = new Intent(Individual.this, ProdutoUnimedInd.class);
        startActivity(it);
    }
    public void chamaProdutoMedSenior(View v) {
        Singleton.getInstance().setIdOperadora(41);
        Intent it = new Intent(Individual.this, ProdutoMedSenior.class);
        startActivity(it);
    }

    public void chamaProdutoVivamed(View v) {
        Singleton.getInstance().setIdOperadora(64);
        Intent it = new Intent(Individual.this, ProdutovivamedInd.class);
        startActivity(it);
    }

}
