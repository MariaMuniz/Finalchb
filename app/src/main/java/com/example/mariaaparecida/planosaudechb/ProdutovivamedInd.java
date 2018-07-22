package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 19/07/2018.
 */

public class ProdutovivamedInd extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallis);


        if (Build.VERSION.SDK_INT < 23)
            setContentView(R.layout.produtovivamedind_antigo);
        else
            setContentView(R.layout.produtovivamedind);

        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }


    public void chamaVivaIdealenf(View v) {
        Singleton.getInstance().setIdProduto(424);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutovivamedInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaVivaIdealapt(View v) {
        Singleton.getInstance().setIdProduto(425);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutovivamedInd.this, Tabelagrid.class);
        startActivity(it);
    }

}

