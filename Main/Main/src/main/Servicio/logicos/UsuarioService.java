/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Servicio.logicos;

import logic.Controlusuario;
import models.Usuario;

/**
 *
 * @author Leon1
 */
public class UsuarioService {
    private static UsuarioService servicio;
    private Controlusuario cUsuario;
    private String usuarioLogeado;
    
    public UsuarioService() {
        cUsuario = new Controlusuario();
    }

    public boolean verificarDatosUsuario(String nombreUsuario, String claveUsuario){
        if(cUsuario.verificarUsuario(nombreUsuario, claveUsuario)){
            this.usuarioLogeado = nombreUsuario;
            return true;
        }
        return false;
    }

    public Usuario getUsuarioLogeado(){
        return null;
    }

    public static UsuarioService getService(){
        if(servicio == null)
            servicio = new UsuarioService();
        return servicio;
    }
}
    

