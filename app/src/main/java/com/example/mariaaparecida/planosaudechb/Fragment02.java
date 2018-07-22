package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
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

public class Fragment02 extends Fragment {
    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Consultar cobertura");
        final View v = inflater.inflate(R.layout.fragment_fragment02, container, false);

        return v;

    }

}