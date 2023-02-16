package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

/**
 * Servlet implementation class UploadImage2
 */
@WebServlet("/UploadDoc.dpl")
public class UploadDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadDoc() {
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
		
		String emp_no=request.getSession().getAttribute("emp_no").toString();
		
		//TEST FILE UPLOAD
		//String emp_no="13550";
		
		//String directory="d:/upload/eps/"+emp_no;
		String directory="/root/eps/upload/"+emp_no;
		
		//String UPLOAD_DIRECTORY = "/usr/aldc/upload/"+currDate+"/"+subforlder;
		String UPLOAD_DIRECTORY=directory;
        //process only if its multipart content
    	File file = new File(UPLOAD_DIRECTORY); 
    	FileUtils.forceMkdir(file);
    	//System.out.println("POST-"+request.getParameter("post_info"));
    	if(ServletFileUpload.isMultipartContent(request)){
    		System.out.println("****** INSIDE UPLOAD**********");
    		try {
                
            	
            	List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                String post_info=null;
                for(FileItem item : multiparts){
                	System.out.println("Item Name-"+item.getFieldName());
                	
                	if(item.isFormField()){
                		  
                      post_info=item.getFieldName();
                     System.out.println("POST-"+post_info);     
                        
                	}
                	
                    if(!item.isFormField()){
                       
                       
                        
                        String ext=item.getName().substring(item.getName().indexOf(".")+1);
                        
                        if((item.getSize()<534230) && ext.matches("pdf")){
                        	//String post_info = request.getParameter("post_info");
                        	//System.out.println("POST Info-"+post_info);
                        	System.out.println("**Inside if**");
                        	item.write( new File(UPLOAD_DIRECTORY + File.separator + emp_no+".pdf"));
                        	Connection conn=new ConnDB().make_connection();
                    		try{
                    			
                    			
                    			String query="update EPS_OPTION set app_status_code='2' where emp_no='"+emp_no+"'";

                    			System.out.println(query);
                    			conn.createStatement().executeUpdate(query);
                    			conn.close();
                    			
                    		}catch(SQLException ex){
                    			ex.printStackTrace();
                    		}
                            
                            
                            
                           //File uploaded successfully
                           request.setAttribute("message", "File Uploaded Successfully");
                           request.getRequestDispatcher("/WEB-INF/jsp/user_home.jsp").forward(request, response);
                        	
                        	
                        
                        }
                        else{
                        	request.setAttribute("message", "You have to upload a PDF of less than 5 MB");
                            request.getRequestDispatcher("/WEB-INF/jsp/doc_upload.jsp").forward(request, response);
                        	
                        }
                        
                        
                        
                    }
                }
           
                
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }   

	}
	}
}

