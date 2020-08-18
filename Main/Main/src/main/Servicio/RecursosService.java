/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;





/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class RecursosService {
    private Color colorVerde,colorAzul,colortransparente;
    private Cursor cMano;
    private Font fuente;

    public Font getFuente() {
        this.fuente=new Font("Segoe UI",Font.PLAIN,20);
        return fuente;
    }
    private Border borde;
    private Border bordejuegos;
    
    
    static private RecursosService servicio;
    
    private RecursosService(){}
    ///------------------------------------------------------------
     public Color getColorVerde(){
        colorVerde = new Color(20,130,20);
        return colorVerde;
    } 
     public Color getColorazul(){
         colorAzul = new Color(50,100,200,50);
         return colorAzul;
     }
     ///---------------------------------------------------
     public Cursor getCursorMano(){
        cMano = new Cursor(Cursor.HAND_CURSOR);
        return cMano; 
     }
     
     public Border getBorde(){
        borde = BorderFactory.createLineBorder(colorAzul,1,true);
        return borde; 
     }
    
    ///-----------------------------------------------------------
    public static RecursosService getService(){
        
        if(servicio == null){
            servicio = new RecursosService();
        }
        return servicio;
    }

    public Border getBordejuegos() {
        bordejuegos = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED);
        return bordejuegos;
    }

    public Color getColortransparente() {
        colortransparente= new Color(0,0,0,0);
        return colortransparente;
    }
    
    
}
