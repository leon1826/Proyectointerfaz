/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Games;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author SANTIAGO SANCHES ALVAREZ
 */
public class GameTemplate extends JPanel {
    
    private GameComponent GameComponent;
    private ObjGraficosService sobjgraficos;
    private RecursosService srecursos;
    private ImageIcon fifa,gears,call,iaux;
    private JPanel pgames;
    private JButton b1,b2,b3;
    private JButton bfifa,bgears,bcall;
    private JLabel lfifa,lgears,lcall;
    
    public GameTemplate(GameComponent GameComponent){
        this.GameComponent = GameComponent;
        sobjgraficos = ObjGraficosService.getService();
        srecursos = RecursosService.getService();
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.cyan);
        crearobjdecoradores();
        crearJpanel();
        this.add(pgames);
        crearJbuttons();
        
        crearjuegos();
        crearJlabels();
        this.setVisible(true);
    }
    
    public JButton getopcion(int boton){
        if(boton == 1)
            return this.b1;
        if(boton == 2)
            return this.b2;
        if(boton == 3)
            return this.b3;
        return null;
    }

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }

    public ImageIcon getFifa() {
        return fifa;
    }

    public ImageIcon getGears() {
        return gears;
    }

    public ImageIcon getCall() {
        return call;
    }

    public JPanel getPgames() {
        return pgames;
    }
    
    
    
    public void crearobjdecoradores(){
        fifa = new ImageIcon("Recursos/IMG/fifa20.png");
        gears = new ImageIcon("Recursos/IMG/cancel.png");
        call = new ImageIcon("Recursos/IMG/cancel.png");
    }
    
    public void crearJlabels(){
        lfifa = new JLabel();
        lfifa.setBackground(Color.red);
        iaux= new ImageIcon(fifa.getImage().getScaledInstance(750,600, Image.SCALE_AREA_AVERAGING));
//        lfifa=sobjgraficos.contruirJLabels("Aquiestoy", 0, 0, 750, 600, srecursos.getFuente(), Color.BLACK,srecursos.getCursorMano(),null);
        //lfifa.setBorder(srecursos.getBordejuegos());
        lfifa.setSize(100,100);
        lfifa.setLocation(50, 50);
        
//        lfifa.setIcon(iaux);
        pgames.add(lfifa);
    }
    
    public void crearJbuttons(){
        b1= new JButton();
        b1 = sobjgraficos.construirJButton("Juego 1", 10, 100, 120, 50, srecursos.getColorazul(), null,null, Color.black, srecursos.getFuente(), true);
        this.add(b1);
        b1.addActionListener(GameComponent);
        
        b2= new JButton();
        b2 = sobjgraficos.construirJButton("Juego 2", 10, 200, 120, 50, srecursos.getColorazul(), null,null, Color.black, srecursos.getFuente(), true);
        this.add(b2);
        b2.addActionListener(GameComponent);
        
        b3= new JButton();
        b3 = sobjgraficos.construirJButton("Juego 3", 10, 300, 120, 50, srecursos.getColorazul(), null,null, Color.black, srecursos.getFuente(), true);
        b3.addActionListener(GameComponent);
        
        this.add(b3);
        bfifa = new JButton();
        iaux = new ImageIcon(fifa.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bfifa = sobjgraficos.construirJButton(null,0,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bfifa);
        //////
         bgears= new JButton();
        iaux = new ImageIcon(gears.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bgears = sobjgraficos.construirJButton(null,950,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bgears);
        ////
         bcall = new JButton();
        iaux = new ImageIcon(fifa.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bcall = sobjgraficos.construirJButton(null,1900 ,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bcall);
        
    }
    
    public void crearjuegos(){
         //---------------------JUEGOS---------------------------------------------//
        bfifa = new JButton();
        iaux = new ImageIcon(fifa.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bfifa = sobjgraficos.construirJButton(null,0,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bfifa);
        //////
         bgears= new JButton();
        iaux = new ImageIcon(fifa.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bgears = sobjgraficos.construirJButton(null,950,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bgears);
        ////
         bcall = new JButton();
        iaux = new ImageIcon(fifa.getImage().getScaledInstance(
                750,500, Image.SCALE_AREA_AVERAGING));
        bcall = sobjgraficos.construirJButton(null,1900 ,0,
                750, 600,null, iaux,srecursos.getCursorMano(),null,null,
                false);
        pgames.add(bcall);
        
    }
    
    public void crearJpanel(){
        pgames= new JPanel();
        pgames=sobjgraficos.construirJPanel(150, 0, 850, 650, srecursos.getColortransparente());
        
}
}
