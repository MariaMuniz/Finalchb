package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutogoodlifeEmpresa extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosgoodlifeempresas_antigo);
        else
        setContentView(R.layout.produtosgoodlifeempresas);
    }



    public void chamaMultiGood(View v) {
        Singleton.getInstance().setIdProduto(162);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGood(View v) {
        Singleton.getInstance().setIdProduto(161);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGoodlife(View v) {
        Singleton.getInstance().setIdProduto(159);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamasSemobstetricia(View v) {
        Singleton.getInstance().setIdProduto(160);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
