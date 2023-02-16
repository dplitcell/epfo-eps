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

import com.google.gson.Gson;

/**
 * Servlet implementation class GetEmployeeDetailsServlet
 */
@WebServlet("/GetEmployeeDetails")

public class GetEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello from GET");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empNo = Integer.parseInt(request.getParameter("empNo"));
		System.out.println("Emp NO-"+empNo);

        EmployeeDomain employee = retrieveEmployeeDetailsFromDatabase(empNo);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(employee));
    }

    private EmployeeDomain retrieveEmployeeDetailsFromDatabase(int empNo) {
        // Connect to the database and retrieve the employee details based on the employee number
    	
    	String query="select * from vw_eps_option where emp_no='"+empNo+"' ";
    	EmployeeDomain emp= new EmployeeDomain();
    	try{
			
			Connection conn=new ConnDB().make_connection();
			System.out.println("Query from jquery-"+query);
			ResultSet rs = conn.createStatement().executeQuery(query);
			while(rs.next()){
				
				
				emp.setEmpNo(rs.getString("emp_no"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setDateOfJoin(rs.getString("date_of_join"));
				emp.setPfNo(rs.getString("pf_no"));
				emp.setFpfNo("WB/DGP/9206/"+rs.getString("fpf_no"));
				emp.setUanNo(rs.getString("uan_no"));
				emp.setMobile(rs.getString("mobile"));
				emp.setAadharNo(rs.getString("aadhar_no"));
				emp.setDept(rs.getString("dept"));
				emp.setAddress1(rs.getString("p_add1"));
				emp.setAddress2(rs.getString("p_add2"));
				emp.setCity(rs.getString("p_city"));
				emp.setDistrict(rs.getString("p_dist"));
				emp.setPin(rs.getString("p_pin"));
				emp.setState(rs.getString("p_state"));
				emp.setEmpStatus(rs.getString("ret_status"));
				
				
				
				
				
			}
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
    	
    	
    	return emp;
    	
    	
    }

}
