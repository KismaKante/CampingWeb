/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author - kisma kante - 1Dawnm161711@gtmail.com
 */
public abstract class ICommand {
    
     public void init(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        
    }
    
    public abstract String process(HttpServletRequest servletRequest, HttpServletResponse servletResponse);

}
