/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

import java.util.ArrayList;

/**
 *
 * @author zc
 */
public class ResearchAssociate extends Employee implements Attendance{
    private String fieldOfStudy;
    public int jamMengajar;
    private ArrayList<Institute> institute;
    private Project project;
    
    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy){
        super.setSsNo(ssNo);
        super.setName(name);
        super.setEmail(email);
        this.fieldOfStudy=fieldOfStudy;
    }
    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy, ArrayList<Institute> institute){
        super.setSsNo(ssNo);
        super.setName(name);
        super.setEmail(email);
        this.fieldOfStudy=fieldOfStudy;
    }
    
    @Override
    public void setSsNo(int ssNo){
        super.setSsNo(ssNo);
    }
    @Override
    public void setName(String name){
        super.setName(name);
    }
    @Override
    public void setEmail(String email){
        super.setEmail(email);
    }
    public void setFieldOfStudy(String fieldOfstudy){
        this.fieldOfStudy=fieldOfStudy;
    }

    @Override
    public float percentageAbsence() {
        return jamMengajar/24;
    }
}
