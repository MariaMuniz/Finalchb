package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 05/02/2018.
 */

public class RedeCredenciadaLaboratorial extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.redecredenciadalaboratorial_antigo);
        else

            setContentView(R.layout.redecredenciadalaboratorial);
    }

    public void chamaPremiumAmbRedecred(View v) {
        Singleton.getInstance().setIdOperadora(14);
        Intent it = new Intent(RedeCredenciadaLaboratorial.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaPremiumAmbIndividualRedecred(View v) {
        Singleton.getInstance().setIdOperadora(15);
        Intent it = new Intent(RedeCredenciadaLaboratorial.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaGoodlifeAmbRedecred (View v) {
        Singleton.getInstance().setIdOperadora(16);
        Intent it = new Intent(RedeCredenciadaLaboratorial.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
}
