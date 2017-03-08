package com.k2tic.courseramascotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaMascotas.setLayoutManager(llm);
        //listaContactos.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();



    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota1, "Curry", "1"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Bareta", "2"));
        mascotas.add(new Mascota(R.drawable.mascota3, "Katy", "3"));
        mascotas.add(new Mascota(R.drawable.mascota4, "Rony", "4"));
        mascotas.add(new Mascota(R.drawable.mascota5,"San", "5"));
        mascotas.add(new Mascota(R.drawable.mascota6,"Pim", "6"));
        mascotas.add(new Mascota(R.drawable.mascota7,"Pom", "7"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.estrella:
                Intent aboutIntent = new Intent(this, DetalleMascotas.class);
                startActivity(aboutIntent);
                break;



        }

        return super.onOptionsItemSelected(item);
    }
}



