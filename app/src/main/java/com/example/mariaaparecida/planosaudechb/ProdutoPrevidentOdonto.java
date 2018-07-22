package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class ProdutoPrevidentOdonto  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoprevidenteodonto_antigo);
        else

            setContentView(R.layout.produtoprevidenteodonto);
    }

    public void chamaDiamondPrevident(View v) {
        Singleton.getInstance().setIdProduto(298);
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }

    public void chamaPlatinumPrevident(View v) {
        Singleton.getInstance().setIdProduto(299);
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaOuroPrevident(View v) {
        Singleton.getInstance().setIdProduto(300);
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }
}
