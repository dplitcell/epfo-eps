package in.net.dpl.servlet;




import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.groovy.binding.FullBinding;

import nl.captcha.Captcha;


/**
 * Servlet implementation class user_auth
 */
@WebServlet("/admin_auth.dpl")
public class admin_auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admin_auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emp_no=request.getSession().getAttribute("emp_no").toString();
		
		
		if(emp_no.equals("dpl_eps")){
			request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
		}
		
		
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("email").toString();
		String password=request.getParameter("pass").toString();
			if(email.equals("dpl_eps")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}
				
			else if(email.equals("pf1")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}
			
			else if(email.equals("pf2")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}
			else if(email.equals("pf3")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}
			
			else if(email.equals("pf4")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}
			else if(email.equals("dpl_kol")&&password.equals("dpl@123")){
				
				request.getSession().setAttribute("emp_no", email);
				request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
			}	
			
			
			
			
			else{
					request.getRequestDispatcher("/WEB-INF/jsp/admin_login.jsp").forward(request, response);
				}
			
			
		
		
		
				
	}
	}


		
		
		
		


