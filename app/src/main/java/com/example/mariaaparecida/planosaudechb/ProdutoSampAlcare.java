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

public class ProdutoSampAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosampalcare_antigo);
        else

            setContentView(R.layout.produtosampalcare);
    }

    public void chamaIdealPlusAlcare(View v) {
        Singleton.getInstance().setIdProduto(19);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoSampAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealAlcare(View v) {
        Singleton.getInstance().setIdProduto(18);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutoSampAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
}
