/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Music;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Client.Components.Games.GameTemplate;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ 
 */
public class MusicComponent implements ActionListener{

    private MusicTemplate MusicTemplate;
    
    public MusicComponent(){
       this.MusicTemplate = new MusicTemplate(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public MusicTemplate getMusicTemplate(){
        return this.MusicTemplate;
    }
}
