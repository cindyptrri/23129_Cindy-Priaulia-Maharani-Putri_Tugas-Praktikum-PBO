/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

/**
 *
 * @author CINDY
 */
import java.util.ArrayList;

public class AddTest {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add("null");
        System.out.println(arr);
        
        ArrayList arr1 = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        System.out.println(arr1);
        
        arr.addAll(arr1);
        System.out.println(arr);
        
        arr.addAll(2, arr);
        System.out.println(arr1);
    }
}
