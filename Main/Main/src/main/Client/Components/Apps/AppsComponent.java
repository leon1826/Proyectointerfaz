/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Apps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JERE
 */
public class AppsComponent implements ActionListener {

    private AppsTemplate AppsTemplate;
    
    public AppsComponent (){
        this.AppsTemplate = new AppsTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
 
    }
    
    public AppsTemplate getAppsTemplate(){
        return this.AppsTemplate;
    }
}
