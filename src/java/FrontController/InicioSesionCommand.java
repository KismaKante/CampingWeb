/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontController;

import BLL.PersonasBLLL;
import Entiti.Cliente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public class InicioSesionCommand extends ICommand{

    @Override
    public void init(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        
    }
 
    
    
    @Override
    public String process(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        
        servletResponse.setContentType("text/html;charset=UTF-8");
        
        Cliente cliente_A_pasar = new Cliente();
        Cliente cliente_A_Recoger = new Cliente();
//        ----------------------------------------
        PersonasBLLL personasBLL = new PersonasBLLL();
//        ----------------------------------------
        List<Cliente> ListCliente = null;
//        ----------------------------------------
        String dni = servletRequest.getParameter("dni");
        String pass = servletRequest.getParameter("pass");
        
        HttpSession sesion = servletRequest.getSession();
        
        sesion.setAttribute("dni", dni);        
        sesion.setAttribute("pass", pass);        
        try{
           cliente_A_pasar.setDni_cliente(dni);
           cliente_A_pasar.setPassword(pass);
//           ----------------------------------------
           System.out.println(dni +" : " + pass);
//           ----------------------------------------

        ListCliente = personasBLL.mostrar(cliente_A_pasar);
        
        servletRequest.setAttribute("listadoProp", ListCliente);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "Prueba.jsp";
    }
    
}
