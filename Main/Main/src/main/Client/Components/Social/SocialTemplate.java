/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Social;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author JERE
 */
public class SocialTemplate extends JPanel{
    
    private SocialComponent SocialComponent;
    
    public SocialTemplate(SocialComponent SocialComponent){
        this.SocialComponent = SocialComponent;
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.RED);
        this.setVisible(true);
    }
}
