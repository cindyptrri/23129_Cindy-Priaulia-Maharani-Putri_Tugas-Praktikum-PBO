/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author CINDY
 */
public class LaguBingo {
    public LaguBingo() {
        tampilkanLagu();
    }

    public void tampilkanLagu() {
        String bingo = "B-I-N-G-O";

        for (int i = 0; i <= 5; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("(clap)-");
                }
                System.out.println(bingo.substring(i));
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        new LaguBingo();
    }
}

