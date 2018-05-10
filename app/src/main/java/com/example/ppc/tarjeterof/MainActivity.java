package com.example.ppc.tarjeterof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView vis1;
        vis1=(ListView)findViewById(R.id.vista);
        AdaptadorDeListaDatos Adaptador=new AdaptadorDeListaDatos();

        OrigenDeDatos odd=new OrigenDeDatos();

        Adaptador.arreglo=odd.showAll();
        Adaptador.context=this;

        vis1.setAdapter(Adaptador);
    }
}
