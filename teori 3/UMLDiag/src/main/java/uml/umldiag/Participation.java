/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.umldiag;

/**
 *
 * @author zc
 */
public class Participation {
    private int hour;
    private Project project;
    private ResearchAssociate researchAssociate;
    
    public Participation(ResearchAssociate researchAssociate,Project project,int hour){
        this.hour=hour;
        this.project=project;
        this.researchAssociate=researchAssociate;
    }
}
