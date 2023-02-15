package in.net.dpl.servlet;
import in.net.dpl.utility.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/handleOption")
public class HandleOption extends HttpServlet {

  /**
	 * 
	 */


protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String employeeNumber = request.getParameter("empNo");
    String employeeName = request.getParameter("employee_name");
    String department = request.getParameter("department");
    String dateOfJoining = request.getParameter("date_of_joining");
    String epfAccountNumber = request.getParameter("pf_account_number");
    String epsAccountNumber = request.getParameter("fpf_account_number");
    String uanNumber = request.getParameter("uan_number");
    String mobileNumber = request.getParameter("mobile_number");
    String aadharNumber = request.getParameter("aadhar_number");
    String add1 = request.getParameter("add1");
    String add2 = request.getParameter("add2");
    String city = request.getParameter("city");
    String dist = request.getParameter("dist");
    String state = request.getParameter("state");
    String pin = request.getParameter("pin");
    String email = request.getParameter("email");
    String altMob = request.getParameter("alt_mob");
    String ppoNo = request.getParameter("ppo_no");
    String date58Year = request.getParameter("date_58_year");
    String dateOfSuperannuation = request.getParameter("date_of_superannuation");
    String bankIfsc = request.getParameter("bank_ifsc");
    String bankName = request.getParameter("bank_name");
    String bankBranch = request.getParameter("bank_branch");
    String bankAccNo= request.getParameter("bank_acc_no");
    String appName= request.getParameter("applicant_name").toUpperCase();
    String relation= request.getParameter("relation").toUpperCase();
    String employmentStatus=request.getParameter("emp_status").toUpperCase();
    
    
    

    
    request.setAttribute("employeeNumber", employeeNumber);
    request.setAttribute("employeeName", employeeName.toUpperCase());
    request.setAttribute("department", department.toUpperCase());
    request.setAttribute("dateOfJoining", dateOfJoining);
    request.setAttribute("epfAccountNumber", epfAccountNumber.toUpperCase());
    request.setAttribute("epsAccountNumber", epsAccountNumber.toUpperCase());
    request.setAttribute("uanNumber", uanNumber.toUpperCase());
    request.setAttribute("mobileNumber", mobileNumber);
    request.setAttribute("aadharNumber", aadharNumber);
    request.setAttribute("add1", add1.toUpperCase());
    request.setAttribute("add2", add2.toUpperCase());
    request.setAttribute("city", city.toUpperCase());
    request.setAttribute("dist", dist.toUpperCase());
    request.setAttribute("state", state.toUpperCase());
    request.setAttribute("pin", pin);
    request.setAttribute("email", email);
    request.setAttribute("altMob", altMob);
    request.setAttribute("ppoNo", ppoNo.toUpperCase());
    request.setAttribute("date58Year", date58Year);
    request.setAttribute("dateOfSuperannuation", dateOfSuperannuation);
    request.setAttribute("bankIfsc", bankIfsc.toUpperCase());
    request.setAttribute("bankName", bankName.toUpperCase());
    request.setAttribute("bankBranch", bankBranch.toUpperCase());
    request.setAttribute("bankAccNo", bankAccNo);
    request.setAttribute("applicantName", appName.toUpperCase());
    request.setAttribute("relation", relation.toUpperCase());
    request.setAttribute("emp_status", employmentStatus);
    
    request.getRequestDispatcher("/WEB-INF/jsp/before_submit.jsp").forward(request, response);

    
    
    
   
    
}

	public void insertOptionData(String employeeNumber,String employeeName,String department,String dateOfJoining,String epfAccountNumber,String epsAccountNumber,String uanNumber,String mobileNumber,String aadharNumber,String add1,String add2 ,String city,String dist ,String state ,String pin ,String email,String altMob,String ppoNo,String date58Year,String dateOfSuperannuation,String bankIfsc,String bankName){
		
		String insertOptionQuery = "INSERT INTO eps_option (employee_number, employee_name, department, date_of_joining, epf_account_number, eps_account_number,uan_number, mobile_number, aadhar_number, add1, add2, city, dist, state, pin, email, alt_mob,ppo_no, date_58_year, date_of_superannuation, bank_ifsc, bank_name) VALUES (employeeNumber, employeeName, department, dateOfJoining, epfAccountNumber, epsAccountNumber, uanNumber,mobileNumber, aadharNumber, add1, add2, city, dist, state, pin, email, altMob, ppoNo, date58Year,dateOfSuperannuation, bankIfsc, bankName)";
		
		try{
			
			Connection conn=new ConnDB().make_connection();
			System.out.println(insertOptionQuery);
			conn.createStatement().executeUpdate(insertOptionQuery);
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
		 
		
		
	}

}