package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoVitallisEmpresa extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtovitallisempresa_antigo);
        else
        setContentView(R.layout.produtovitallisempresa);
    }


    public void chamaPlatinaAptVitallisEmpesa(View v) {
        Singleton.getInstance().setIdProduto(211);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoVitallisEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlatinaEnfVitallisEmpresa(View v) {
        Singleton.getInstance().setIdProduto(213);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutoVitallisEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaExclusivoVitallisEmpresa(View v) {
        Singleton.getInstance().setIdProduto(212);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoVitallisEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
