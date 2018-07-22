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

public class ProdutoQualicorpAmilSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoqualicorpamilsupremo_antigo);
        else

            setContentView(R.layout.produtoqualicorpamilsupremo);
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

    public void chamaAmil500Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,44,40);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,43,39,42,38);
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil700Supremo(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,45,41);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
