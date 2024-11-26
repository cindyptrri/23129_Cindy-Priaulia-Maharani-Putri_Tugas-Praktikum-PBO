/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
public class Matematika2 extends Matematika {

    public int pertambahan(int a, int b) {
        return super.pertambahan(a, b); // Memanggil versi parent
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
