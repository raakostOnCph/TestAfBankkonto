package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class KontoTest {

    private Konto konto = new Konto("palle", 100);
    private Konto highRoller = new Konto("Erik",100,1000);
    private Konto kontoPlus = new Konto("lise",100,true,0);

    private Konto plusKonto = new Konto("noller",100, true, 0);


    @Test
    public void saldo() {
        assertEquals(100, konto.getSaldo());
    }

    @Test
    public void indsæt() {

        konto.indsæt(100);
        assertEquals(200, konto.getSaldo());
    }

    @Test
    public void repositLessThenSaldo() {

        konto.hæv(20);
        assertEquals(80, konto.getSaldo());

    }

    @Test
    public void respositExatlySaldo() {

    konto.hæv(100);

    assertEquals(0, konto.getSaldo());
    }

    @Test
    public void respositMorethenSaldo() {

        konto.hæv(200);
        highRoller.hæv(300);
        kontoPlus.hæv(200);


        assertEquals(100, konto.getSaldo());
        assertEquals(-200, highRoller.getSaldo());

        assertEquals(-130, kontoPlus.getSaldo());

    }
}