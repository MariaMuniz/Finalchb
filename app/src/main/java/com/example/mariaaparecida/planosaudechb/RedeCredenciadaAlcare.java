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

public class RedeCredenciadaAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.redecredenciadaalcare_antigo);
        else

            setContentView(R.layout.redecredenciadaalcare);
    }
    public void chamaBradescoAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(4);
        Intent it = new Intent(RedeCredenciadaAlcare.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaVivamedAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(57);
        Intent it = new Intent(RedeCredenciadaAlcare.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaSampAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(56);
        Intent it = new Intent(RedeCredenciadaAlcare.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaVitallisAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(5);
        Intent it = new Intent(RedeCredenciadaAlcare.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaUnimedAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(42);
        Intent it = new Intent(RedeCredenciadaAlcare.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamavitallisAlcareRede(View v) {
        Singleton.getInstance().setIdOperadora(26);
        Intent it = new Intent(RedeCredenciadaAlcare.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
}
