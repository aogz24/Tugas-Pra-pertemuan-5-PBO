/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Faculty {
    public String name;
    private Institute institut;
    
    public Faculty(String name, String ins){
        this.name = name;
        this.institut= new Institute(ins);
    }
    public String leadBy(Dean name){
        return name.getName();
    }
}
