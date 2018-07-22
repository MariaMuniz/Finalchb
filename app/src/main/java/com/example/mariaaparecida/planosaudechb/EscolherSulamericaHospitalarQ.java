package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 25/06/2018.
 */

public class EscolherSulamericaHospitalarQ extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.escolhersulamericahospitalarq_antigo);
        else


            setContentView(R.layout.escolhersulamericahospitalarq);
    }


    public void chamaPremiumSulamericaHospitalar(View v) {
        Singleton.getInstance().setIdOperadora(62);
        Intent it = new Intent(EscolherSulamericaHospitalarQ.this,ProdutoPremiumSulamericaQ.class);
        startActivity(it);
    }

    public void chamaSupremoSulamericaHospitalar(View v) {
        Singleton.getInstance().setIdOperadora(63);
        Intent it = new Intent(EscolherSulamericaHospitalarQ.this,ProdutoSupremoSulamericaQ.class);
        startActivity(it);
    }
}
