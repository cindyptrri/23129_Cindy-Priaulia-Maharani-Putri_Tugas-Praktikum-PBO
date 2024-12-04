/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
packapakacge pertemuan10;

/**
 *
 * @author CINDY
 */
public class PassingArray1D {
    static void main(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
        
        System.out.println(min);
    }
    
    public static void main(String[] args){
        int a[]={10,20,70.30,50};
        
        min(a);
    }
}
