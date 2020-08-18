/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Client.Components.Principal;

import java.awt.Color;
import javax.swing.JPanel;
import main.Servicio.ObjGraficosService;

/**
 *
 * @author JERE
 */
public class PricipalTemplate extends JPanel {

    private PrincipalComponent PrincipalComponent;
    private ObjGraficosService sObjgraficos;
    
    public PricipalTemplate(PrincipalComponent PrincipalComponent){
        
        this.PrincipalComponent = PrincipalComponent;
        
        
        this.setLayout(null);
        this.setSize(1000,650);
        this.setLocation(0,70);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
    }


}
