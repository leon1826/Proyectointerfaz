/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Social;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class SocialComponent implements ActionListener{

    private SocialTemplate SocialTemplate;
    
    public SocialComponent(){
        this.SocialTemplate = new SocialTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public SocialTemplate getSocialTemplate(){
        return this.SocialTemplate;
    }
}
