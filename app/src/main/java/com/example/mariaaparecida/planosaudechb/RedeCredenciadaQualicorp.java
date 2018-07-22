package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.RedeCredenciada;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 02/02/2018.
 */

public class RedeCredenciadaQualicorp  extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.redecredenciadaqualicorp_antigo);
        else

            setContentView(R.layout.redecredenciadaqualicorp);
    }


    public void chamaBradescoPremiumQualicorpRedecred(View v) {
        Singleton.getInstance().setIdOperadora(8);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaAmilPremiumQualicorpRede(View v) {
        Singleton.getInstance().setIdOperadora(6);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }



    public void chamaSulamericaPremiumQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(12);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }


    public void chamaOneHealthQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(60);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaSulamericahospitalarQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(62);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

}
