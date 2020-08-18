/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Login_Usuario;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import main.Client.Vista_Inicial.Vista1Component;
import main.Servicio.RecursosService;
import main.Servicio.logicos.UsuarioService;

/**
 *
 * @author JERE
 */
public class LoginComponent implements ActionListener, MouseListener {
    
    private LoginTemplate LoginTemplate;
    private Vista1Component Vista1Component;
    private RecursosService sRecursos;
    private UsuarioService sUsuario;
    
    public LoginComponent(){
        sUsuario = UsuarioService.getService();
        this.LoginTemplate = new LoginTemplate(this);
        sRecursos = RecursosService.getService();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == LoginTemplate.getBSiguiente()){
             entrar();
        }
        if(ae.getSource() == LoginTemplate.getBSalir()){
            System.exit(0);
        }
    }
    
    public LoginTemplate getLoginTemplate(){
        return this.LoginTemplate;
    }
    
    public void entrar(){
        String nombre = LoginTemplate.getTcorreo().getText();
        String clave = new String(LoginTemplate.getTcontrasena().getPassword());
        if(sUsuario.verificarDatosUsuario(nombre, clave)){
            JOptionPane.showMessageDialog(null, "Ingreso exitoso");
            this.Vista1();
        }
        else
            JOptionPane.showMessageDialog(null, "Falla");
            
        
    }
    
    
    public void Vista1(){
        
        if(Vista1Component == null)
            Vista1Component = new Vista1Component();
        else
            this.Vista1Component.getVista1Template().setVisible(true);
        
        LoginTemplate.setVisible(false);
    }
    
    

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() == LoginTemplate.getTcorreo()){
            if(LoginTemplate.getTcorreo().getText().equals("Correo electrónico,teléfono o Skype")){
            LoginTemplate.getTcorreo().setText(" ");
            }
            LoginTemplate.getTcorreo().setForeground(Color.BLACK);
        }
        if(me.getSource() == LoginTemplate.getTcontrasena()){
            if(new String (LoginTemplate.getTcontrasena().getPassword()).equals("contrasena")){
                LoginTemplate.getTcontrasena().setText(" ");
        }
            
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == LoginTemplate.getBSiguiente()){
            LoginTemplate.getBSiguiente().setContentAreaFilled(true);
            LoginTemplate.getBSiguiente().setBackground(sRecursos.getColorazul());
        }
        if(me.getSource() == LoginTemplate.getlCreeuna()){
            LoginTemplate.getlCreeuna().setForeground(sRecursos.getColorazul());   
        }
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == LoginTemplate.getBSiguiente()){
            LoginTemplate.getBSiguiente().setContentAreaFilled(false);
            LoginTemplate.getBSiguiente().setBackground(Color.BLUE);
        }
        if(me.getSource() == LoginTemplate.getlCreeuna()){
            LoginTemplate.getlCreeuna().setForeground(Color.BLUE);
        }
    }
}
