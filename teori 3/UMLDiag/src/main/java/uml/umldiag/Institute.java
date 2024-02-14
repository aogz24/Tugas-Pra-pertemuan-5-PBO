/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Institute {
    public String name;
    private String address;
    
    public Institute(String name, String address){
        this.name=name;
        this.address=address;
    }

    Institute(String ins) {
        this.name=ins;
    }
}
