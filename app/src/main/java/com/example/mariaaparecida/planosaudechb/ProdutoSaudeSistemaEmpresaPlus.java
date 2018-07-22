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
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoSaudeSistemaEmpresaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosaudesistemaempresaplus_antigo);
        else

            setContentView(R.layout.produtosaudesistemaempresaplus);
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


    public void chamaEssencialPrimeEmpresaplus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,248,254,247,253);
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,263,264);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaClassico180Empresaplus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,259,260);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaClassico200Empresaplus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,261,262);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaMasterEmpresaplus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,265,266);
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

}
