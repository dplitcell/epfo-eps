package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

/**
 * Servlet implementation class ReceiptHandle
 */
@WebServlet("/receipt_handle.dpl")
public class ReceiptHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiptHandle() {
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
		String emp_no= request.getParameter("emp_no");
		String docket_no= request.getParameter("docket_no").toUpperCase();
		String emp_name =request.getParameter("emp_name");
		String applicant=request.getParameter("app_name");
		String app_date=request.getParameter("app_date");
		String app_no=request.getParameter("app_no");
		
		
		
		try{
			
			Connection conn=new ConnDB().make_connection();
			String query="update EPS_OPTION set app_status_code='3',courier_info='"+docket_no+"',receipt_date=sysdate where emp_no='"+emp_no+"'";

			System.out.println(query);
			conn.createStatement().executeUpdate(query);
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		/*request.setAttribute("emp_code", emp_no);
		request.setAttribute("emp_name", emp_name);
		request.setAttribute("app_no", app_no);
		request.setAttribute("app_date", app_date);
		request.setAttribute("applicant", applicant);*/
		
		byte bytes[] = null;
		Map params = new HashMap();
        params.put("emp_no",emp_no);
        
        
        response.setHeader("Content-Disposition", "attachment; filename="+"receipt"+".pdf");
        ServletOutputStream servletOutputStream = response.getOutputStream();
        OutputStream outStream = response.getOutputStream();
        File reportFile = new File(getServletConfig().getServletContext().getRealPath("WEB-INF/receipt.jasper"));
        
        
        
       
        try
        {
            
        	Connection conn = new ConnDB().make_connection();
        	bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), params, conn);      
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Length", String.valueOf(bytes.length));
            servletOutputStream.write(bytes, 0, bytes.length);
            servletOutputStream.flush();
            servletOutputStream.close();
        }
        
         
        catch(JRException e)
        {
            
            e.printStackTrace();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        	
                

		
		
		
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/admin_home.jsp").forward(request, response);
	}

}
