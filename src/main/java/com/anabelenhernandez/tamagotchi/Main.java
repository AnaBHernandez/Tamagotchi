package com.anabelenhernandez.tamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi miTamagotchi = new Tamagotchi("Tama");

        miTamagotchi.mostrarEstado();
        miTamagotchi.alimentar();
        miTamagotchi.jugar();
        miTamagotchi.dormir();
        miTamagotchi.pasarTiempo();
        miTamagotchi.mostrarEstado();
    }
}