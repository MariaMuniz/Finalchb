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
 * Created by Maria Aparecida on 24/06/2018.
 */

public class ProdutoOneHealthPremiumqualicorp extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtoonehealthpremiumqualicorp_antigo);
        else


            setContentView(R.layout.produtoonehealthpremiumqualicorp);
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


    public void chamaLincxlt3Pqualicorp(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 398, 400);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOneHealthPremiumqualicorp.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt4Pqualicorp(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this, 399, 401);
        Singleton.getInstance().setAcomodacao("Apartamento");
        Intent it = new Intent(ProdutoOneHealthPremiumqualicorp.this, Tabelagrid.class);
        startActivity(it);
    }
}