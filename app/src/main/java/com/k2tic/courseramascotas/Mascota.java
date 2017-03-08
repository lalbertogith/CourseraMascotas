package com.k2tic.courseramascotas;

/**
 * Created by alberto on 08/03/2017.
 */

public class Mascota {

    private String nombre_mascota;
    private String megusta;
    private int foto;

    public Mascota(int foto, String nombre_mascota, String megusta) {
        this.nombre_mascota = nombre_mascota;
        this.megusta = megusta;
        this.foto = foto;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getMegusta() {
        return megusta;
    }

    public void setMegusta(String megusta) {
        this.megusta = megusta;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
