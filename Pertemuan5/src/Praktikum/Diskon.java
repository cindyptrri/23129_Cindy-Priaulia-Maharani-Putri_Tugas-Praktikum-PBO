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
public class Diskon {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Total Pembelian Rp. ");
            double total = inp.nextDouble();
            
            Transaksi bel = new Transaksi(total);
            System.out.println("Besarnya potonga Rp. " + bel.diskon);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + (bel.total - bel.diskon));
        }
    }
}