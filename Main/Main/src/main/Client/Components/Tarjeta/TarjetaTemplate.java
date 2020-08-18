/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.Client.Components.Tarjeta;

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
 * @author JERE
 */

public class TarjetaTemplate extends JPanel {
    
    private TarjetaComponent TarjetaComponent;
    private ObjGraficosService sObjgraficos;
    private RecursosService sRecursos;
    private ImageIcon iDimAux;
    private JLabel limagen, ltexto;
    
    public TarjetaTemplate(
            TarjetaComponent TarjetaComponent,ImageIcon imagen,
            String texto){
        
        this.TarjetaComponent = TarjetaComponent;
        this.TarjetaComponent.getClass();
        sObjgraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        
        
        iDimAux = new ImageIcon(
                imagen.getImage().getScaledInstance(
                45,45, Image.SCALE_AREA_AVERAGING));
                
        
        limagen = sObjgraficos.contruirJLabels(null,(200-45)/2,(150-50)/2,
                45,45, null, Color.WHITE, null,iDimAux);
        this.add(limagen);
        
        ltexto = sObjgraficos.contruirJLabels(texto,10,100,
                150,50, null, Color.WHITE, null,null);
        this.add(ltexto);
        
       
       this.setSize(200,150);
       this.setBackground(sRecursos.getColorVerde());
       this.setLayout(null);
       this.setVisible(true);
    } 
}
