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

public class Adesaoaffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.adesaoaffix_antigo);
        else
        setContentView(R.layout.adesaoaffix);
    }
    public void chamaProdutoSaudeSistemaAffix(View v) {
        Singleton.getInstance().setIdOperadora(2);
        Intent it = new Intent(Adesaoaffix.this,ProdutoSaudeSistemaAffix.class);
        startActivity(it);
    }
    public void chamaProdutSampAffix(View v) {
        Singleton.getInstance().setIdOperadora(1);
        Intent it = new Intent(Adesaoaffix.this,ProdutoSampAffix.class);
        startActivity(it);
    }

    public void chamaProdutoVivamedAffix (View v) {
        Singleton.getInstance().setIdOperadora(3);
        Intent it = new Intent(Adesaoaffix.this,ProdutoVivamedAffix.class);
        startActivity(it);
    }



}