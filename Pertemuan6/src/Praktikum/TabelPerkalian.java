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

public class TabelPerkalian {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();
        
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
        } else {
            System.out.println("Tabel Perkalian:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
    }
}

