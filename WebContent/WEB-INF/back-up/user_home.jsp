<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DPL EPS PENSION Portal</title>
    
           
<style type="text/css">
input { font-size: 20px; }
body { 
				
				font-size: 4vh;
				background-image: url("resources/images/dpl.jpg");
				background-size: auto 90vh;
				background-position: 50%;
				background-repeat: no-repeat;
 			}
.style1 {font-size: 18px}
.style2 {font-size: large}
</style>
    
    <script>
function isEmail() {
		
		email=document.getElementById("email").value
		
		var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		
		if (regex.test(email) )
			
			return true;
		else 
			alert("Invalid email id");
			return false;
		
	}
</script>


    
</head>
<body>

<%
// New location to be redirected

String emp_no=request.getSession().getAttribute("emp_no").toString();

if (emp_no.length()==0){

String site = new String("http://dpl.net.in/epfo-eps");
response.setStatus(response.SC_MOVED_TEMPORARILY);
response.setHeader("Location", site); 
}
%>

<div align="center">
                
                <h2 class="style1">Welcome to The Durgapur Projects Limited EPS Portal</h2>
</div>
    <main>
        <div class="row">
        
        <form name="user"  action="user_auth.dpl" method="post">
            
            <div class="colm-form">
                <div class="form-container" align="center">
                    <table width="353" border="1">
                      <tr>
                        <td><a href="basic_info">Option Form Data Entry</a><td>
                      </tr>
                      <tr>
                       <td><a href="GenAppForm.dpl" target="_blank"> Option Form Print</a></td>
                      </tr>
                      
                      
                      <tr>
                        <td><a href="AppStatus?emp_no=${sessionScope.emp_no}">Application Status</a></td>
                       
                      </tr>
                      <tr>
                        <td><a href="Logout">Logout</a></td>
                       
                      </tr>
                    </table>
                    <p><br>
                      <br>
                    </p>
          </div>
         </form>       
                <p align="center" class="style2">Please drop mail to it@dpl.net.in,  if you face any error </p>
                <p align="center" class="style2">Signed Application form has to be positively submitted to dedicated counters at Administrative Building, Durgapur or through Speed Post to PF Department, DPL, strictly within 23/02/2023, as mentioned in the circular no: DPL/GM(HR&A)/2023/69 dated 16/02/2023 by GM (HR&A) </p>
      </div>
        </div>
    </main>
    <footer>
        <div class="footer-contents">
      </div>
    </footer>
</body>
</html>