package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 02/02/2018.
 */

public class RedeCredenciadaEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.redecredenciadaempresa_antigo);
        else

            setContentView(R.layout.redecredenciadaempresa);
    }

    public void chamaOneHealtEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(19);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaSampEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(23);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaUnimedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(20);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaVitalisEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(25);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaGoodlifeEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(22);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaSaudeSistemaEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(24);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaPromedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(21);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaAmilEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(17);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaVivamedRedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(44);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaPremiumRedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(65);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaGoldenCrrossRedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(43);
        Intent it = new Intent(RedeCredenciadaEmpresa.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
}