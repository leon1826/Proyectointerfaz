/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Usuario;

/**
 *
 * @author Leon1
 */
public class Controlusuario {
    
    private ArrayList<Usuario> usuarios;
    
    public Controlusuario(){
        usuarios = new ArrayList<Usuario>();
        cargarDatos();
    }
    
     public void cargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src/archives/usuarios.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                String[] atributos = linea.split(",");
                Usuario usuario = new Usuario();
                usuario.setNombreusuario(atributos[0]);
                System.out.println(atributos[0]);
                usuario.setClaveusuario(atributos[1]);   
                usuarios.add(usuario);
            }
            fr.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
         
     
     public boolean verificarUsuario(String nombre,String clave){
         System.out.println(nombre);
         
         for(Usuario usuario: usuarios){
             if(usuario.getNombreusuario().equals(nombre))
                 if(usuario.getClaveusuario().equals(clave))
                     return true;
         }
         return false;
     }
            
    
}
