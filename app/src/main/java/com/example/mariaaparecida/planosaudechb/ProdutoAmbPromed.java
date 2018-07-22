package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 17/02/2018.
 */

public class ProdutoAmbPromed extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoambpromed_antigo);
        else

            setContentView(R.layout.produtoambpromed);
    }

    public void chamaSlimIndividualPromed(View v) {
        Singleton.getInstance().setIdProduto(301);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoAmbPromed.this, Tabelagrid.class);
        startActivity(it);

    }
    public void chamaSlimEmpresarialPromed(View v) {
        Singleton.getInstance().setIdProduto(302);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoAmbPromed.this, TabelaPromed.class);
        startActivity(it);
    }
}
