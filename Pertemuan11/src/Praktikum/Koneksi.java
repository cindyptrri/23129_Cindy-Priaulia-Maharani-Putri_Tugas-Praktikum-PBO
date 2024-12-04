/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection konek;

    public static Connection konek() throws SQLException, ClassNotFoundException {
        if (konek == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_pbo", "root", "");
                System.out.println("Koneksi berhasil!");
            } catch (SQLException | ClassNotFoundException e) {
                System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
                throw e;
            }
        }
        return konek;
    }
}