/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Tarjeta;

import javax.swing.ImageIcon;

/**
 *
 * @author JERE
 */
public class TarjetaComponent {
    
    private TarjetaTemplate TarjetaTemplate;
    
    public TarjetaComponent(ImageIcon imagen,
            String texto){
        this.TarjetaTemplate = new TarjetaTemplate(
                this,imagen,texto);
    }
    
    public TarjetaTemplate getTarjetaTemplate(){
        return TarjetaTemplate;
    }
}
