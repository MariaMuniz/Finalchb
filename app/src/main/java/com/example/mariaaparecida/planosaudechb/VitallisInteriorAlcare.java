package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 01/05/2018.
 */

public class VitallisInteriorAlcare  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.vitallisalcareinterior_antigo);
        else

            setContentView(R.layout.vitallisalcareinterior);
    }

    public void chamaEssencilIIAptAlcare(View v) {
        Singleton.getInstance().setIdProduto(336);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(VitallisInteriorAlcare.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaEssencial1EnfAlcare(View v) {
        Singleton.getInstance().setIdProduto(335);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(VitallisInteriorAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
}
