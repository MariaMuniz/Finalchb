package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoOnehealtEmpresas extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtosonehealtempresas_antigo);
        else
        setContentView(R.layout.produtosonehealtempresas);
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
    public void chamaLincxlt4(View v) {

        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,170,164);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt3(View v) {

        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,169,163);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt3(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,172,166);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt4(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,173,167);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBlackt5(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,174,168);
        Singleton.getInstance().setAcomodacao("Apartamento");
        startActivity(it);
    }

    public void chamaBlackt2(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,171,165);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }


}