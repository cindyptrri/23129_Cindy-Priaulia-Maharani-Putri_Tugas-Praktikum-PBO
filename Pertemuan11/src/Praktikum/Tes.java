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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.nextLine();

        try (Connection connection = Koneksi.konek()) {
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, uname);
                preparedStatement.setString(2, passwd);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Login berhasil");
                    } else {
                        System.out.println("Username atau password salah");
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}