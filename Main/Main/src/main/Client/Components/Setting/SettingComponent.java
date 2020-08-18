/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Setting;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class SettingComponent implements MouseListener{

    private SettingTemplate SettingTemplate;
    
    public SettingComponent(){
        this.SettingTemplate = new SettingTemplate(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
     
    }

    @Override
    public void mousePressed(MouseEvent me) {
   
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    public SettingTemplate getSettingTemplate(){
        return this.SettingTemplate;
    }
}
