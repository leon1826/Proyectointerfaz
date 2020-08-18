/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Vista_Inicial;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import main.Servicio.ObjGraficosService;


/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class Vista1Template extends JFrame {
    
    private Vista1Component Vista1Component;
    
    //Servicios
    private ObjGraficosService sObjgraficos;
   
    //Paneles
    private JPanel pMenu,pPrincipal,porden;
     
    
    public Vista1Template(Vista1Component Vista1Component){
               
        this.Vista1Component = Vista1Component;
        sObjgraficos = ObjGraficosService.getService();
        this.addMouseMotionListener(Vista1Component);
       
    ///Paneles
        this.crearJPanels();
       
         //Configuracion de la pantalla principal
        this.crearVentana();
    }
    
    public void crearJPanels(){
        
        pMenu = new JPanel();
        pMenu = sObjgraficos.construirJPanel(0,
                0,1000,70,null);
        this.add(pMenu);
        //----------------------------------------------------
        pPrincipal = new JPanel();
        pPrincipal = sObjgraficos.construirJPanel(0,
                70,1000,650,null);
        this.add(pPrincipal);
        //-----------------------------------
    }
    
    ///Configuracion de la pantalla principal--------------------
    public void crearVentana(){
      
        this.setLayout(null);
        this.setSize(1000,720);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.setUndecorated(true);
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);  
    }
    
    public JPanel getpMenu(){
        return this.pMenu;
    }
    
    public JPanel getPrincipal(){
        return this.pPrincipal;
    }
    
    
    
}
   

