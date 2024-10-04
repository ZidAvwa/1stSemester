
import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);

        String member, qris;
        int jumlah_beli, potongan = 1000, menu;
        double total_bayar = 0, diskon, harga = 0;

        System.err.println("============================");
        System.out.println("\tMenu Cafe");
        System.err.println("============================");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
        System.out.println("============================");
        System.out.print("Masukkan Menu: ");
        menu = zs.nextInt();
        System.out.print("Masukkan Jumlah: ");
        jumlah_beli = zs.nextInt();
        zs.nextLine();
        System.out.print("Punya Member (y/t) ? ");
        member = zs.nextLine().toLowerCase();
        System.out.print("Apakah menggunakan Qris (y/t) ? ");
        qris = zs.nextLine().toLowerCase();

        if (qris.equals("y")) {
            if (member.equals("y")) {
                diskon = 0.1;
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }

                total_bayar = harga - (harga * diskon) * jumlah_beli - potongan;
            } else {
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar = harga * jumlah_beli - potongan;
            }
        } else {
            if (member.equals("y")) {
                diskon = 0.1;
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }

                total_bayar = harga - (harga * diskon) * jumlah_beli;
            } else {
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar = harga * jumlah_beli;
            }
        }
        System.err.println("============================");
        System.out.println("\tTotal Bayar");
        System.err.println("============================");
        System.out.println("Total Bayar Sebesar " + total_bayar);
    }
}