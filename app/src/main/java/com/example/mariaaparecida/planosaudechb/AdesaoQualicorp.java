package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class AdesaoQualicorp extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.adesaoqualicorp_antigo);
        else
        setContentView(R.layout.adesaoqualicorp);
    }

    public void chamaAmilSupremoQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(7);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpAmilSupremo.class);
        startActivity(it);
    }
    public void chamaBradescoPremiumQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(8);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoqualicorpBradescoPremium.class);
        startActivity(it);
    }

    public void chamaAmilPremiumQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(6);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpAmilPremium.class);
        startActivity(it);
    }

    public void chamaBradescoSupremoQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(9);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpBradescoSupremo.class);
        startActivity(it);
    }


    public void chamaSulamericaPremiumQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(12);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpSulamericaPremium.class);
        startActivity(it);
    }
    public void chamaSulamericaSupremoQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(13);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpSulamericaSupremo.class);
        startActivity(it);
    }

    public void chamaOneHealthPremiumQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(60);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoOneHealthPremiumqualicorp.class);
        startActivity(it);
    }
    public void chamaOneHealthSupremoQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(61);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoOneHealthSupremoQualicorp.class);
        startActivity(it);
    }

    public void chamaPromedumQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(59);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpPromedum.class);
        startActivity(it);
    }

    public void chamaSulamericahospitalarQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(59);
        Intent it = new Intent(AdesaoQualicorp.this,EscolherSulamericaHospitalarQ.class);
        startActivity(it);
    }
}

