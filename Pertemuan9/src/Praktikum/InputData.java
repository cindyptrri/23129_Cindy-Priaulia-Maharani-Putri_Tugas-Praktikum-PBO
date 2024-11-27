/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
import java.util.ArrayList;

public class InputData {
  ArrayList<Mahasiswa> listmahasiswa;

  public InputData() {
    listmahasiswa = new ArrayList();
  }

  public void insertData(String NIM, String Nama, String Alamat, String Mata_Kuliah, String Nilai_Akhir) {
    Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Mata_Kuliah, Nilai_Akhir);
    listmahasiswa.add(mhs);
  }

  public ArrayList<Mahasiswa> getALL() {
    return listmahasiswa;
  }

  public void deleteData(int index) {
    listmahasiswa.remove(index);
  }

    private static class Mahasiswa {

        public Mahasiswa() {
        }
    }
}

