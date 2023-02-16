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

<div align="center">
                
                <h2 class="style1">Welcome to The Durgapur Projects Limited EPS Portal</h2>
</div>
    <main>
        <div class="row">
        
        <form name="user"  action="receipt_handle.dpl" method="post">
            
            <div class="colm-form">
                <div class="form-container" align="center">
                    <table width="353" border="1">
                      <tr>
                        <td width="121"><span class="style1">Emp No </span></td>
                        <td width="216"><c:out value="${emp_code}" /><input type="hidden" name="emp_no" id="emp_no" value="${emp_code}"></td>
                      </tr>
                      <tr>
                        <td><span class="style1">Employee Name</span></td>
                        <td><c:out value="${emp_name}" /><input type="hidden" name="emp_name" id="emp_name" value="${emp_name}"></td>
                      </tr>
                      <tr>
                        <td><span class="style1">Application No</span></td>
                        <td><c:out value="${app_no}" /><input type="hidden" name="app_no" id="app_no" value="${app_no}"></td>
                      </tr>
                      <tr>
                        <td><span class="style1">Application Date</span></td>
                        <td><c:out value="${app_date}" /><input type="hidden" name="app_date" id="app_no" value="${app_date}"></td>
                      </tr>
                      
                      <tr>
                        <td><span class="style1">Applicant Name</span></td>
                        <td><c:out value="${app_name}" /><input type="hidden" name="app_name" id="app_name" value="${applicant}"></td>
                      </tr>
                      
                      <tr>
                        <td><span class="style1">Receipt Information (BY HAND/Courier Docket No)</span></td>
                        <td><input type="text" name="docket_no" id="docket_no" ></td>
                      </tr>
                      <tr>
                        <td colspan="2"><div align="center">
                          <input type="submit" value="Update">
                        </div></td>
                      </tr>
                    </table>
                    <p><br>
                      <br>
                    </p>
          </div>
         </form>       
                
      </div>
        </div>
    </main>
    <footer>
        <div class="footer-contents">
      </div>
    </footer>
</body>
</html>