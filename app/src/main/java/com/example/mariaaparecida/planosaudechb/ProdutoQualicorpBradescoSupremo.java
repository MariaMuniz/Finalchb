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

public class ProdutoQualicorpBradescoSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoqualicorpbradescosupremo_antigo);
        else


            setContentView(R.layout.produtoqualicorpbradescosupremo);
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

    public void chamaPerfil1Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,61,70,60,69);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaTopNacionalSupremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,65,74,64,73);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexSupremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,63,72,62,71);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopNPlus1Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,66,75);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopNPlus2Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,67,76);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopNPlus3Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,68,77);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
