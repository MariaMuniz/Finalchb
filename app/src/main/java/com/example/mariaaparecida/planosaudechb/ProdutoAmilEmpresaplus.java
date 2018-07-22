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

public class ProdutoAmilEmpresaplus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoamilempresaplus_antigo);
        else
        setContentView(R.layout.produtoamilempresaplus);
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



    public void chamaAmil200plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,228,222,227,221);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,230,224,229,223);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,231,225);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,232,226);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void  chamaAmil900EmpresaPlusEscolha (View v) {
        Singleton.getInstance().setIdOperadora(45);
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, EscolhaEstadoAmil900EmpresaPlus.class);
        startActivity(it);
    }

}
