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



@WebServlet(urlPatterns = "/handleOptionFinal")
public class HandleOptionFinal extends HttpServlet {

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
    String appName= request.getParameter("applicant_name");
    String relation= request.getParameter("relation");
    String employmentStatus=request.getParameter("emp_status");
    String user=request.getSession().getAttribute("emp_no").toString();
    
    String appRefNo=GetNextNumber.getNext();
    
    System.out.println("Application Reference No");
    insertOptionData(employeeNumber, employeeName, department, dateOfJoining, epfAccountNumber, epsAccountNumber, uanNumber, mobileNumber, aadharNumber, add1, add2, city, dist, state, pin, email.toLowerCase(), altMob, ppoNo, date58Year, dateOfSuperannuation, bankIfsc, bankName, appRefNo,bankBranch,bankAccNo,appName,relation,employmentStatus,user);
    
    request.setAttribute("ref_no", appRefNo);
    

   if(request.getSession().getAttribute("emp_no").equals("dpl_eps")){
	   request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
   }
   else{
	   request.getRequestDispatcher("/WEB-INF/jsp/user_home.jsp").forward(request, response);
   }
    

    
    
    
   
    
}

	public void insertOptionData(String employeeNumber,String employeeName,String department,String dateOfJoining,String epfAccountNumber,String epsAccountNumber,String uanNumber,String mobileNumber,String aadharNumber,String add1,String add2 ,String city,String dist ,String state ,String pin ,String email,String altMob,String ppoNo,String date58Year,String dateOfSuperannuation,String bankIfsc,String bankName,String appRefNo, String bankBranch,String bankAccNo,String appName,String relation,String empStatus,String user ){
		
		//String insertOptionQuery = "INSERT INTO eps_option (emp_no, emp_name, dept, date_of_join,pf_no, fpf_no,uan_no, mobile, aadhar_no, add1, add2, city, district, state, pin, email_id, alt_mob_no,ppo_no, start_date_pension, date_retire, bank_ifsc, bank_ac_no, bank_name,bank_branch,application_no,application_date,app_status_code,applicant_name,relationship,emp_status) VALUES ('"+employeeNumber+"', '"+employeeName+"', '"+department+"',to_date('"+dateOfJoining+"','dd-mm-yyyy'), '"+epfAccountNumber+"', '"+epsAccountNumber+"', '"+uanNumber+"','"+mobileNumber+"', '"+aadharNumber+"', '"+add1+"', '"+add2+"', '"+city+"', '"+dist+"', '"+state+"', '"+pin+"', '"+email+"', '"+altMob+"', '"+ppoNo+"', to_date('"+date58Year+"','dd-mm-yyyy'),to_date('"+dateOfSuperannuation+"','dd-mm-yyyy'), '"+bankIfsc+"','"+bankAccNo+"', '"+bankName+"','"+bankBranch+"','"+appRefNo+"',sysdate,'1','"+appName+"','"+relation+"','"+empStatus+"')";
		String insertOptionQuery = "INSERT INTO eps_option (emp_no, emp_name, dept, date_of_join,pf_no, fpf_no,uan_no, mobile, aadhar_no, add1, add2, city, district, state, pin, email_id, alt_mob_no,ppo_no, start_date_pension, date_retire, bank_ifsc, bank_ac_no, bank_name,bank_branch,application_no,application_date,app_status_code,applicant_name,relationship,emp_status,entered_by) VALUES ('"+employeeNumber+"', '"+employeeName+"', '"+department+"',to_date('"+dateOfJoining+"','dd-mm-yyyy'), '"+epfAccountNumber+"', '"+epsAccountNumber+"', '"+uanNumber+"','"+mobileNumber+"', '"+aadharNumber+"', '"+add1+"', '"+add2+"', '"+city+"', '"+dist+"', '"+state+"', '"+pin+"', '"+email+"', '"+altMob+"', '"+ppoNo+"', '"+date58Year+"','"+dateOfSuperannuation+"', '"+bankIfsc+"','"+bankAccNo+"', '"+bankName+"','"+bankBranch+"','"+appRefNo+"',sysdate,'1','"+appName+"','"+relation+"','"+empStatus+"','"+user+"')";
		System.out.println("Insert Query-"+insertOptionQuery);
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