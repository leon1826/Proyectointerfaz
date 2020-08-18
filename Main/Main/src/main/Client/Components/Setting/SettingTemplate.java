/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Setting;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import main.Client.Components.Tarjeta.TarjetaComponent;
import main.Client.Components.Tarjeta.TarjetaTemplate;
import main.Servicio.ObjGraficosService;
import main.Servicio.RecursosService;

/**
 *
 * @author JERE
 */
public class SettingTemplate extends JPanel{
    
    private SettingComponent SettingComponent;
    private ObjGraficosService sObjgraficos;
    private RecursosService sRecursos;
    private JPanel pbase;
    private ImageIcon iSystem,iPreferences,iProfile,iKinet,
             iAccount, iPrivacy, iFriends, iTurnoff;
    
    public SettingTemplate(SettingComponent SettingComponent){
        this.SettingComponent = SettingComponent;
        sObjgraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        pbase = sObjgraficos.construirJPanel((1000-820)/2,(600-312)/2,820,312,
                Color.BLACK);
        pbase.addMouseListener((MouseListener) this.SettingComponent);
        this.add(pbase);
        
        
        this.crearobjetosdecoradores();
        this.crearconfiguraciones();
        
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }
    
    public void crearobjetosdecoradores(){
        iSystem = new ImageIcon("Recursos/IMG/System.png");
        iPreferences = new ImageIcon("Recursos/IMG/Preferences.png");
        iProfile = new ImageIcon("Recursos/IMG/Profile.png");
        iKinet = new ImageIcon("Recursos/IMG/Kinet.png");
        iAccount = new ImageIcon("Recursos/IMG/Account.png");
        iPrivacy = new ImageIcon("Recursos/IMG/Privacy.png");
        iFriends = new ImageIcon("Recursos/IMG/Friends.png");
        iTurnoff = new ImageIcon("Recursos/IMG/Turnoff.png");
    }
    
    public void crearconfiguraciones(){
        
        
        TarjetaTemplate T1 = new TarjetaComponent(iSystem,"System"
        ).getTarjetaTemplate();
        T1.setLocation(4,4);
        this.pbase.add(T1);
        
        TarjetaTemplate T2 = new TarjetaComponent(iPreferences,
                "Preferences"
        ).getTarjetaTemplate();
        T2.setLocation(200+8,4);
        this.pbase.add(T2);
        
        TarjetaTemplate T3 = new TarjetaComponent(iProfile,
                "Profile"
        ).getTarjetaTemplate();
        T3.setLocation(400+12,4);
        this.pbase.add(T3);
        
        TarjetaTemplate T4 = new TarjetaComponent(iKinet,"Kinet"
        ).getTarjetaTemplate();
        T4.setLocation(600+16,4);
        this.pbase.add(T4);
        
        TarjetaTemplate T5 = new TarjetaComponent(iAccount,
                "Account"
        ).getTarjetaTemplate();
        T5.setLocation(4,T1.getHeight()+8);
        this.pbase.add(T5);
        
        TarjetaTemplate T6 = new TarjetaComponent(iPrivacy,
                "Privacy"
        ).getTarjetaTemplate();
        T6.setLocation(200+8,T1.getHeight()+8);
        this.pbase.add(T6);
        
        TarjetaTemplate T7 = new TarjetaComponent(iFriends,
                "Friends"
        ).getTarjetaTemplate();
        T7.setLocation(400+12,T1.getHeight()+8);
        this.pbase.add(T7);
        
        TarjetaTemplate T8 = new TarjetaComponent(iTurnoff,
                "Turn off"
        ).getTarjetaTemplate();
        T8.setLocation(600+16,T1.getHeight()+8);
        this.pbase.add(T8);
    }
}
