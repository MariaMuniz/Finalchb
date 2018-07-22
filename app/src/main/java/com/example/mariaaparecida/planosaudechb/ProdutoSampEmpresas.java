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

public class ProdutoSampEmpresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosampempresa_antigo);
        else
        setContentView(R.layout.produtosampempresa);
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
    public void chamaPreferencial(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,189,190);
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaRedeAmpla(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,191,192);
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaRedeAmplaSemObs(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,187,188);
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

}
