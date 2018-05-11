package com.example.jmart.deck_pm;

import java.util.ArrayList;

public class OrigenDeDatos {
    public ArrayList<Cartas> showAll()
    {
        ArrayList<Cartas> resultado = new ArrayList<Cartas>();
        Cartas carta1 = new Cartas();
        Cartas carta2 = new Cartas();
        Cartas carta3 = new Cartas();
        Cartas carta4 = new Cartas();
        Cartas carta5 = new Cartas();

        resultado.add(carta1);
        resultado.add(carta2);
        resultado.add(carta3);
        resultado.add(carta4);
        resultado.add(carta5);

        carta1.nombre = ("Exodia the forbidden one");
        carta1.descripcion = ("If you have Right Leg of the Forbidden One, Left Leg of the Forbidden One, Right Arm of the Forbidden One and Left Arm of the Forbidden One in addition to this card in your hand, you win the Duel. ");
        carta1.puntos = ("1000");
        carta1.imagen = ("https://vignette.wikia.nocookie.net/yugioh/images/c/c0/ExodiatheForbiddenOne-TF04-JP-VG.jpg/revision/latest?cb=20120420185052");
        carta1.id = 0;

        carta2.nombre = ("Right Arm of the Forbidden One");
        carta2.descripcion = ("A forbidden right arm sealed by magic. Whosoever breaks this seal will know infinite power.");
        carta2.puntos = ("200");
        carta2.imagen = ("https://vignette.wikia.nocookie.net/yugiohenespanol/images/8/8e/Foto_brazo_derecho_del_prohibido.jpg/revision/latest?cb=20120305015234&path-prefix=es");
        carta2.id = 1;

        carta3.nombre = ("Left Arm of the Forbidden One");
        carta3.descripcion = ("A forbidden left arm sealed by magic. Whosoever breaks this seal will know infinite power.");
        carta3.puntos = ("200");
        carta3.imagen = ("http://uploads3.yugioh.com/card_images/4389/detail/Exodia---Left-Arm-ofthe-ForbiddenFL.jpg?1386973329");
        carta3.id = 2;

        carta4.nombre = ("Right Leg of the Forbidden One");
        carta4.descripcion = ("A forbidden right leg sealed by magic. Whosoever breaks this seal will know infinite power.");
        carta4.puntos = ("200");
        carta4.imagen = ("http://uploads1.yugioh.com/card_images/4391/detail/Exodia---Right-LegofthefordibbenOn.jpg?1386973418");
        carta4.id = 3;

        carta5.nombre = ("Left Leg of the Forbidden One");
        carta5.descripcion = ("A forbidden left leg sealed by magic. Whosoever breaks this seal will know infinite power.");
        carta5.puntos = ("200");
        carta5.imagen = ("http://uploads4.yugioh.com/card_images/4390/detail/Exodia---Left-Leg-of-the-Forbidden-.jpg?1386973387");
        carta5.id = 4;

        return resultado;
    }
}
