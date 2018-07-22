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
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoBradescoAlcare extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtobradescoalcare_antigo);
        else

            setContentView(R.layout.produtobradescoalcare);
    }

    public void onRadioButtonClicked(View view) {
        String acomodacao = "";
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.apt:
                if (checked){
                    Singleton.getInstance().setAcomodacao("Apartamento");
                }

                break;
            case R.id.enf:
                if (checked){
                    Singleton.getInstance().setAcomodacao("Enfermaria");;
                }

                break;
        }
    }


    public void chamaTopNacionalAlcare(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,13,14);
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexAlcareAd(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,11,12);
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaTopPlus3Alcare(View v) {
        Singleton.getInstance().setIdProduto(15);
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaTopPlus4Alcare(View v) {
        Singleton.getInstance().setIdProduto(16);
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus6Alcare(View v) {
        Singleton.getInstance().setIdProduto(17);
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

}
