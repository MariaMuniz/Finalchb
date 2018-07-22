package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import Entidades.Singleton;


public class Fragment05 extends Fragment implements View.OnClickListener {
    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Cotação");
        View v;
        if(Build.VERSION.SDK_INT<23)
            v = inflater.inflate(R.layout.fragment_fragment05_androidantigo, container, false);
        else
            v = inflater.inflate(R.layout.fragment_fragment05, container, false);



        ImageView mButton = (ImageView) v.findViewById(R.id.individual);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.variasempresas);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.laboratorial);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.adesao);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.odonto);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.informacoes);
        mButton.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {
        Intent it;

        switch (v.getId()) {
            case R.id.individual:
                Singleton.getInstance().setIdPlano(8);
                it = new Intent(activity, Individual.class);
                break;
            case R.id.laboratorial:
                //AMBULATORIAL NE???
                Singleton.getInstance().setIdPlano(5);
                it = new Intent(activity, Laboratorial.class);
                break;
            case R.id.variasempresas:
                //Na proxima tela que eh escolhido se eh o plano empresarial 1 id = 6 ou o 2 que id = 7 entao setId eh feito em Variasempresas.class
                it = new Intent(activity, Variasempresas.class);
                break;
            case R.id.adesao:
                //Na proxima tela que eh escolhido se eh o plano adesao aflix,allcare,bem ou qualicorp entao eh setado na tela Adesao.class
                it = new Intent(activity, Adesao.class);
                break;
            case R.id.odonto:
                Singleton.getInstance().setIdPlano(9);
                it = new Intent(activity, Odontologico.class);
                break;
            case R.id.informacoes:
               it = new Intent(activity,Informacoes.class);
               break;
            default:
                it = new Intent(activity, Individual.class);
                break;
        }

        startActivity(it);
    }



}
