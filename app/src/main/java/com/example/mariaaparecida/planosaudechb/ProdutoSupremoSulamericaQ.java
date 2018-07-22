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

public class ProdutoSupremoSulamericaQ extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosupremosulamericaq_antigo);
        else

            setContentView(R.layout.produtosupremosulamericaq);
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


    public void chamaExatoSupremoSulamerica(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,413,414);
        Intent it = new Intent( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEspecialcemSupremoSulamerica(View v) {
        Singleton.getInstance().setIdProduto(415);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent ( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem1SupremoSulamerica(View v) {
        Singleton.getInstance().setIdProduto(416);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem2SupremoSulamerica(View v) {
        Singleton.getInstance().setIdProduto(417);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo1SupremoSulamerica(View v) {
        Singleton.getInstance().setIdProduto(418);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo2SupremoSulamerica(View v) {
        Singleton.getInstance().setIdProduto(419);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent( ProdutoSupremoSulamericaQ.this, Tabelagrid.class);
        startActivity(it);
    }
}
