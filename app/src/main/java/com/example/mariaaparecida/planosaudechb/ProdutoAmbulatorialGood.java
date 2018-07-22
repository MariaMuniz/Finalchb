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

public class ProdutoAmbulatorialGood extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoambulatorialgood_antigo);
        else

            setContentView(R.layout.produtoambulatorialgood);
    }

    public void chamaStoneAmb(View v) {
        Singleton.getInstance().setIdProduto(146);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoAmbulatorialGood.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEsmeraldaAmb(View v) {
        Singleton.getInstance().setIdProduto(340);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoAmbulatorialGood.this, Tabelagrid.class);
        startActivity(it);
    }
}
