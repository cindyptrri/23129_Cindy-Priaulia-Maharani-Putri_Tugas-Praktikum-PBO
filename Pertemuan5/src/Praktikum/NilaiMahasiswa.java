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
public class NilaiMahasiswa {
        public static void main(String[] args){
        String grd, ket;
        Scanner inp = new Scanner(System.in);
        System.out.print("NPM \t\t:");
        String npm = inp.nextLine();
        System.out.print("Nama Mahasiswa \t:");
        String nama = inp.nextLine();
        System.out.print("Nilai Kehadiran :");
        double nk = inp.nextDouble();
        System.out.print("Nilai Tugas \t:");
        double nt = inp.nextDouble();
        System.out.print("Nilai UTS \t:");
        double nuts = inp.nextDouble();
        System.out.print("Nilai UAS \t:");
        double nuas = inp.nextDouble();
        double nak = (0.1 * nk) + (0.2 * nt) + (0.3 * nuts) + (0.4 * nuas);
        
        if (nak >= 0 && nak <= 45){
            grd = "E";
            ket = "Sangat Kurang";
        }else if (nak >= 46 && nak <= 55){
            grd = "D";
            ket = "Kurang";
        }else if (nak >= 56 && nak <= 65){
            grd = "C";
            ket = "Cukup";
        }else if (nak >= 66 && nak <= 75){
            grd = "B";
            ket = "Baik";
        }else if (nak >= 76 && nak <= 100){
            grd = "A";
            ket = "Istimewa";
        }else{
        grd = "NILAI YANG ANDA MASUKAN SALAH";
        ket = "NILAI YANG ANDA MASUKAN SALAH";
        }
        System.out.println("==========================================");
        System.out.println("NPM Mahasiswa\t: " + npm);
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("Nilai Rata-rata\t: " + nak);
        System.out.println("Grade\t: " + grd);
        System.out.println("Keterangan\t: " + ket);
        }
}

