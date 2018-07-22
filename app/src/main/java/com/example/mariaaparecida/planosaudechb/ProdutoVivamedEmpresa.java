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
 * Created by Maria Aparecida on 16/04/2018.
 */

public class ProdutoVivamedEmpresa extends Activity { @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (Build.VERSION.SDK_INT < 23)
        setContentView(R.layout.produtovivamedempresa_antigo);
    else

        setContentView(R.layout.produtovivamedempresa);

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

    public void chamaVivaVivamedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this, 282, 283);
        Intent it = new Intent(ProdutoVivamedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
     public void chamaVivaVivamedEmpresaPlus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this, 337, 338);
        Intent it = new Intent(ProdutoVivamedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealVivamedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this, 215, 216);
        Intent it = new Intent(ProdutoVivamedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEssencialEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this, 217, 218);
        Intent it = new Intent(ProdutoVivamedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

}
