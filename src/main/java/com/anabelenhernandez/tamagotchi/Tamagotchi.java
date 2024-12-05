package com.anabelenhernandez.tamagotchi;

public class Tamagotchi {
    private int hambre;
    private int felicidad;
    private int energia;
    private final String nombre;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 5;
        this.felicidad = 5;
        this.energia = 5;
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Hambre: " + hambre);
        System.out.println("Felicidad: " + felicidad);
        System.out.println("Energía: " + energia);
    }

    public void alimentar() {
        hambre = Math.max(hambre - 1, 0);
        System.out.println("Alimentar: Hambre = " + hambre);
    }

    public void jugar() {
        felicidad = Math.min(felicidad + 1, 10);
        energia = Math.max(energia - 1, 0);
        System.out.println("Jugar: Felicidad = " + felicidad + ", Energía = " + energia);
    }

    public void dormir() {
        energia = Math.min(energia + 2, 10);
        System.out.println("Dormir: Energía = " + energia);
    }

    public void pasarTiempo() {
        hambre = Math.min(hambre + 1, 10);
        felicidad = Math.max(felicidad - 1, 0);
        energia = Math.max(energia - 1, 0);
        System.out.println("Pasar Tiempo: Hambre = " + hambre + ", Felicidad = " + felicidad + ", Energía = " + energia);
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