package com.company;

public class Konto {

    private String name;
    private int saldo;
    private boolean saldoPlus = false;
    private int gebyr= 30;

    public Konto(String name, int saldo, boolean saldoPlus, int overtræk) {
        this.name = name;
        this.saldo = saldo;
        this.saldoPlus = saldoPlus;
        this.overtræk = overtræk;
    }


    private int overtræk=0;

    public Konto(String name, int saldo) {
        this.name = name;
        this.saldo = saldo;

    }

    public Konto(String name, int saldo, int overtræk) {
        this.name = name;
        this.saldo = saldo;
        this.overtræk = overtræk;
    }

    public int getSaldo() {
        return saldo;
    }

    public void indsæt(int i) {

        this.saldo += i;
    }


    public int hæv(int i) {

        if (i <= saldo + overtræk) {
            saldo -= i;
            return saldo;
        }

        else if (saldoPlus){

            saldo -= i + gebyr;
            return saldo;
         }


        return saldo;


        }
}




