/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

/**
 *
 * @author JERE
 */
public class ObjGraficosService extends JFrame{
    
    private JPanel panel;
    private JLabel label;
    private JButton boton;
    private JPasswordField pass;
    
    ///Decoradores-----------------------------------
    private Color color;
    private Font fonts;
    //-----------------------------------------------
    
    static private ObjGraficosService servicio;

    private ObjGraficosService(){}
    ///------------------------------------------------------------------
    public JLabel contruirJLabels(String texto,int X,int Y,
            int Ancho,int Largo,Font fonts,Color colorfuente,Cursor cursor,
            ImageIcon imagen){
        
        label = new JLabel(texto);
        label.setLocation(X, Y);
        label.setSize(Ancho,Largo);
        label.setFont(fonts);
        label.setIcon(imagen);
        label.setCursor(cursor);
        label.setForeground(colorfuente);
        return label;
    }
    ///--------------------------------------------------------------------    
    public JPanel construirJPanel(int x,int y,int Ancho,
        int Largo,Color ColorFondo){
        
        panel = new JPanel();
        panel.setSize(Ancho,Largo);
        panel.setLocation(x,y);
        panel.setBackground(ColorFondo);
        panel.setLayout(null);
 
        return panel;
    }
    ///-------------------------------------------------------------------------- 
    public JButton construirJButton(String Texto, int X,int Y,int Ancho
            ,int Largo, Color colorfondo,ImageIcon imagen ,
            Cursor cursor,Color colorfuente,Font fontfuente,boolean esSolido){
        
        boton = new JButton(Texto);
        boton.setBounds(X, Y, Ancho, Largo);
        boton.setBackground(colorfondo);
        boton.setForeground(colorfuente);
        boton.setFont(fontfuente);
        boton.setIcon(imagen);
        boton.setCursor(cursor);
        boton.setHorizontalTextPosition(SwingConstants.CENTER);
        boton.setFocusable(false);
        boton.setContentAreaFilled(esSolido);
        boton.setLayout(null);
        
        return boton;
    }
    
    public JPasswordField contruirJPasswordField(String texto,int X, int Y,int ancho,int alto, Color color,Font fontfuente){
//        pass.setLocation(X, Y);
  //      pass.setSize(ancho,alto);
    //    pass.setFont(fontfuente);
//        label.setIcon(imagen);
//        pass.setCursor(cursor);
        //pass.setForeground(color);
        
        return pass; 
    }
    ///-------------------------------------------------------------
    public static ObjGraficosService getService(){
        if (servicio == null){
            servicio = new ObjGraficosService();
        }
        return servicio;
    }
    
}
