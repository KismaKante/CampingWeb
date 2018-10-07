/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entiti;

import java.sql.Date;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public class Cliente_fijo {

    
    private String nombre_apellidos          ;
    private String direccion;
    private String id_factura;
    private String fecha_factura;
    private float importe_gas;
    private float importte_luz;
    private float importe_agua;
    private String nombre_camping;
    private String id_camping;

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    
    
    public float getImporte_gas() {
        return importe_gas;
    }

    public void setImporte_gas(float importe_gas) {
        this.importe_gas = importe_gas;
    }

    public float getImportte_luz() {
        return importte_luz;
    }

    public void setImportte_luz(float importte_luz) {
        this.importte_luz = importte_luz;
    }

    public float getImporte_agua() {
        return importe_agua;
    }

    public void setImporte_agua(float importe_agua) {
        this.importe_agua = importe_agua;
    }

    public String getNombre_camping() {
        return nombre_camping;
    }

    public void setNombre_camping(String nombre_camping) {
        this.nombre_camping = nombre_camping;
    }

    public String getId_camping() {
        return id_camping;
    }

    public void setId_camping(String id_camping) {
        this.id_camping = id_camping;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

   
 

    

    

}
