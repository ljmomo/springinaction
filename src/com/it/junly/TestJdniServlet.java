package com.it.junly;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
@WebServlet("/TestJdniServlet")
public class TestJdniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJdniServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jndi.xml");  
		 BaseDAO  baseDAO  = (BaseDAO) context.getBean("sqlBaseDAO");
		// String sql = "insert into user(username) values('lijun')";
		 String sql = "select * from SASTB_USERS";
		 List<Map<String, Object>> list = baseDAO.select(sql);
		 for (Map<String, Object> map : list) {
			 System.out.println(map.get("username"));
			 System.out.println(map.get("pass"));
		}
		// baseDAO.insert(sql);
		 
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
