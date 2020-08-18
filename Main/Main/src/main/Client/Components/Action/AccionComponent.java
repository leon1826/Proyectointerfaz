/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Action;

/**
 *
 * @author JERE
 */
public class AccionComponent {
    private AccionTemplate AccionTemplate;
    
    public AccionComponent(){
        
    this.AccionTemplate = new AccionTemplate(this);
    
    }
    
    public AccionTemplate getAccionTemplate(){
        return this.AccionTemplate;
    }
}
