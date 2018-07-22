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
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoUnimedEmpresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.produtounimedempresas_antigo);
        else

            setContentView(R.layout.produtounimedempresas);
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
    public void chamaUnipartFlex30(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,205,206);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex50(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,209,210);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnimax(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,203,204);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlenoUnimedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,201,202);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUniFacilFlex300 (View v) {
        Singleton.getInstance().setIdProduto(207);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnifacilFlex50(View v) {
        Singleton.getInstance().setIdProduto(208);
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }


}


