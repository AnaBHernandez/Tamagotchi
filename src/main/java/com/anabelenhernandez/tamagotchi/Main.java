package com.anabelenhernandez.tamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi miTamagotchi = new Tamagotchi("Tamagothi");

        miTamagotchi.mostrarEstado(); // Muestra el estado inicial
        miTamagotchi.alimentar();
        miTamagotchi.jugar();
        miTamagotchi.dormir();
        miTamagotchi.pasarTiempo();
        miTamagotchi.mostrarEstado(); // Muestra el estado después de las acciones
    }
}