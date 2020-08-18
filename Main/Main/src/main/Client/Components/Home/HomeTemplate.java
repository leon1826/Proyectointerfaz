/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import main.Client.Components.Tarjeta.TarjetaComponent;
import main.Client.Components.Tarjeta.TarjetaTemplate;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class HomeTemplate extends JPanel{
    
    private HomeComponent HomeComponent;
    private ObjGraficosService sObjgraficos;
    private RecursosService sRecursos;
    
    //Paneles
    private JPanel pCentro,pJuego,pYoutube,pSport,pDance, pHalo4,
            pmooron,pHunger;
    
    //botones
    private JButton bPins,bRecent,bJuego,
            bYoutube,bSport,bDance, bHalo4,
            bmooron,bHunger;
    
    
    ///decoradores
    private Color colorTransparente, colorVista;
    private Font  fontPins, fontRecent;
    private Cursor cMano;
    private ImageIcon iHALO4,iDance,iSport,iYoutube,
            iJuego,imooron,iHunger,iPins,iRecent, iDim;
    
    
    
    public  HomeTemplate(HomeComponent HomeComponent){
        this.HomeComponent = HomeComponent;
        
        sObjgraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        pCentro = sObjgraficos.construirJPanel((1000-970)/2,
                (600-466)/2,970,466,Color.BLACK);
        this.add(pCentro);
        
        this.crearObjetosDecoradores();
        this.crearJButtons();
        this.crearJPanels();
        
        
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }
    
    ///objetos decoradores------------------------------------
    public void crearObjetosDecoradores(){
        
        ///decoraciones
        colorVista = new Color(0,0,180);//fondo vista
        colorTransparente = new Color(15,0,10,70);//color de los paneles para los botones 
        fontPins = new Font("Baskerville Old Face",Font.PLAIN,18);
        
        //imagenes
        iHALO4 = new ImageIcon("Recursos/IMG/HALO4.jpg");
        iDance = new ImageIcon("Recursos/IMG/DANCE.jpg");
        iSport = new ImageIcon("Recursos/IMG/ESPA.jpg");
        iYoutube = new ImageIcon("Recursos/IMG/youtube.jpg");
        iJuego = new ImageIcon("Recursos/IMG/juego.jpg");
        iHunger = new ImageIcon("Recursos/IMG/Hungar.jpg");
        imooron = new ImageIcon("Recursos/IMG/maroon.jpg");
        iPins = new ImageIcon("Recursos/IMG/Pins.png");
        iRecent = new ImageIcon("Recursos/IMG/Recent.png");
        
        
    } 
    
    ///Botones del menu---------------------------------------
    public void crearJButtons(){
            
         ///PRIMER COLUMNA-----------------------------------------------------------------------------------
       
        bJuego = new JButton();
        iDim = new ImageIcon(iHunger.getImage().getScaledInstance(
                200,150, Image.SCALE_AREA_AVERAGING));
        bJuego = sObjgraficos.construirJButton(null,4,4,
                200, 150,null, iDim,null,null,null,
                false);
        //this.add(bJuego);
        this.pCentro.add(bJuego);
        
        TarjetaTemplate H1 = new TarjetaComponent(iPins,"Pins"
        ).getTarjetaTemplate();
        H1.setLocation(4,150+8);
        this.pCentro.add(H1);
        
        TarjetaTemplate H2 = new TarjetaComponent(iRecent,"Recent"
        ).getTarjetaTemplate();
        H2.setLocation(4,300+12);
        bRecent = new JButton();
        this.pCentro.add(H2);
         
        ///SEGUNDA COLUMNA--------------------------------------------------
        bDance = new JButton();
        iDim = new ImageIcon(iDance.getImage().getScaledInstance(
                200,150, Image.SCALE_AREA_AVERAGING));
        bDance = sObjgraficos.construirJButton(null,750+16,4,200,
                150,null, iDim,null,null,null,false);
        ///bDance.setBounds(900, 150, 200, 150);
        //this.add(bDance);
        this.pCentro.add(bDance);
       
        bYoutube = new JButton();
        iDim = new ImageIcon(iYoutube.getImage().getScaledInstance(
                200,150, Image.SCALE_AREA_AVERAGING));
        bYoutube = sObjgraficos.construirJButton(null,750+16,158,
                200, 150,null,iDim,null,null,null,false);
        //this.add(bYoutube);
        this.pCentro.add(bYoutube);
        
        bSport = new JButton();
        iDim = new ImageIcon(iSport.getImage().getScaledInstance(
                200,150, Image.SCALE_AREA_AVERAGING));
        bSport = sObjgraficos.construirJButton(null,750+16,312,200,
                150,null, iDim, null,null,null,false);
        //this.add(bSport);
        this.pCentro.add(bSport);
        
        //Columna central--------------------------------------------------------------------------------------------
        bHalo4 = new JButton();
        iDim = new ImageIcon(iHALO4.getImage().getScaledInstance(
                550,300, Image.SCALE_AREA_AVERAGING));
        bHalo4 = sObjgraficos.construirJButton(null,208,4,558,
                304,null, iDim,null,null,null,false);
        //this.add(bHalo4);
        this.pCentro.add(bHalo4);
        
        bHunger = new JButton();
        iDim = new ImageIcon(iJuego.getImage().getScaledInstance(
                275,150, Image.SCALE_AREA_AVERAGING));
        bHunger = sObjgraficos.construirJButton(null,208,300+12,275,
                150,null,iDim,null,null,null,false);
        //this.add(bHunger);
        this.pCentro.add(bHunger);
        
        bmooron = new JButton();
        iDim = new ImageIcon(imooron.getImage().getScaledInstance(275,150,
                Image.SCALE_AREA_AVERAGING));
        bmooron = sObjgraficos.construirJButton(null,212+275,300+12,
                275,150,null, iDim,null,null,null,false);
        this.pCentro.add(bmooron);
        //this.add(bmooron);
        }   
    
    public void crearJPanels(){
        //------------------------------------------------------
        pJuego = sObjgraficos.construirJPanel(0,110,
                200,40,colorTransparente);//colorTransparente
        bJuego.add(pJuego);
        //----------------------------------------------------
        pYoutube = sObjgraficos.construirJPanel(0,110,
                200,40,colorTransparente);
        bYoutube.add(pYoutube);
        //----------------------------------------------------
        pSport = sObjgraficos.construirJPanel(0,110,
                200,40,colorTransparente);
        bSport.add(pSport);
        //----------------------------------------------------
        pDance = sObjgraficos.construirJPanel(0,110,
                200,40,colorTransparente);//colorTransparente
        bDance.add(pDance);
        //----------------------------------------------------
        pHalo4 = sObjgraficos.construirJPanel(0,260,
                550,40,colorTransparente);//colorTransparente
        bHalo4.add(pHalo4);
        //----------------------------------------------------
        pmooron = sObjgraficos.construirJPanel(0,110,
                275,40,colorTransparente);//colorTransparente
        bmooron.add(pmooron);
        //----------------------------------------------------
        pHunger = sObjgraficos.construirJPanel(0,110,
                275,40,colorTransparente);//colorTransparente
        bHunger.add(pHunger);
                
        //----------------------------------------------------
    }
}
