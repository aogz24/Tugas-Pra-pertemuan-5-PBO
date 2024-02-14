/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class AdministrativeEmployee extends Employee implements Attendance {
    private int hariMasuk;
    
    public AdministrativeEmployee(int ssNo,String name, String email){
        super.setSsNo(ssNo);
        super.setName(name);
        super.setEmail(email);
    }
    public int Presensi(){
        return hariMasuk++;
    }

    @Override
    public float percentageAbsence() {
        return hariMasuk/40;
    } 
}
