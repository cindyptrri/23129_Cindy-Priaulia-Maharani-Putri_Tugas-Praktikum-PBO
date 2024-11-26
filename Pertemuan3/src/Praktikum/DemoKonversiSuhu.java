/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        double celcius = 25.0;
        double fahrenheit = 77.0;

        System.out.println("Celcius to Fahrenheit: " + celcius + "°C = " + konversi.celciusToFahrenheit(celcius) + "°F");
        System.out.println("Celcius to Reamur: " + celcius + "°C = " + konversi.celciusToReamur(celcius) + "°R");
        System.out.println("Fahrenheit to Reamur: " + fahrenheit + "°F = " + konversi.fahrenheitToReamur(fahrenheit) + "°R");
    }
}
