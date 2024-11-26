/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author CINDY
 */
public class VolumeLuas {
    double p,t,l,s;
    public VolumeLuas(double p,double l,double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public VolumeLuas(double s){
        this.s = s;
    }
     public double volume(){
    return p * l * t;
    }
    public double luas(){
    return 2 * ((p * l) + (p * t) + (l * t));
    }
     public double volume_k(){
    return s * s * s;
    }
     public double luas_k(){
    return 6 * s * s;
    }
}
