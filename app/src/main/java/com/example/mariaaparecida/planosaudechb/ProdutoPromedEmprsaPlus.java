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

public class ProdutoPromedEmprsaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtopromedempresaplus_antigo);
        else
        setContentView(R.layout.produtopromedempresaplus);
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


    public void chamaConfortPromedEmpresaplus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,252,258,251,257);
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, TabelaPromed.class);
        startActivity(it);
    }
    public void chamaSelectPromedEmpresaplus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,248,254,247,253);
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, TabelaPromed.class);
        startActivity(it);
    }
    public void chamaLifePromedEmpresaplus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,250,256,249,255);
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, TabelaPromed.class);
        startActivity(it);
    }

}

