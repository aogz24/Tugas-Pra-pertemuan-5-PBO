/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Dean extends Employee {
    public Dean(int ssNo,String name, String email){
        super.setSsNo(ssNo);
        super.setName(name);
        super.setEmail(email);
    }
    public String getNama(){
        return super.getName();
    }
}
