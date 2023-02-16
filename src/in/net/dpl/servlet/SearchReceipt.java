package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;
import in.net.dpl.utility.EmployeeDomain;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchReceipt
 */
@WebServlet("/search_receipt.dpl")
public class SearchReceipt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchReceipt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emp_code=request.getParameter("emp_code");
		String query="select emp_name,application_no,to_char(application_date,'dd-mm-yyyy hh24:mi') application_date,applicant_name||' , '||relation) as applicant from eps_option where emp_no='"+emp_code+"' ";
    	String empName=null;
    	String applicationNo=null;
    	String applicationDate=null;
    	String applicant=null;
    	
    	try{
			
			Connection conn=new ConnDB().make_connection();
			System.out.println("Query from jquery-"+query);
			ResultSet rs = conn.createStatement().executeQuery(query);
			while(rs.next()){
				
				
				empName=rs.getString(1);
				applicationNo=rs.getString(2);
				applicationDate=rs.getString(3);
				applicant=rs.getString(4);
					
				
				
			}
			conn.close();
			
			request.setAttribute("emp_code", emp_code);
			request.setAttribute("emp_name", empName);
			request.setAttribute("app_no", applicationNo);
			request.setAttribute("app_date", applicationDate);
			request.setAttribute("applicant", applicationDate);
			
			
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
    	
    	request.getRequestDispatcher("/WEB-INF/jsp/receipt_update.jsp").forward(request, response);
		
	}

}
