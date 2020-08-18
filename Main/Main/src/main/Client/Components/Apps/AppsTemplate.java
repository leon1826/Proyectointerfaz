/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Apps;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Client.Components.Tarjeta.TarjetaComponent;
import main.Client.Components.Tarjeta.TarjetaTemplate;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author JERE
 */
public class AppsTemplate extends JPanel{
    
    private AppsComponent AppsComponent;
    private ObjGraficosService ObjGraficos;
    private RecursosService sRecursos;
    private ImageIcon iA1,iA2,iA3,iA4,iA5,iA6,iA7,iA8,iA9,iDim;
    private JPanel pCentro,pA7,pA8,pA9;
    private JLabel lA7,lA8,lA9;
    
    public AppsTemplate(AppsComponent AppsComponent){
        this.AppsComponent = AppsComponent;
        
        ObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        pCentro = ObjGraficos.construirJPanel((1000-970)/2,
                (600-466)/2,970,466,Color.BLACK);
        
        this.add(pCentro);
        this.creardecoradores();
        this.CrearApps();
        
        this.setSize(1000,700);
        this.setLocation(0,70);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
    }
    public void creardecoradores(){
        iA1 = new ImageIcon("Recursos/IMG/A1.png");
        iA2 = new ImageIcon("Recursos/IMG/A2.png");
        iA3 = new ImageIcon("Recursos/IMG/A3.png");
        iA4 = new ImageIcon("Recursos/IMG/A4.png");
        iA5 = new ImageIcon("Recursos/IMG/A5.png");
        iA6 = new ImageIcon("Recursos/IMG/A6.png");
        iA7 = new ImageIcon("Recursos/IMG/A7.png");
        iA8 = new ImageIcon("Recursos/IMG/A8.png");
        iA9 = new ImageIcon("Recursos/IMG/A9.png");
    }
    public void CrearApps(){
        
        TarjetaTemplate A1 = new TarjetaComponent(iA1,"Q"
        ).getTarjetaTemplate();
        A1.setLocation(4,4);
        this.pCentro.add(A1);
        
        
       TarjetaTemplate A2 = new TarjetaComponent(iA2,"W"
        ).getTarjetaTemplate();
       A2.setLocation(4,150+8);
       this.pCentro.add(A2);
       
       TarjetaTemplate A3 = new TarjetaComponent(iA3,"E"
        ).getTarjetaTemplate();
       A3.setLocation(4,300+12);
       this.pCentro.add(A3);
       
       TarjetaTemplate A4 = new TarjetaComponent(iA4,"R"
        ).getTarjetaTemplate();
       A4.setLocation(200+8,4);
       this.pCentro.add(A4);
       
       TarjetaTemplate A5 = new TarjetaComponent(iA5,"T"
        ).getTarjetaTemplate();
       A5.setLocation(200+8,150+8);
       this.pCentro.add(A5);
       
       TarjetaTemplate A6 = new TarjetaComponent(iA6,"Y"
        ).getTarjetaTemplate();
       A6.setLocation(200+8,300+12);
       this.pCentro.add(A6);
       
       //---------------------------------------------------------------
       iDim = new ImageIcon(iA7.getImage().getScaledInstance(
               45,45,Image.SCALE_AREA_AVERAGING));
       lA7 = new JLabel();
       lA7 = ObjGraficos.contruirJLabels(null,
               (275-50)/2,(150-50)/2,45,45, null,null, null,iDim);
       pA7 = new JPanel();
       pA7 = ObjGraficos.construirJPanel(400+12,300+12,
               275,150,sRecursos.getColorVerde());
       pA7.add(lA7);
       this.pCentro.add(pA7);
       //------------------------------------------------------
       iDim = new ImageIcon(iA8.getImage().getScaledInstance(
               45,45,Image.SCALE_AREA_AVERAGING));
       lA8 = ObjGraficos.contruirJLabels(null,
               (275-50)/2,(150-50)/2,45,45, null,null, null,iDim);
       pA8 = new JPanel();
       pA8 = ObjGraficos.construirJPanel(675+16,300+12,
               275,150,sRecursos.getColorVerde());
       pA8.add(lA8);
       this.pCentro.add(pA8);
       //--------------------------------------------------------
       iDim = new ImageIcon(iA9.getImage().getScaledInstance(
               60,60,Image.SCALE_AREA_AVERAGING));
       lA9 = ObjGraficos.contruirJLabels(null,
               (550-50)/2,(300-50)/2,60,60, null,null, null,iDim);
       pA9 = new JPanel();
       pA9 = ObjGraficos.construirJPanel(400+12,4,
               554,304,sRecursos.getColorVerde());
       pA9.add(lA9);
       this.pCentro.add(pA9);
    }
}
