/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JERE
 */
public class PrincipalComponent implements ActionListener {
    
    private PricipalTemplate PricipalTemplate;
    
    
    public PrincipalComponent(){
        PricipalTemplate = new PricipalTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
  
    }
    
    public PricipalTemplate getPricipalTemplate(){
        return this.PricipalTemplate;
    }
}
