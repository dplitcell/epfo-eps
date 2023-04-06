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
 * Servlet implementation class ReceiptReportHandle
 */
@WebServlet("/receipt_report_handle.dpl")
public class ReceiptReportHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiptReportHandle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getSession().getAttribute("emp_no").toString();
		String receipt_date = request.getParameter("receipt_date");
		byte bytes[] = null;
		Map params = new HashMap();
        params.put("receipt_by",user);
        params.put("receipt_date",receipt_date);
        
        
        
        response.setHeader("Content-Disposition", "attachment; filename="+"receipt_report"+".pdf");
        ServletOutputStream servletOutputStream = response.getOutputStream();
        OutputStream outStream = response.getOutputStream();
        File reportFile = new File(getServletConfig().getServletContext().getRealPath("WEB-INF/receipt_report.jasper"));
        
        
        
       
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
