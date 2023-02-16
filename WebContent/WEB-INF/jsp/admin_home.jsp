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
        
        <form name="user"  action="#" method="post">
            
            <div class="colm-form" align="center">
                <div class="form-container" align="center">
                    <table width="353" border="1">
                      
                      
                      <tr>
                       <td><a href="basic_info" > Option Form Entry</a></td>
                      </tr>
                      <tr>
                       <td><a href="ListFormApp.dpl" > Option Form Print</a></td>
                      </tr>
                      <tr>
                       <td><a href="Receipt" > Update Receipt Information</a></td>
                      </tr>
                      
                      
                      
                    </table>
                    <p><br>
                      <br>
                    </p>
          </div>
         </form>       
                <p align="center" class="style2">ADMIN  USER LOGIN</p>
      </div>
        </div>
    </main>
    <footer>
        <div class="footer-contents">
      </div>
    </footer>
</body>
</html>