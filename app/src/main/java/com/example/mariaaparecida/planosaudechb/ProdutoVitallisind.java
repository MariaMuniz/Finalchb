package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 08/01/2018.
 */

public class ProdutoVitallisind extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallis);



        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtovitallis_antigo);
        else
            setContentView(R.layout.produtovitallis);

        TextView mLink = (TextView) findViewById(R.id.link);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
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


    public void chamaExclusivoIndividual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,342,341);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPlusIndividual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,344,343);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaIntegralIndividual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,291,290);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaVitalidadeIndividual(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,293,292);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
}

