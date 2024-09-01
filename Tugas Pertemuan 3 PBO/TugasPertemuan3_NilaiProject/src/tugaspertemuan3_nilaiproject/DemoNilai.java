/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3_nilaiproject;

/**
 *
 * @author CINDY
 */
public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek nilaiMahasiswa dengan data tertentu
        Nilai nilaiMahasiswa = new Nilai("12345678", "John Doe", 80, 90, 85, 95);
        
        // Memanggil method cetakNilai untuk menampilkan nilai
        nilaiMahasiswa.cetakNilai();
    }
}
