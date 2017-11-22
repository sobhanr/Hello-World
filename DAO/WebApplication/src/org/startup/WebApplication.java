package org.startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WebApplication")
public class WebApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		 String salary1 = request.getParameter("salary");
		 BigDecimal salary= new BigDecimal (salary1); 
		 
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		
		DAOClass class1 = new DAOClass();
		class1.saveData(employee);
		
		PrintWriter out = response.getWriter();
		out.println("Record is Strored in DataBase");
		request.getRequestDispatcher("emp.html").include(request,response);
	}
}
