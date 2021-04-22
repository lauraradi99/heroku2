/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lcrd.heroku.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class DatosComando {
    
   //Obtiene las respuestas 
    //Lee el archivo de respuestas y valida la  linea
    public ArrayList<ParcialRes> LeerResp(){
                   
            ArrayList<ParcialRes> lista = new ArrayList<>();
            
            
                    lista.add(ParcialRes.parseResp("1|1- Se hace una prueba para ver que falla "
                            + "2- Se hace un código básico para que la prueba pase "
                            + "3- Se refactoriza ese código básico"));
                    lista.add(ParcialRes.parseResp("2|get, post, put y delete"));
                    lista.add(ParcialRes.parseResp("3|AJAX y XML"));
                    lista.add(ParcialRes.parseResp("4|Es una función que pasa a otra función como argumento"));
                    lista.add(ParcialRes.parseResp("5|Como registra los cambios de forma local y push actualiza remotamente"));
               
            
            return lista;
            
      
        
    }
    
    
}
