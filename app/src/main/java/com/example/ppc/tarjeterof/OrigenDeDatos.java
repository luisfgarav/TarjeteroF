package com.example.ppc.tarjeterof;

import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ppc on 23/04/2018.
 */

public class OrigenDeDatos {
    public ArrayList<Tarjeta> showAll() {
        ArrayList<Tarjeta> resultado = new ArrayList<Tarjeta>();

        Tarjeta uno = new Tarjeta();
        uno.nombre=("Pharah");
        uno.edad=("32 años");
        uno.descripcion=("-Protegeré a los inocentes-");
        uno.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/pharah/hero-select-portrait.png");
        uno.id=1;
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/doomfist/hero-select-portrait.png");
        dos.nombre=("Doomfist");
        dos.edad=("45 años");
        dos.descripcion=("-Sólo evolucionamos a través del conflicto-");
        dos.id=2;
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/dva/hero-select-portrait.png");
        tres.nombre=("D.Va");
        tres.edad=("19 años");
        tres.descripcion=("-Juego para ganar-");
        tres.id=3;
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/lucio/hero-select-portrait.png");
        cuatro.nombre=("Lúcio");
        cuatro.edad=("26 años");
        cuatro.descripcion=("-¡Venga, todos juntos!-");
        cuatro.id=4;
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/tracer/hero-select-portrait.png");
        cinco.nombre=("Tracer");
        cinco.edad=("26 años");
        cinco.descripcion=("-¡Eh, chicos!¡Llega la caballería!-");
        cinco.id=5;
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/widowmaker/hero-select-portrait.png");
        seis.nombre=("Widowmaker");
        seis.edad=("33 años");
        seis.descripcion=("-Una bala, un muerto-");
        seis.id=6;
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/moira/hero-select-portrait.png");
        siete.nombre=("Moira");
        siete.edad=("48 años");
        siete.descripcion=("-La ciencia revelará la verdad-");
        siete.id=7;
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/genji/hero-select-portrait.png");
        ocho.nombre=("Genji");
        ocho.edad=("35 años");
        ocho.descripcion=("-Renuncia a tu cuerpo, pero nunca renuncies a tu honor-");
        ocho.id=8;
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/mercy/hero-select-portrait.png");
        nueve.nombre=("Mercy");
        nueve.edad=("37 años");
        nueve.descripcion=("-Los héroes nunca mueren-");
        nueve.id=9;
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.imagen=("https://d1u1mce87gyfbn.cloudfront.net/hero/hanzo/hero-select-portrait.png");
        diez.nombre=("Hanzo");
        diez.edad=("38 años");
        diez.descripcion=("-Hay honor en cada muerte, y el honor lleva a la redención-");
        diez.id=10;
        resultado.add(diez);
        return resultado;
    }
}
