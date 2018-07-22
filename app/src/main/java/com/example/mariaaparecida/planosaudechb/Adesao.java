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

public class Adesao extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.adesao_antigo);
        else
        setContentView(R.layout.adesao);
        Singleton.getInstance().setQtdMaximaDePessoas(999999);
    }


    public void chamaAdesaoAffix(View v) {
        Singleton.getInstance().setIdPlano(1);
        Intent it = new Intent(Adesao.this, Adesaoaffix.class);
        startActivity(it);
    }

    public void chamaAdesaoAlcare(View v) {
        Singleton.getInstance().setIdPlano(2);
        Intent it = new Intent(Adesao.this, AdesaoAlcare.class);
        startActivity(it);
    }

    public void chamaAdesaoQualicorp(View v) {
        Singleton.getInstance().setIdPlano(4);
        Intent it = new Intent(Adesao.this, AdesaoQualicorp.class);
        startActivity(it);
    }



}
