package com.example.jmart.deck_pm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista;
        OrigenDeDatos origen=new OrigenDeDatos();
        Adaptador adaptador=new Adaptador();
        lista=(ListView)findViewById(R.id.lista);
        adaptador.arreglo=origen.showAll();
        adaptador.context=this;
        lista.setAdapter(adaptador);
    }
}
