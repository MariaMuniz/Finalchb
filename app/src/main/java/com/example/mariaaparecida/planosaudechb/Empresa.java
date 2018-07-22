package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Empresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT<23)
            setContentView(R.layout.empresa1_antigo);
        else


            setContentView(R.layout.empresa1);
    }

    public void chamaOneHealtEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(19);
        Intent it = new Intent(Empresa.this,ProdutoOnehealtEmpresas.class);
        startActivity(it);
    }
    public void chamaSampEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(23);
        Intent it = new Intent(Empresa.this,ProdutoSampEmpresas.class);
        startActivity(it);
    }
    public void chamaUnimedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(20);
        Intent it = new Intent(Empresa.this,ProdutoUnimedEmpresas.class);
        startActivity(it);
    }

    public void chamaVitalisEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(25);
        Intent it = new Intent(Empresa.this,ProdutoVitallisEmpresa.class);
        startActivity(it);
    }
    public void chamaPremiumEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(65);
        Intent it = new Intent(Empresa.this,ProdutoPremiumEmpresa.class);
        startActivity(it);
    }

    public void chamaGoodlifeEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(22);
        Intent it = new Intent(Empresa.this,ProdutogoodlifeEmpresa.class);
        startActivity(it);
    }

    public void chamaSaudeSistemaEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(24);
        Intent it = new Intent(Empresa.this,ProdutoSaudeSistemaEmpresa.class);
        startActivity(it);
    }

    public void chamaPromedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(21);
        Intent it = new Intent(Empresa.this,ProdutoPromedEmpresa.class);
        startActivity(it);
    }
    public void chamaAmilEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(17);
        Intent it = new Intent(Empresa.this,ProdutosAmil.class);
        startActivity(it);
    }
    public void chamaGoldenCrossEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(43);
        Intent it = new Intent(Empresa.this,GoldenCrossEscolher.class);
        startActivity(it);
    }

    public void chamaVivamedEmpresa(View v) {
        Singleton.getInstance().setIdOperadora(44);
        Intent it = new Intent(Empresa.this,ProdutoVivamedEmpresa.class);
        startActivity(it);
    }


    public void chamaBradescoEmpresa(View v) {
        Intent it = new Intent(Empresa.this,BradescoEmpresa.class);
        startActivity(it);
    }

    public void chamaSulamericaEmpresa(View v) {
        Intent it = new Intent(Empresa.this,SulamericaEmpresa.class);
        startActivity(it);
    }
}

