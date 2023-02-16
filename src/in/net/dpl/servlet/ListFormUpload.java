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




import java.util.*;

/**
 * Servlet implementation class DisplayInvoice
 */
@WebServlet("/ListFormUpload.dpl")
public class ListFormUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListFormUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDomain> list= new ArrayList<EmployeeDomain>();
		//String query="select a.inv_no,case when instr(a.inv_no,'FA')>0 THEN 'FLY AH' WHEN instr(a.inv_no,'OA')>0 THEN 'POND ASH'END as CATEGORY , b.buyer_name,to_char(C.ACK_DATE,'dd-mm-yyyy') as ack_date from e_invoice_irn a,e_inv_print_master b,e_invoice_irn C where a.inv_no=b.inv_no AND B.INV_NO=C.INV_NO order by c.ack_date desc";
		
		String query="select emp_no,emp_name from eps_option order by application_date desc";
		
		
		//System.out.println(query);
		try{
    		Connection conn=new ConnDB().make_connection();
    		ResultSet rs=conn.createStatement().executeQuery(query);
    		while(rs.next()){
    		EmployeeDomain ed=new EmployeeDomain();
    			ed.setEmpNo(rs.getString(1));
    			ed.setEmpName(rs.getString(2));
    			list.add(ed);
    			
    			
    			
    		}
    		conn.close();
	}catch(SQLException ex){
		ex.printStackTrace();
	}
		
		
		request.getSession().setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listUpload.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
