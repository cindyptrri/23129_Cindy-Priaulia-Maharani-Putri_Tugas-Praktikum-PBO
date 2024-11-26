/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
public class Transaksi {
    double total, diskon;
    
    Transaksi (double total){
        this.total = total;
        if(total < 50000){
            diskon = this.total * 0.05;
        }else if(total >= 50000){
            diskon = this.total *0.2;
        }
    }
}