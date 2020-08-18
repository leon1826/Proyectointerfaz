/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Home;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class HomeComponent implements ActionListener{
    
    private HomeTemplate HomeTemplate;
    
    public HomeComponent(){
        this.HomeTemplate = new HomeTemplate(this);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent ae) {
     
    }
    
     public HomeTemplate getHomeTemplate(){
        return this.HomeTemplate;
    }
}
