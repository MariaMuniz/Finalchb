package com.example.mariaaparecida.planosaudechb;


import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

import Entidades.Singleton;


public class Fragment03 extends Fragment implements View.OnClickListener{


    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2,spinner;
    public Activity activity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Rede credenciada");
        View v;
        if(Build.VERSION.SDK_INT<23)
            v = inflater.inflate(R.layout.fragment_fragment03_antigo, container, false);
        else

         v = inflater.inflate(R.layout.fragment_fragment03, container, false);


        ImageView mButton = (ImageView) v.findViewById(R.id.redecredenciadaindividual);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.redecredenciadaempresa);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.redecredenciadalaboratorial);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.redecredenciadaadesao);
        mButton.setOnClickListener(this);

       // mButton = (ImageView) v.findViewById(R.id.odonto);
       // mButton.setOnClickListener(this);

       // mButton = (ImageView) v.findViewById(R.id.informacoes);
      //  mButton.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        Intent it;

        switch (v.getId()) {
            case R.id.redecredenciadaindividual:
                Singleton.getInstance().setIdPlano(8);
                it = new Intent(activity, RedeCredenciadaIndividual.class);
                break;
            case R.id.redecredenciadalaboratorial:
                //AMBULATORIAL NE???
                Singleton.getInstance().setIdPlano(5);
                it = new Intent(activity, RedeCredenciadaLaboratorial.class);
                break;
            case R.id.redecredenciadaempresa:
                //Na proxima tela que eh escolhido se eh o plano empresarial 1 id = 6 ou o 2 que id = 7 entao setId eh feito em Variasempresas.class
                Singleton.getInstance().setIdPlano(6);
                it = new Intent(activity, RedeCredenciadaEmpresa.class);
                break;
            default:
            case R.id.redecredenciadaadesao:
                //Na proxima tela que eh escolhido se eh o plano adesao aflix,allcare,bem ou qualicorp entao eh setado na tela Adesao.class
                it = new Intent(activity, RedeCredenciadaAdesao.class);
                break;
            // case R.id.odonto:
            //  Singleton.getInstance().setIdPlano(9);
            //  it = new Intent(activity, Odontologico.class);
            //  break;
            // case R.id.informacoes:
            //    it = new Intent(activity,Informacoes.class);
            //         break;
            // default:
            ////  it = new Intent(activity, Individual.class);
            //break;
        }

        startActivity(it);

    }
}