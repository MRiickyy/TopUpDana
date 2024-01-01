package com.company;

public class DANA {
    private int saldo = 0;
    private String nomorTelepon = "";

    public DANA() {
    }

    public double getSaldo() {
        return (double)this.saldo;
    }

    public String getNomorTelepon() {
        return this.nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void topUp(int amount) {
        this.saldo += amount;
        System.out.println("Top-up berhasil. Saldo sekarang: " + this.saldo);
    }
}
