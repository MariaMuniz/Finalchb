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
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoSaudeSistemaEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosaudesistemaempresa_antigo);
        else

            setContentView(R.layout.produtosaudesistemaempresa);
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
/*
    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.coper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(true);

                }

                break;
            case R.id.semcoper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(false);
                }
                break;
        }
    }
*/
    public void chamaEssencialPrimeEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,199,200);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaClassico180Empresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,193,194);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaClassico200Empresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,195,196);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaMasterEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,197,198);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

}

