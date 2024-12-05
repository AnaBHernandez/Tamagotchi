package com.anabelenhernandez.tamagotchi;

import org.junit.Test;
import static org.junit.Assert.*;

public class TamagotchiTest {

    @Test
    public void testAlimentar() {
        Tamagotchi tamagotchi = new Tamagotchi("Tama");
        tamagotchi.alimentar();
        assertEquals(3, tamagotchi.getHambre());
    }

    @Test
    public void testJugar() {
        Tamagotchi tamagotchi = new Tamagotchi("Tama");
        tamagotchi.jugar();
        assertEquals(6, tamagotchi.getHambre());
        assertEquals(6, tamagotchi.getFelicidad());
        assertEquals(4, tamagotchi.getEnergia());
    }

    @Test
    public void testDormir() {
        Tamagotchi tamagotchi = new Tamagotchi("Tama");
        tamagotchi.dormir();
        assertEquals(7, tamagotchi.getEnergia());
    }

    @Test
    public void testPasarTiempo() {
        Tamagotchi tamagotchi = new Tamagotchi("Tama");
        tamagotchi.pasarTiempo();
        assertEquals(6, tamagotchi.getHambre());
        assertEquals(4, tamagotchi.getEnergia());
        assertEquals(4, tamagotchi.getFelicidad());
    }
}