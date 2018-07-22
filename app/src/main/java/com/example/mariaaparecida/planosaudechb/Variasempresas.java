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

public class Variasempresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.variasempresas_antigo);
        else

            setContentView(R.layout.variasempresas);
    }


    public void chamaEmpresa(View v) {
        Singleton.getInstance().setIdPlano(6);
        Singleton.getInstance().setQtdMaximaDePessoas(29);
        Singleton.getInstance().setEmpresaGrande(false);
        Intent it = new Intent(Variasempresas.this, Empresa.class);
        startActivity(it);
    }


    public void chamaEmpresaplus(View v) {
        Singleton.getInstance().setQtdMaximaDePessoas(29);
        Singleton.getInstance().setEmpresaGrande(true);
        Singleton.getInstance().setIdPlano(7);
        Intent it = new Intent(Variasempresas.this, Empresaplus.class);
        startActivity(it);
    }
}