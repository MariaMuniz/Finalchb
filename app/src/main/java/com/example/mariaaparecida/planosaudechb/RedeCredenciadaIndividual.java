package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.mariaaparecida.planosaudechb.R;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 01/02/2018.
 */

public class RedeCredenciadaIndividual extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.redecrecenciadaindividual_antigo);
        else



            setContentView(R.layout.redecrecenciadaindividual);
    }

    public void chamaProdutoVitallis(View v) {
        Singleton.getInstance().setIdOperadora(52);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaProdutoUnimed(View v) {
        Singleton.getInstance().setIdOperadora(51);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaRedmedisenior(View v) {
        Singleton.getInstance().setIdOperadora(41);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }


}
