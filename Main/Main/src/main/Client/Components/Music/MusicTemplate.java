/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Music;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class MusicTemplate extends JPanel{
    
    private MusicComponent MusicComponent;
    
    public MusicTemplate (MusicComponent MusicComponent){
        this.MusicComponent = MusicComponent;
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.PINK);
        this.setVisible(true);
    }
}
