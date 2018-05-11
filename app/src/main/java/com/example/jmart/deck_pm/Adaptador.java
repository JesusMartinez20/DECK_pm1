package com.example.jmart.deck_pm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return arreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arreglo.get(i).id;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflate;
        inflate=LayoutInflater.from(context);
        View v=inflate.inflate(R.layout.cartas,null);
        TextView nombre=(TextView)v.findViewById(R.id.nombre);
        nombre.setText(arreglo.get(i).nombre);
        TextView descripcion=(TextView)v.findViewById(R.id.descripcion);
        descripcion.setText(arreglo.get(i).descripcion);
        ImageView imagen=(ImageView)v.findViewById(R.id.imagen);
        Picasso.with(context).load(arreglo.get(i).imagen).into(imagen);
        TextView puntos=(TextView)v.findViewById(R.id.Puntos);
        puntos.setText(arreglo.get(i).puntos);

        return v;
    }

    public ArrayList<Cartas> arreglo;
    public Context context;
}

