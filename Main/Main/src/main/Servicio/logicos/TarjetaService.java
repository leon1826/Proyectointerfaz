/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio.logicos;

import java.util.ArrayList;
import models.Tajeta;

/**
 *
 * @author Leon1
 */
public class TarjetaService {
    
    private static TarjetaService servicio;
    private ArrayList<Tajeta> tarjetas;
    
    public TarjetaService(){
        tarjetas = new ArrayList<Tajeta>();
    }
    
    
    
    public static TarjetaService getService(){
    if(servicio == null){
        servicio =  new TarjetaService();           
    }
    return servicio;
}
}