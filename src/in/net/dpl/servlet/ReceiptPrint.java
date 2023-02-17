package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
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
 * Servlet implementation class ReceiptPrint
 */
@WebServlet("/receipt_print.dpl")
public class ReceiptPrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiptPrint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emp_no= request.getParameter("emp_no");
		
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
        	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
