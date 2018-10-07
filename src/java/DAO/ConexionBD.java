/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author profesor
 */
public class ConexionBD {
    public Connection abrirConexion() throws Exception
    {
       Connection conexion = null;
        Class.forName("com.mysql.jdbc.Driver");
        conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/camping","root","");  
        
        System.out.println("Conectado");
        
       return conexion;
    }
    
    public void cerrarConexion(Connection conexion)throws Exception{
    
        System.out.println("Desconectado");
        conexion.close();
    
    }
}
