/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.servlet;

import javax.servlet.annotation.WebServlet;

@WebServlet({"/ejemplo/*"})
public class CustomerServlet extends GenericServlet {

    @Override
    public String getServletInfo() {
        return "Servlet Customer Controller, ruta base: /principal";
    }
    
}
