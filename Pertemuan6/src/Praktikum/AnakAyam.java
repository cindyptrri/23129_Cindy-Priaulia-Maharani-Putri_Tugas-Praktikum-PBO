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

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati 1 tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati 1 tinggal " + (i - 1));
            }
        }
    }
}
