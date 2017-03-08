package com.k2tic.courseramascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DetalleMascotas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();




    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota4, "Rony", "4"));
        mascotas.add(new Mascota(R.drawable.mascota5,"San", "5"));
        mascotas.add(new Mascota(R.drawable.mascota1, "Curry", "1"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Bareta", "2"));
        mascotas.add(new Mascota(R.drawable.mascota3, "Katy", "3"));



    }


}



