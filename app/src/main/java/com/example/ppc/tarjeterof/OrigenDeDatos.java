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
        uno.nombre=("Kevin Medina Esinoza");
        uno.edad=("18 años");
        uno.descripcion=("Joven elegante");
        uno.imagen=("https://thumbs.dreamstime.com/t/cabeza-masculina-del-icono-perfil-en-la-burbuja-aislada-retrato-de-charla-personaje-dibujos-animados-avatar-hombre-joven-108359103.jpg");
        uno.id=1;
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.imagen=("https://img.myloview.es/vinilos/personaje-de-mono-de-dibujos-animados-aisladas-sobre-fondo-blanco-160-60956084.jpg");
        dos.nombre=("Isai Galván Alaníz");
        dos.edad=("17 años");
        dos.descripcion=("Joven furro");
        dos.id=2;
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.imagen=("https://thumbs.dreamstime.com/t/cabeza-masculina-en-la-burbuja-de-charla-aislada-hombre-joven-del-icono-perfil-retrato-personaje-dibujos-animados-hemlet-avatar-108360342.jpg");
        tres.nombre=("Andrés Manuel Molina Aceves");
        tres.edad=("17 años");
        tres.descripcion=("Joven post-depresivo");
        tres.id=3;
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.imagen=("https://thumbs.dreamstime.com/t/cabeza-masculina-americana-de-afrian-del-icono-perfil-en-la-burbuja-aislada-retrato-charla-personaje-dibujos-animados-avatar-108360458.jpg");
        cuatro.nombre=("Oscar Antonio García Avila");
        cuatro.edad=("18 años");
        cuatro.descripcion=("Joven chocolatoso");
        cuatro.id=4;
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.imagen=("https://thumbs.dreamstime.com/t/vector-plano-del-dise%C3%B1o-del-ciruelo-de-la-fruta-del-personaje-de-dibujos-animados-del-kawaii-lindo-del-icono-97053135.jpg");
        cinco.nombre=("Claudia Manuela Pérez Cortés");
        cinco.edad=("17 años");
        cinco.descripcion=("Jovena");
        cinco.id=5;
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.imagen=("https://thumbs.dreamstime.com/t/profile-icon-senior-male-head-chat-bubble-isolated-man-avatar-cartoon-character-portrait-profile-icon-senior-male-head-chat-108360408.jpg");
        seis.nombre=("Luis Manuel de Jesús Martínez Contreras");
        seis.edad=("18 años");
        seis.descripcion=("Joven");
        seis.id=6;
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.imagen=("https://thumbs.dreamstime.com/b/cabeza-masculina-del-icono-perfil-en-la-burbuja-aislada-retrato-cauc%C3%A1sico-de-charla-personaje-dibujos-animados-avatar-hombre-108359286.jpg");
        siete.nombre=("José de Jesús Martínez Cortés");
        siete.edad=("18 años");
        siete.descripcion=("Joven wapo");
        siete.id=7;
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.imagen=("https://thumbs.dreamstime.com/t/cabeza-masculina-en-la-burbuja-de-charla-aislada-hombre-joven-del-icono-perfil-retrato-personaje-dibujos-animados-avatar-los-108359201.jpg");
        ocho.nombre=("Jesús Emmanuel");
        ocho.edad=("18 años");
        ocho.descripcion=("Joven wapo");
        ocho.id=8;
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.imagen=("https://thumbs.dreamstime.com/t/cabeza-masculina-mayor-del-icono-perfil-en-la-burbuja-aislada-retrato-de-charla-personaje-dibujos-animados-avatar-hombre-108360493.jpg");
        nueve.nombre=("Alan Ramírez Herrera");
        nueve.edad=("17 años");
        nueve.descripcion=("Joven programador");
        nueve.id=9;
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.imagen=("https://thumbs.dreamstime.com/t/vector-plano-divertido-del-dise%C3%B1o-de-los-alimentos-de-preparaci%C3%B3n-r%C3%A1pida-del-kawaii-del-icono-del-personaje-de-dibujos-animados-97159140.jpg");
        diez.nombre=("Alan Franco");
        diez.edad=("18 años");
        diez.descripcion=("Joven");
        diez.id=10;
        resultado.add(diez);
        return resultado;
    }
}
