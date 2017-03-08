package com.k2tic.courseramascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alberto on 08/03/2017.
 */

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdapter(ArrayList<Mascota> contactos, Activity activity) {
        this.mascotas = contactos;
        this.activity = activity;

    }




    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreMascotaCV.setText(mascota.getNombre_mascota());

        

    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene mi lista de contactos
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombreMascotaCV;
        private TextView tvTelefonoCV;
        private ImageButton btlLike;


        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto                 = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreMascotaCV       = (TextView) itemView.findViewById(R.id.tvNombreMascota);

        }
    }



}
