/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Макс
 */
public class CalcServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalcServ at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        int x,y;
        String str="";
        x=Integer.parseInt(request.getParameter("txtfno"));
        y=Integer.parseInt(request.getParameter("txtsno"));
        str=request.getParameter("operation");
        if(str.equals("add"))
            out.println("<h1>Result of addition is:" +(x+y)+"</h1>");
        else if(str.equals("sub"))
            out.println("<h1>Result of substraction is:" +(x-y)+"</h1>");
        else if(str.equals("mul"))
            out.println("<h1>Result of multiplication is:" +(x*y)+"</h1>");
        else if(str.equals("div"))
            out.println("<h1>Result of division is:" +(x/y)+"</h1>");
         else if(str.equals("exp"))
            out.println("<h1>Result of exponent operator is:" +Math.pow(x,y)+"</h1>");
        else
            out.println("<h1>Result of square root is:"+Math.sqrt(x*y)+"</h1>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
