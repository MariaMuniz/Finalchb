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
 * Created by Maria Aparecida on 19/03/2018.
 */

public class ProdutoUnimedAlcare  extends Activity{



        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            if(Build.VERSION.SDK_INT<23)
                setContentView(R.layout.produtounimedalcare_antigo);
            else
        setContentView(R.layout.produtounimedalcare);
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
    public void chamaUnipartFlexEstadual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,310,312);
        Intent it = new Intent(ProdutoUnimedAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnimaxEstadual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,313,314);
        Intent it = new Intent(ProdutoUnimedAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnifacilUnimedAlcare(View v) {
        Singleton.getInstance().setIdProduto(311);
        Singleton.getInstance().setAcomodacao("Enfermaria");
        Intent it = new Intent(ProdutoUnimedAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

}
