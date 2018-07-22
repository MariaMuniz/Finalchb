package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 07/04/2018.
 */

public class GoldenCrossEscolher  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.goldencrossescolher_antigo);
        else

            setContentView(R.layout.goldencrossescolher);
    }

    public void chama5vidasGoldenCross(View v) {
        Singleton.getInstance().setQtdMaximaDePessoas(5);
        Singleton.getInstance().setEmpresaGrande(false);
        Intent it = new Intent(GoldenCrossEscolher.this, ProdutoGoldenCrossMicroempresa.class);
        startActivity(it);
    }

    public void chama6vidasGoldenCross(View v) {
        Singleton.getInstance().setQtdMaximaDePessoas(29);
        Singleton.getInstance().setEmpresaGrande(false);
        Intent it = new Intent(GoldenCrossEscolher.this, ProdutoGoldenCrossEmpresa.class);
        startActivity(it);
    }

}
