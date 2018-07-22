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

public class Empresaplus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.empresaplus_antigo);
        else
        setContentView(R.layout.empresaplus);
    }
    public void chamaSaudeSistemaEmpresaPlus(View v) {
        Singleton.getInstance().setIdOperadora(48);

        Intent it = new Intent(Empresaplus.this,ProdutoSaudeSistemaEmpresaPlus.class);
        startActivity(it);
    }
    public void chamaPromedEmpresaPlus(View v) {
        Singleton.getInstance().setIdOperadora(47);

        Intent it = new Intent(Empresaplus.this,ProdutoPromedEmprsaPlus.class);
        startActivity(it);
    }
    public void chamaUnimedEmpresaPlus(View v) {
        Singleton.getInstance().setIdOperadora(49);

        Intent it = new Intent(Empresaplus.this,ProdutoUnimedEmpresaPlus.class);
        startActivity(it);
    }
    public void chamaAmilEmpresaPlus(View v) {
        Singleton.getInstance().setIdOperadora(45);

        Intent it = new Intent(Empresaplus.this,ProdutoAmilEmpresaplus.class);
        startActivity(it);
    }
    public void chamaOnehealthEmpresaPlus(View v) {
        Singleton.getInstance().setIdOperadora(46);

        Intent it = new Intent(Empresaplus.this,ProdutoOneHealthEmpresaPlus.class);
        startActivity(it);
    }
}
