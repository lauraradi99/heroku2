package com.mycompany.lcrd.heroku.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */
public class ParcialRes {
    private String  id;
    private String resp;
    private ArrayList<ParcialRes> listresp;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public ParcialRes(String id, String resp) {
        this.id = id;
        this.resp = resp;
        this.listresp = new ArrayList<>();
    }
    
    //Estructura la cadena a leer para pasarla
    public static ParcialRes parseResp(String textoRes){
        try {
        String[] datosRes = textoRes.split("\\|");
        String idres = datosRes[0];
        String descRes = datosRes[1];
        ParcialRes nuevo = new ParcialRes(idres,descRes);
        return nuevo;
        } catch (NumberFormatException ex){
            System.err.println("El archivo de respuestas esta corrupto");
            return null;
        }
        
    }
    
     public boolean agregarResp(ParcialRes lasresp){
        return listresp.add(lasresp);
    }
     
     
    
}
