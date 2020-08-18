/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Bing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JERE
 */
public class BingComponent implements ActionListener{
    
    private BingTemplate BingTemplate;
    
    
    public BingComponent(){
        this.BingTemplate = new BingTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public BingTemplate getBingTemplate(){
        return this.BingTemplate;
    }
    
}
