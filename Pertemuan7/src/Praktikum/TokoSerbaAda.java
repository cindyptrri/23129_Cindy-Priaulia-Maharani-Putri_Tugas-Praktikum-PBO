/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Item Barang : ");
        int itemBarang = scanner.nextInt();
        String[][] dataBarang = new String[itemBarang][5];
        double totalBayar = 0;

        for (int i = 0; i < itemBarang; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.println("Masukkan Kode : ");
            String kode = scanner.next();
            System.out.println("Masukkan jumlah Beli : ");
            int jumlahBeli = scanner.nextInt();

            switch (kode) {
                case "a001" -> {
                    dataBarang[i][0] = kode;
                    dataBarang[i][1] = "Buku";
                    dataBarang[i][2] = "10000";
                    dataBarang[i][3] = String.valueOf(jumlahBeli);
                    dataBarang[i][4] = String.valueOf(jumlahBeli * 10000);
                    totalBayar += jumlahBeli * 10000;
                }
                case "a002" -> {
                    dataBarang[i][0] = kode;
                    dataBarang[i][1] = "Pensil";
                    dataBarang[i][2] = "2000";
                    dataBarang[i][3] = String.valueOf(jumlahBeli);
                    dataBarang[i][4] = String.valueOf(jumlahBeli * 2000);
                    totalBayar += jumlahBeli * 2000;
                }
                case "a003" -> {
                    dataBarang[i][0] = kode;
                    dataBarang[i][1] = "Pulpen";
                    dataBarang[i][2] = "3000";
                    dataBarang[i][3] = String.valueOf(jumlahBeli);
                    dataBarang[i][4] = String.valueOf(jumlahBeli * 3000);
                    totalBayar += jumlahBeli * 3000;
                }
                default -> System.out.println("Kode barang tidak ditemukan.");
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        for (int i = 0; i < itemBarang; i++) {
            System.out.println("No Kode Barang Nama Barang Harga Jumlah Beli Jumlah Bayar");
            System.out.println(dataBarang[i][0] + " " + dataBarang[i][1] + " " + dataBarang[i][2] + " " + dataBarang[i][3] + " " + dataBarang[i][4]);
        }
        System.out.println("Total Bayar " + totalBayar);
    }
}
