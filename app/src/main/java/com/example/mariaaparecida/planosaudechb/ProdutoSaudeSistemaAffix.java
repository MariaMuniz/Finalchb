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

public class ProdutoSaudeSistemaAffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosaudesistemaaffix_antigo);
        else

            setContentView(R.layout.produtosaudesistemaaffix);
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

    public void chamaConsaude(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,3,4);
        Intent it = new Intent(ProdutoSaudeSistemaAffix.this, Tabelagrid.class);
        startActivity(it); }

    public void chamaSaudeMulti(View v){
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,5,6);
                Intent it = new Intent(ProdutoSaudeSistemaAffix.this, Tabelagrid.class);
                startActivity(it);
            }
    }