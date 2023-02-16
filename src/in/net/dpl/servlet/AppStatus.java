package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;
import in.net.dpl.utility.EmployeeDomain;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppStatus
 */
@WebServlet("/AppStatus")
public class AppStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emp_code=request.getParameter("emp_no");
		String query="select a.app_status_name from eps_option_status_master a,eps_option b where b.emp_no='"+emp_code+"' and a.app_status_code = b.app_status_code ";
		String status=null;

    	
    	try{
			
			Connection conn=new ConnDB().make_connection();
			System.out.println("Query from jquery-"+query);
			ResultSet rs = conn.createStatement().executeQuery(query);
			while(rs.next()){
				
				
				status=rs.getString(1);
				
				
				
			}
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
    	
    	
    	request.setAttribute("status", status);
    	request.getRequestDispatcher("/WEB-INF/jsp/status.jsp").forward(request, response);
    	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
