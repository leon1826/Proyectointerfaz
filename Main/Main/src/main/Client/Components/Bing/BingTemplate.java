/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Bing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JERE
 */
public class BingTemplate extends JPanel{
    private BingComponent BingComponent;
    private JPanel pBing;
            
    public BingTemplate(BingComponent BingComponent){
        
        this.BingComponent = BingComponent;
        
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
    }   
}

