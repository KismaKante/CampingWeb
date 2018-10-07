/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.ConexionBD;
import DAO.UsuarioDAO;
import Entiti.Cliente;
import Entiti.Cliente_fijo;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public class PersonasBLLL {

    public List<Cliente> mostrar(Cliente cliente1) throws Exception{
        System.out.println("BLL dni "+cliente1.getDni_cliente());
        System.out.println("BLL pass "+cliente1.getPassword());
        ConexionBD conexionBD = new ConexionBD();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Connection conexion = null;
        List<Cliente> listCliente = null;
        try {

            conexion = conexionBD.abrirConexion();
            
            listCliente = usuarioDAO.IniciarSesion((com.mysql.jdbc.Connection) conexion, cliente1);
            
//            System.out.println(conexion);
            
            
            conexionBD.cerrarConexion(conexion);
        } catch (Exception e) {
            System.out.println(e);
        }

        return listCliente;
    }

    public List<Cliente_fijo> mostrarTodo(Cliente_fijo cliente1) throws Exception{
        
        ConexionBD conexionBD = new ConexionBD();
        UsuarioDAO usuariuoDAO = new UsuarioDAO();
        Connection conexion = null;
        
        List<Cliente_fijo> listFijo = null;
        
        try{
            
            conexion = conexionBD.abrirConexion();
            listFijo = usuariuoDAO.MostrarTodo((com.mysql.jdbc.Connection) conexion, cliente1);
            
            conexionBD.cerrarConexion(conexion);
        }catch(Exception e){
            System.out.println(e);
        }
        
        return listFijo;
    }
    
     public List<Cliente_fijo> mostrarFacPorMes(Cliente_fijo cliente1) throws Exception{
        
        ConexionBD conexionBD = new ConexionBD();
        UsuarioDAO usuariuoDAO = new UsuarioDAO();
        Connection conexion = null;
        
        List<Cliente_fijo> listFijo = null;
        
        try{
            
            conexion = conexionBD.abrirConexion();
            listFijo = usuariuoDAO.MostrarFacturaPorMes((com.mysql.jdbc.Connection) conexion, cliente1);
            
            conexionBD.cerrarConexion(conexion);
        }catch(Exception e){
            System.out.println(e);
        }
        
        return listFijo;
    }
}
