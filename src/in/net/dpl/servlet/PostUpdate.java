package in.net.dpl.servlet;

import in.net.dpl.utility.ConnDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostUpdate
 */
@WebServlet("/post_update.dpl")
public class PostUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostUpdate() {
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
		String post_info=request.getParameter("post_info");
		String emp_no=request.getSession().getAttribute("emp_no").toString();
		
		
		try{
			
			Connection conn=new ConnDB().make_connection();
			String query="update EPS_OPTION set courier_info='"+post_info+"',app_status_code='3' where emp_no='"+emp_no+"'";

			System.out.println(query);
			conn.createStatement().executeUpdate(query);
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
		request.getRequestDispatcher("/WEB-INF/jsp/user_home.jsp").forward(request, response);

	}

}
