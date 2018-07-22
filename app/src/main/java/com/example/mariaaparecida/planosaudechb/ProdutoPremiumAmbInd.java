package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 01/02/2018.
 */

public class ProdutoPremiumAmbInd extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtopremiumambind_antigo);
        else
        setContentView(R.layout.produtopremiumambind);
    }
    public void chamaOuroPremiumIndividualAmb(View v) {
        Singleton.getInstance().setIdProduto(138);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoPremiumAmbInd.this, TabelaGiridAmbulatorial.class);
        startActivity(it);
    }

    public void chamaPremiumPrataIndividualAmb(View v) {
        Singleton.getInstance().setIdProduto(139);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoPremiumAmbInd.this, TabelaGiridAmbulatorial.class);
        startActivity(it);
    }

    public void chamaPlatinaPremiumAmbIndividual(View v) {
        Singleton.getInstance().setIdProduto(134);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoPremiumAmbInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBronzePremiumAmbIndividual(View v) {
        Singleton.getInstance().setIdProduto(135);
        Singleton.getInstance().setAcomodacao("Sem internação");
        Intent it = new Intent(ProdutoPremiumAmbInd.this, Tabelagrid.class);
        startActivity(it);
    }
}
