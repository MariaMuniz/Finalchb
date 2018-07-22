package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoVitallisAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtovitallisalcare_antigo);
        else
        setContentView(R.layout.produtovitallisalcare);
    }

    public void chamaEssencilaptAlcare(View v) {
        Singleton.getInstance().setIdProduto(25);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEssencialenfAlcare(View v) {
        Singleton.getInstance().setIdProduto(24);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaSanitasIAlcare(View v) {
        Singleton.getInstance().setIdProduto(331);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaSanitasIIAlcare(View v) {
        Singleton.getInstance().setIdProduto(332);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
}
