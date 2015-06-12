package com.it.junly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class TestJdni
 */
@WebServlet("/TestJdni")
public class TestJdni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJdni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jndi.xml");  
		 BaseDAO  baseDAO  = (BaseDAO) context.getBean("testJNDI");
		 String sql = "insert into user(id,name) vlaues(4,'lijun')";
		 baseDAO.insert(sql);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
public static void main(String[] args) {
/*	 ApplicationContext context = new ClassPathXmlApplicationContext("spring-jndi.xml");  
*/	
}
}
