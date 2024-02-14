/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

import java.util.Date;

/**
 *
 * @author zc
 */
public class Project {
    private String name;
    private Date start;
    private Date end;
    
    public Project(String name, Date start, Date end){
        this.name=name;
        this.start=start;
        this.end=end;
    }
}
