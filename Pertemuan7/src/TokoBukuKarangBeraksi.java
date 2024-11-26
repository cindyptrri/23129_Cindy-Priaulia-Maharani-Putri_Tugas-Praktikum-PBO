/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * Indira Ayu Anggraeni (2310631170021)
 * Cindy Priaulia Maharani Putri (2310631170129)
 */
import java.util.ArrayList;

public class TokoBukuKarangBeraksi {
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static double totalPenjualan = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        daftarBuku.add (new Buku (1, "Dasar-dasar Pemrograman Java", "M. Ashari", 150000, 5));
        daftarBuku.add (new Buku (2, "Harry Potter Chamber Of Secret", "J.K. Rowling", 120000, 3));
        daftarBuku.add (new Buku (3, "Dilan 1990", "Pidi Baiq", 70000, 50));
        
        lihatDaftarBuku ();
        
        System.out.println ("Total Penjualan: Rp" + totalPenjualan);
    }
    
    static void lihatDaftarBuku (){
        System.out.println ("\nDaftar Buku:");
        for (Buku buku : daftarBuku){
            System.out.println ("ID: " + buku.id);
            System.out.println ("Judul: " + buku.judul);
            System.out.println ("Penulis: " +buku.penulis);
            System.out.println ("Harga: " + buku.harga);
            System.out.println ("Stok: " + buku.stok);
            System.out.println ();
        }
    }
    
    static void catatanPenjualan (int idBuku, int jumlah){
        for (Buku buku : daftarBuku) {
            if (buku.id == idBuku) {
                if (buku.stok >= jumlah) {
                    buku.stok -= jumlah;
                    totalPenjualan += buku.harga * jumlah;
                    System.out.println(jumlah + " buku \"" + buku.judul + "\" terjual.");
                } else {
                    System.out.println("Stok tidak cukup untuk buku \"" + buku.judul + "\".");  
        }
        return;
    }
}   
        System.out.println ("Buku dengan ID " + idBuku + " tidak temukan.");
    }
}
