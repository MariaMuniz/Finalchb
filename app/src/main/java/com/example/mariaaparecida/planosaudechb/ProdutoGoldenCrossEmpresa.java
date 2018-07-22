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
 * Created by Maria Aparecida on 07/04/2018.
 */

public class ProdutoGoldenCrossEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtogoldencrossempresa_antigo);
        else

            setContentView(R.layout.produtogoldencrossempresa);
    }

    public void onRadioButtonClicked(View view) {
        String acomodacao = "";
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.apt:
                if (checked) {
                    Singleton.getInstance().setAcomodacao("Apartamento");
                }

                break;
            case R.id.enf:
                if (checked) {
                    Singleton.getInstance().setAcomodacao("Enfermaria");
                    ;
                }

                break;
        }
    }

    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
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

//falta coparticipacao

    public void chamaEssencial6vGoldencross(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this, 326, 318, 324, 316);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoGoldenCrossEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaEspecial6vGoldencross(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this, 330, 322, 328, 320);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoGoldenCrossEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }



}