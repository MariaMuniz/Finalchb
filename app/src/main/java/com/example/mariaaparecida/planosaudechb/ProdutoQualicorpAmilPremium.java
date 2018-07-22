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

public class ProdutoQualicorpAmilPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoqualicorpamil_antigo);
        else
        setContentView(R.layout.produtoqualicorpamil);
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



    public void chamaAmil400Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoAcomodacao(this,35,31,34,30);
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,36,32);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700Premium(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,37,33);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
