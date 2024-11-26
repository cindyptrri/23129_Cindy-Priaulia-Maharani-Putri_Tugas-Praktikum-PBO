/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author CINDY
 */
public class Student {
        String name;
    int id;
    
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public Student(Student ostudent){
        this.name = ostudent.name;
        this.id = ostudent.id;
    }
}
