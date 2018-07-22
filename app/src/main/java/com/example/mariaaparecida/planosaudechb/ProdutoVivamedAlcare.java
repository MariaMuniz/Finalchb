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

public class ProdutoVivamedAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtovivamedalcare_antigo);
        else


            setContentView(R.layout.produtovivamedalcare);
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

    public void chamaEssencialVivamedAlcare(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,20,21);
        Intent it = new Intent(ProdutoVivamedAlcare.this,Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealVivamedAlcare(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,22,23);
        Intent it = new Intent(ProdutoVivamedAlcare.this,Tabelagrid.class);
        startActivity(it);
    }

}
