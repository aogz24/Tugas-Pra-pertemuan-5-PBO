/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public abstract class Employee {
    private int ssNo;
    private String name;
    private String email;
    private int counter;
    
    public void setSsNo(int ssNo){
        this.ssNo=ssNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getName(){
        return this.name;
    }
    
}
