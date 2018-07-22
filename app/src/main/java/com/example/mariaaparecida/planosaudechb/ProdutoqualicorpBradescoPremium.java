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
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoqualicorpBradescoPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoqualicorpbradescopremium_antigo);
        else
        setContentView(R.layout.produtoqualicorpbradescopremium);
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

    public void chamaEfetivoBradescoPremium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,421,423,420,422);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }



    public void chamaTopNacionalBradescoPremium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,56,49,55,48);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexBradescoPremium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,54,47,53,46);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus1Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,57,50);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopPlus2Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,58,51);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus3Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,59,52);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
