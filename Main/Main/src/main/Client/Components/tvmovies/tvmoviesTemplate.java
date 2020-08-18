/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.tvmovies;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author JERE
 */
public class tvmoviesTemplate extends JPanel {
    
    private tvmoviesComponent tvmoviesComponent;
    
    public tvmoviesTemplate(tvmoviesComponent tvmoviesComponent){
        this.tvmoviesComponent = tvmoviesComponent;
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }
}
