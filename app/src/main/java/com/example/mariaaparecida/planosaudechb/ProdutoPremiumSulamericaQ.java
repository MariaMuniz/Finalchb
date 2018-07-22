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
 * Created by Maria Aparecida on 25/06/2018.
 */

public class ProdutoPremiumSulamericaQ extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtopremiumsulamericaq_antigo);
        else

            setContentView(R.layout.produtopremiumsulamericaq);
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

    public void chamaExatoPremiumSulamerica(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,406,407);
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEspecialcemPremiumSulamerica(View v) {
        Singleton.getInstance().setIdProduto(408);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem1PremiumSulamerica(View v) {
        Singleton.getInstance().setIdProduto(409);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem2PremiumSulamerica(View v) {
        Singleton.getInstance().setIdProduto(410);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo1PremiumSulamerica(View v) {
        Singleton.getInstance().setIdProduto(411);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo2PremiumSulamerica(View v) {
        Singleton.getInstance().setIdProduto(412);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoPremiumSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
}
