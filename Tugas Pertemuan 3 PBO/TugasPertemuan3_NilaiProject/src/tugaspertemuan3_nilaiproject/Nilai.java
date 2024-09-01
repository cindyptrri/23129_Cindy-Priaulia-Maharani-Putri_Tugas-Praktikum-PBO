/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3_nilaiproject;

/**
 *
 * @author CINDY
 */
public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = nilaiAbsen * 0.1 + nilaiTugas * 0.2 + nilaiUTS * 0.3 + nilaiUAS * 0.4;
    }

    public void cetakNilai() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Absen (10%)\t: " + nilaiAbsen);
        System.out.println("Nilai Tugas (20%)\t: " + nilaiTugas);
        System.out.println("Nilai UTS (30%)\t: " + nilaiUTS);
        System.out.println("Nilai UAS (40%)\t: " + nilaiUAS);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
    }
}

