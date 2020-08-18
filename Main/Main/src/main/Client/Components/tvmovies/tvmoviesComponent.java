/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.tvmovies;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ 
 */
public class tvmoviesComponent implements ActionListener{

    private tvmoviesTemplate tvmoviesTemplate;
    
    public tvmoviesComponent(){
        this.tvmoviesTemplate = new tvmoviesTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public tvmoviesTemplate gettvmoviesTemplate(){
        return this.tvmoviesTemplate;
    }
}
