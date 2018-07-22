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
 * Created by Maria Aparecida on 12/05/2018.
 */

public class EscolherEstadoAmil900Empresa extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.escolherestadoamil900empresa_antigo);
        else

            setContentView(R.layout.escolherestadoamil900empresa);
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


    public void chamaSPAmilEmpresa900(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 352, 364);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaSPinteriorAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 353, 365);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaRJESAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 354, 366);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaDFGOAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 355, 369);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPRSCRSAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 356, 370);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaMGAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 351, 367);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPEAMMAPAAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,357, 371);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaRNPBSAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 358, 370);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCEAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 359, 362);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBAAmil900Empresa(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 360, 363);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(EscolherEstadoAmil900Empresa.this, Tabelagrid.class);
        startActivity(it);
    }



}

