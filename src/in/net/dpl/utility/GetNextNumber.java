package in.net.dpl.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

public class GetNextNumber {
    private static AtomicLong numberGenerator = new AtomicLong(5001L);
    private static Long currTime=System.currentTimeMillis();

    public static String getNext() {
    	
    	String query="select eps_sr_no.nextval from dual;";
    	int count=0;
    	try{
			
			Connection conn=new ConnDB().make_connection();
			System.out.println("Query from jquery-"+query);
			ResultSet rs = conn.createStatement().executeQuery(query);
			while(rs.next()){
			count=rs.getInt("record_count");
			}
			conn.close();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
    	
    	 count+=1;
    	
        return "DPL/EPS/"+count;
    }
    
    
    
}
