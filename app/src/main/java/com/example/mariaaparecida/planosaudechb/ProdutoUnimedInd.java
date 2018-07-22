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
import android.widget.Toast;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoUnimedInd extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtounimedind_antigo);
        else

        setContentView(R.layout.produtounimedind);

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


    public void chamaPleno(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,284,285);
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex30(View v) {

        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,286,287);

        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex50(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,288,289);
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }



}
