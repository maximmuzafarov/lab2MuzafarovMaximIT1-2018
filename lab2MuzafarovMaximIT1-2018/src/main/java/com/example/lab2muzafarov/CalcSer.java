package com.example.lab2muzafarov;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcSer extends HttpServlet {

    static int num1,num2;

    protected void doPostt(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if(request.getParameter("btnsubmit").equals("+"))
            {
                num1 = Integer.parseInt(request.getParameter("txtnum1"));

                response.sendRedirect("index.jsp?q1="+num1);

            }
            else if(request.getParameter("btnsubmit").equals("="))
            {

                int num3 = num1+Integer.parseInt(request.getParameter("txtnum1"));
                response.sendRedirect("index.jsp?q="+num3);

            }
            else if(request.getParameter("txtnum1")!=null)
                response.sendRedirect("index.jsp?q="+(request.getParameter("txtnum1")+request.getParameter("btnsubmit")));


            else
            {
                if(request.getParameter("q1")!=null)
                    response.sendRedirect("index.jsp?q="+request.getParameter("btnsubmit")+"&q1="+request.getParameter("q1"));
                else
                    response.sendRedirect("index.jsp?q="+request.getParameter("btnsubmit"));
            }


        }
    }


}

