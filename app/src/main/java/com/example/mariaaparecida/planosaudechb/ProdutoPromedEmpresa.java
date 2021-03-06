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

public class ProdutoPromedEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtopromedempresa_antigo);
        else

            setContentView(R.layout.produtopromedempresa);
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

    public void chamaSelectPromedEmpresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,176,182,175,181);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }
    public void chamaLifePromedEmpresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,178,184,177,183);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }

    public void chamaConfortPromedEmpresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,180,186,179,185);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }

}
