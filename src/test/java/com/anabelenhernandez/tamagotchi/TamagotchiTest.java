package com.anabelenhernandez.tamagotchi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TamagotchiTest {

    private Tamagotchi tamagotchi;

    @BeforeEach
    public void setUp() {
        tamagotchi = new Tamagotchi("Tamagothi");
    }

    @Test
    public void testInicial() {
        assertEquals(5, tamagotchi.getHambre());
        assertEquals(5, tamagotchi.getFelicidad());
        assertEquals(5, tamagotchi.getEnergia());
    }

    @Test
    public void testAlimentar() {
        tamagotchi.alimentar();
        assertEquals(4, tamagotchi.getHambre());
    }

    @Test
    public void testJugar() {
        tamagotchi.jugar();
        assertEquals(6, tamagotchi.getFelicidad());
        assertEquals(4, tamagotchi.getEnergia());
    }

    @Test
    public void testDormir() {
        tamagotchi.dormir();
        assertEquals(7, tamagotchi.getEnergia());
    }

    @Test
    public void testPasarTiempo() {
        tamagotchi.pasarTiempo();
        assertEquals(6, tamagotchi.getHambre());
        assertEquals(4, tamagotchi.getFelicidad());
        assertEquals(4, tamagotchi.getEnergia());
    }
}