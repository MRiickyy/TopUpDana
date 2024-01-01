//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DANA eWallet = new DANA();


        System.out.println("Selamat datang di Program Top-up E-Wallet");
        System.out.print("Masukkan nomor telepon Anda : ");
        String nomorTelepon = scanner.nextLine();
        eWallet.setNomorTelepon(nomorTelepon);

        int pilihmenu, pilihan, TopUpAmount;
        do {
            System.out.println("\nMenu Utama : ");
            System.out.println("1. Top-up");
            System.out.println("2. Liat Saldo");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihmenu = scanner.nextInt();
            switch (pilihmenu) {
                case 0:
                    System.out.println("\nTerima kasih! Sampai jumpa lagi.");
                    break;
                case 1:
                    System.out.println("\nPilih Berapa Jumlah Top-up anda : ");
                    System.out.println("1. 50000");
                    System.out.println("2. 100000");
                    System.out.println("3. 150000");
                    System.out.println("4. 200000");
                    System.out.println("5. Memasukkan nominal sendiri");
                    System.out.print("Masukkan pilihan anda : ");
                    pilihan = scanner.nextInt();
                    switch (pilihan) {
                        case 1:
                            TopUpAmount = 50000;
                            eWallet.topUp(TopUpAmount);
                            continue;
                        case 2:
                            TopUpAmount = 100000;
                            eWallet.topUp(TopUpAmount);
                            continue;
                        case 3:
                            TopUpAmount = 150000;
                            eWallet.topUp(TopUpAmount);
                            continue;
                        case 4:
                            TopUpAmount = 200000;
                            eWallet.topUp(TopUpAmount);
                            continue;
                        case 5:
                            do {
                                System.out.print("\nSilakan masukkan jumlah (top-up minimal 25000): ");
                                TopUpAmount = scanner.nextInt();
                                if (TopUpAmount < 25000) {
                                    System.out.println("Mohon maaf nominal yang dimasukkan kurang dari batas minimal.");
                                    System.out.println("Silahkan memasukkan nominal kembali.");
                                } else {
                                    eWallet.topUp(TopUpAmount);
                                }
                            } while(TopUpAmount < 25000);
                        default:
                            continue;
                    }
                case 2:
                    System.out.println("\nSaldo sekarang: " + eWallet.getSaldo());
            }
        } while(pilihmenu != 0);

        scanner.close();
    }
}
