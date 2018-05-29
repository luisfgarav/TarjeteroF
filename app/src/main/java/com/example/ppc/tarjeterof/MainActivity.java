package com.example.ppc.tarjeterof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        vis1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Tarjeta x=(Tarjeta)adapterView.getItemAtPosition(i);

                Intent segunda = new Intent(MainActivity.this, Main2Activity.class);
                segunda.putExtra("nombre",x.nombre);
                segunda.putExtra("edad",x.edad);
                segunda.putExtra("descripcion",x.descripcion);
                segunda.putExtra("imagen",x.imagen);
                startActivity(segunda);
            }
        });
    }
}
