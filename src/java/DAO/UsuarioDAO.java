/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entiti.Cliente;
import Entiti.Cliente_fijo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public class UsuarioDAO {
    
   public List<Cliente> IniciarSesion(Connection conexion, Cliente cliente1) throws Exception{
     
       //System.out.println(cliente1.getPassword());
       String sql = "select * from clientes where dni_cliente = cast(? as char(10)) and PASSWORD=cast(? as char(10))";
       
       List<Cliente> listProp = new ArrayList<>();
       
//       Statement stmt = (Statement) conexion.createStatement();
//       ResultSet datos = stmt.executeQuery(sql);
       System.out.println("DAO "+cliente1.getPassword());

       PreparedStatement pstmt = conexion.prepareStatement(sql);
       
       pstmt.setString(1, cliente1.getDni_cliente());
       pstmt.setString(2, cliente1.getPassword());
       
       ResultSet datos = pstmt.executeQuery();
       
       Cliente cliente;
       while(datos.next()){
           cliente = new Cliente();
           
          cliente.setDni_cliente(datos.getString(1));
          cliente.setPassword(datos.getString(2));
          cliente.setNombre_apellidos(datos.getString(3));
          cliente.setEmail(datos.getString(5));
          cliente.setTelefono(datos.getString(6));
          
          listProp.add(cliente);
       }
       
       return listProp;
   }
   
   public List<Cliente_fijo> MostrarTodo(Connection conexion, Cliente_fijo cliente1) throws Exception{
       
       List<Cliente_fijo> listFijo = new ArrayList<>();
       
       String sql = "select * from clientes INNER join cliente_fijo on clientes.dni_cliente = cliente_fijo.dni_cliente INNER join camping on camping.id_camping = cliente_fijo.id_camping WHERE clientes.nombre_apellidos = ? ";
       
//       Statement stmt = (Statement) conexion.createStatement();
//       ResultSet datos = stmt.executeQuery(sql);
       
       PreparedStatement stmt = conexion.prepareStatement(sql);
       
        stmt.setString(1, cliente1.getNombre_apellidos());
       
       ResultSet datos = stmt.executeQuery();
       
       Cliente_fijo clienteFijo;
       
       while(datos.next()){
          clienteFijo = new Cliente_fijo();
          
          clienteFijo.setNombre_apellidos(datos.getString(3));
          clienteFijo.setDireccion(datos.getString(4));
          clienteFijo.setId_factura(datos.getString(7));                             
          clienteFijo.setImportte_luz(datos.getFloat(9));          
          clienteFijo.setImporte_gas(datos.getFloat(10));  
          clienteFijo.setImporte_agua(datos.getFloat(11)); 
          clienteFijo.setNombre_camping(datos.getString(15));          
          
           
          listFijo.add(clienteFijo);
       }
       
       return listFijo;
   }
   
    public List<Cliente_fijo> MostrarFacturaPorMes(Connection conexion, Cliente_fijo cliente1) throws Exception{
       
       List<Cliente_fijo> listFijo = new ArrayList<>();
       
       String sql = "select * from clientes INNER join cliente_fijo on clientes.dni_cliente = cliente_fijo.dni_cliente "
                                         + "INNER join camping on camping.id_camping = cliente_fijo.id_camping WHERE clientes.nombre_apellidos = ? and cliente_fijo.fecha_de_Factura = ?";
       
//       Statement stmt = (Statement) conexion.createStatement();
//       ResultSet datos = stmt.executeQuery(sql);
       
       PreparedStatement stmt = conexion.prepareStatement(sql);
       
        stmt.setString(1, cliente1.getNombre_apellidos());
        stmt.setString(2, cliente1.getFecha_factura());
       
       ResultSet datos = stmt.executeQuery();
       
       Cliente_fijo clienteFijo;
       
       while(datos.next()){
          clienteFijo = new Cliente_fijo();
          
          clienteFijo.setNombre_apellidos(datos.getString(3));
          clienteFijo.setDireccion(datos.getString(4));
          clienteFijo.setId_factura(datos.getString(7));                             
          clienteFijo.setImportte_luz(datos.getFloat(9));          
          clienteFijo.setImporte_gas(datos.getFloat(10));  
          clienteFijo.setImporte_agua(datos.getFloat(11)); 
          clienteFijo.setNombre_camping(datos.getString(15));          
          
           
          listFijo.add(clienteFijo);
       }
       
       return listFijo;
   }
}
