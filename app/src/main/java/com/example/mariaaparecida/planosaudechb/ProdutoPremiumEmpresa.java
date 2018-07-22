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
 * Created by Maria Aparecida on 20/07/2018.
 */

public class ProdutoPremiumEmpresa  extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtopremiumempresa_antigo);
        else


            setContentView(R.layout.produtopremiumempresa);

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


    public void chamaPersonnalitePremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,426,427);
        Intent it = new Intent(ProdutoPremiumEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaPlatinumPremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,428,429);
        Intent it = new Intent(ProdutoPremiumEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaInfinityPremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,430,431);
        Intent it = new Intent(ProdutoPremiumEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
