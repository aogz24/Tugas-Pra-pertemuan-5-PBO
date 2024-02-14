/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Course {
    private Lecturer lecturer;
    private String name;
    private int id;
    float hours;
    
    public Course(Lecturer lecturer, String name, int id, float hour){
        this.lecturer=lecturer;
        this.name=name;
        this.id=id;
        this.hours=hour;
        lecturer.hours+=hour;
    }
}
