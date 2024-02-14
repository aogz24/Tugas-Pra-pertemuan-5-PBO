/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uml.umldiag;
//public Lecturer(int ssNo, String name, String email, String fieldOfStudy)

/**
 *
 * @author zc
 */
public class UMLDiag {

    public static void main(String[] args) {
        Lecturer r1 = new Lecturer(123,"agus","a@d","KS");
        Course c1 = new Course(r1, "a",123, 12.5);
        System.out.println(c1.toString());
    }
}
