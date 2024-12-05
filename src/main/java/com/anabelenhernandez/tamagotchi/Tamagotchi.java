package com.anabelenhernandez.tamagotchi;

public class Tamagotchi {
    private String nombre;
    private int hambre;
    private int felicidad;
    private int energia;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 5;
        this.felicidad = 5;
        this.energia = 5;
    }

    public void alimentar() {
        hambre = Math.max(0, hambre - 2);
    }

    public void jugar() {
        felicidad = Math.min(10, felicidad + 1);
        energia = Math.max(0, energia - 1);
        hambre = Math.min(10, hambre + 1);
    }

    public void dormir() {
        energia = Math.min(10, energia + 2);
    }

    public void pasarTiempo() {
        hambre = Math.min(10, hambre + 1);
        energia = Math.max(0, energia - 1);
        felicidad = Math.max(0, felicidad - 1);
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Hambre: " + hambre);
        System.out.println("Felicidad: " + felicidad);
        System.out.println("Energía: " + energia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public int getEnergia() {
        return energia;
    }
}