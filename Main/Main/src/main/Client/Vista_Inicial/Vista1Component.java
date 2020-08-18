/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Vista_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import main.Client.Components.Apps.AppsComponent;
import main.Client.Components.Bing.BingComponent;
import main.Client.Components.Games.GameComponent;
import main.Client.Components.Home.HomeComponent;
import main.Client.Components.Menu.MenuComponent;
import main.Client.Components.Menu.MenuTemplate;
import main.Client.Components.Music.MusicComponent;
import main.Client.Components.Principal.PrincipalComponent;
import main.Client.Components.Setting.SettingComponent;
import main.Client.Components.Social.SocialComponent;
import main.Client.Components.tvmovies.tvmoviesComponent;

/**
 *
 * @author Santiago Sanchez Alvarez
 */
public class Vista1Component implements ActionListener, MouseListener, MouseMotionListener {
    
    private Vista1Template Vista1Template; 
    private MenuComponent MenuComponent;
    private PrincipalComponent PrincipalComponent;
    private MenuTemplate MenuTemplate;
    private AppsComponent AppsComponent;
    private BingComponent BingComponent;
    private GameComponent GameComponent;
    private HomeComponent HomeComponent;
    private MusicComponent MusicComponent;
    private SettingComponent SettingComponent;
    private SocialComponent SocialComponent;
    private tvmoviesComponent tvmoviesComponent;
    private JButton boton;
    
    public Vista1Component(){
        
        this.Vista1Template = new Vista1Template(this);
        
        //Hereda
        MenuComponent = new MenuComponent(this);
        Vista1Template.getpMenu().add(
                MenuComponent.getMenuTemplate()
        );
        PrincipalComponent =  new PrincipalComponent();
        Vista1Template.getPrincipal().add(
                PrincipalComponent.getPricipalTemplate()
        );
        
    }
            
    @Override
    public void actionPerformed(ActionEvent ae) {
    }
    
    public Vista1Template getVista1Template(){
        return this.Vista1Template;
    }
    
    public void Mostrar(String Comando){
        Vista1Template.getPrincipal().removeAll();
        
        switch(Comando){////Control botones Menu
            case "Bing": 
                if(BingComponent == null)
                    Vista1Template.getPrincipal().add(
                        new BingComponent().getBingTemplate());
                
                else
                    BingComponent.getBingTemplate().setVisible(true);
                break;
                
            case "Home": 
                if(HomeComponent == null)
                    Vista1Template.getPrincipal().add(
                        new HomeComponent().getHomeTemplate());
                
                else
                    HomeComponent.getHomeTemplate().setVisible(true);
                break;
                
            case "Social": 
                if(SocialComponent == null)
                    Vista1Template.getPrincipal().add(
                        new SocialComponent().getSocialTemplate());
                
                else
                    SocialComponent.getSocialTemplate().setVisible(true);
                break;
                
            case "Games": 
                if(GameComponent == null)
                    Vista1Template.getPrincipal().add(
                        new GameComponent().getGameTemplate());
                
                else
                    GameComponent.getGameTemplate().setVisible(true);
                break;
                
            case "Tv": 
                if(tvmoviesComponent == null)
                    Vista1Template.getPrincipal().add(
                        new tvmoviesComponent().gettvmoviesTemplate());
                
                else
                    tvmoviesComponent.gettvmoviesTemplate().setVisible(true);
                break;
                
            case "Music": 
                if(MusicComponent == null)
                    Vista1Template.getPrincipal().add(
                        new MusicComponent().getMusicTemplate());
                
                else
                    MusicComponent.getMusicTemplate().setVisible(true);
                break;    
                
            case "Apps": 
                if(AppsComponent == null)
                    Vista1Template.getPrincipal().add(
                        new AppsComponent().getAppsTemplate());
                
                else
                    AppsComponent.getAppsTemplate().setVisible(true);
                break;    
                
            case "Setting": 
                if(SettingComponent == null)
                    Vista1Template.getPrincipal().add(
                        new SettingComponent().getSettingTemplate());
                
                else
                    SettingComponent.getSettingTemplate().setVisible(true);
                break;
            case "-":
                System.exit(0);
        }
        Vista1Template.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() instanceof JButton){
            boton = ((JButton) me.getSource());
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    public void moverVentana(int posicionx, int posiciony){
        this.Vista1Template.setLocation(posicionx, posiciony);
    }
}
