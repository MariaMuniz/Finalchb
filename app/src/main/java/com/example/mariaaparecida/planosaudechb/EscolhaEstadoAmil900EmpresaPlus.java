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
 * Created by Maria Aparecida on 09/05/2018.
 */

public class EscolhaEstadoAmil900EmpresaPlus extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.esolhaestadoamil900_antigo);
        else


            setContentView(R.layout.esolhaestadoamil900);
    }

    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
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


    public void chamaSPAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 385, 373);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaSPinteriorAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 386, 374);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaRJESAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 387, 375);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaDFGOAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 388, 376);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPRSCRSAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 389, 377);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaMGAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 390, 378);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPEAMMAPAAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 391, 372);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaRNPBSAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 382, 379);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCEAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 383, 380);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBAAmil900EmpresaPlus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 384, 381);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolhaEstadoAmil900EmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }



}

