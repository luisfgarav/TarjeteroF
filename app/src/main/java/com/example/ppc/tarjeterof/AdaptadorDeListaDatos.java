package com.example.ppc.tarjeterof;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class AdaptadorDeListaDatos extends BaseAdapter{

    public ArrayList<Tarjeta> arreglo;
    public Context context;
    public LayoutInflater inflater;

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
        inflater=LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.tarjeta, null);
        TextView nombr = (TextView) v.findViewById(R.id.nombre);
        nombr.setText(arreglo.get(i).nombre);
        TextView descr = (TextView) v.findViewById(R.id.descripcion);
        descr.setText(arreglo.get(i).descripcion);
        TextView edadad = (TextView) v.findViewById(R.id.edad);
        edadad.setText(arreglo.get(i).edad);
        ImageView imagen = (ImageView) v.findViewById(R.id.imagen);
        Picasso.with(context).load(arreglo.get(i).imagen).into(imagen);
        return v;
    }
}
