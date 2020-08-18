/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Games;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;

/**
 *
 * @author SANTIAGO SANCHEZ ALVAREZ
 */
public class GameComponent implements ActionListener{

    private GameTemplate GameTemplate;
    private int estado = 1,estadoanterior = 0,direccion = -1;
    private Timer timer;
    
    
    public GameComponent(){
        this.timer = new Timer(2, this);
        this.GameTemplate = new GameTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.estadoanterior=estado;
//        this.GameTemplate.getopcion(estadoanterior).setBackground(Color.cyan);
        if(ae.getSource() == GameTemplate.getopcion(1))
            System.out.println("aqui esta");
            this.estado=1;
            this.direccion = -1;
        if(ae.getSource() == GameTemplate.getopcion(2))
            this.estado=2;
        if(ae.getSource() == GameTemplate.getopcion(3))
            this.estado=3;
            this.direccion = 1;
//        this.GameTemplate.getopcion(estado).setBackground(Color.red);
        timer.start();
        mover();
        
    }
    
    
    public void mover(){
    switch(estado){
        case 1:
                if(GameTemplate.getPgames().getX()== 150){
                    timer.stop();
                    System.out.println("esta aqui");
                }
                else
                    GameTemplate.getPgames().setLocation(GameTemplate.getPgames().getX()+1, getGameTemplate().getPgames().getY());
            break;
        case 2:
            if(GameTemplate.getPgames().getX()== -800)
                timer.stop();
                else
                    GameTemplate.getPgames().setLocation(GameTemplate.getPgames().getX()+direccion, getGameTemplate().getPgames().getY());
            break;
        case 3:
            if(GameTemplate.getPgames().getX()==-1750)
                timer.stop();
                else
                    GameTemplate.getPgames().setLocation(GameTemplate.getPgames().getX()-1, getGameTemplate().getPgames().getY());
            break;
        default:
            break;
    }
    GameTemplate.repaint();
    }
    
    public GameTemplate getGameTemplate(){
        return this.GameTemplate;
    }

//    @Override
//    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
