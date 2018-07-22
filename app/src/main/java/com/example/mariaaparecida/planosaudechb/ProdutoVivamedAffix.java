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

public class ProdutoVivamedAffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtovivamedaffix_antigo);
        else
            setContentView(R.layout.produtovivamedaffix);
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

    public void chamaEssencialVivamedAffix(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,7,8);
        Intent it = new Intent(ProdutoVivamedAffix.this,Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealVivamedAffix(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,9,281);
        Intent it = new Intent(ProdutoVivamedAffix.this,Tabelagrid.class);
        startActivity(it);
    }

}
