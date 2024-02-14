/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Lecturer extends ResearchAssociate{
    public int hours;
    
    public Lecturer(int ssNo, String name, String email, String fieldOfStudy){
        super(ssNo,name,email,fieldOfStudy);
    }
    public void jamMengajar(){
        super.jamMengajar=hours;
    }
}
