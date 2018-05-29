package com.example.ppc.tarjeterof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView nombre,descripcion,edad;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombre=(TextView)findViewById(R.id.nombre2);
        descripcion=(TextView)findViewById(R.id.descripcion2);
        edad=(TextView)findViewById(R.id.edad2);
        imagen=(ImageView)findViewById(R.id.imagen2);

        Intent r=getIntent();

        String i=r.getStringExtra("edad");
        String n=r.getStringExtra("nombre");
        String m=r.getStringExtra("descripcion");
        String o=r.getStringExtra("imagen");

        nombre.setText(n);
        descripcion.setText(m);
        edad.setText(i);
        Picasso.with(this).load(o).into(imagen);
    }
}
