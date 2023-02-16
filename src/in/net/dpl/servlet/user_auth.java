package in.net.dpl.servlet;




import in.net.dpl.utility.ConnDB;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
@WebServlet("/user_auth.dpl")
public class user_auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_auth() {
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
		else if(emp_no.length()>0){
			request.getRequestDispatcher("/WEB-INF/jsp/user_home.jsp").forward(request, response);
		}
		
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("email").toString();
		String password=request.getParameter("pass").toString();
		
String retFlag = "N";
        
        
        //APP_VALIDATE_USER(p_user, p_pwd)
        
        try
        {
        	
            Connection con=new ConnDB().make_connection(); //create connection
            
            PreparedStatement pstmt=null; //create statement
            
            
            CallableStatement cstmt = con.prepareCall("{? = call APP_VALIDATE_USER(?,?)}");
    		//conn.prepareCall("{? = CALL balance(?)}");
    		cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
    		cstmt.setString(2,email);
    		cstmt.setString(3,password);
    		
    		
    		cstmt.executeUpdate();
    		retFlag = cstmt.getString(1);
    		con.close();
                      
             
            if(retFlag.equals("Y"))
            {  
                request.getSession().setAttribute("emp_no", email);
            	request.getRequestDispatcher("/WEB-INF/jsp/user_home.jsp").forward(request, response);
                
            } 
            else{
				request.getRequestDispatcher("/WEB-INF/jsp/user_login.jsp").forward(request, response);
			}
           
                      
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
		

			
		
		
		
				
	}
	}


		
		
		
		


