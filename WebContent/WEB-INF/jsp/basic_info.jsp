<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Employees' Full Pension Option Form</title>
<script>

function datevalidate_58() {

	var d=document.getElementById("date_58_year").value;

	var date_regex = /^(0[1-9]|1\d|2\d|3[01])\-(0[1-9]|1[0-2])\-(19|20)\d{2}$/;
	if (!(date_regex.test(d))) {
		
		document.getElementById('date_58_year').focus();
		document.getElementById('date_58_year').value = "";
		
		return false;
	    
		}
	}

</script>
<script>

function datevalidate_retire() {

	var d=document.getElementById("date_of_superannuation").value;

	var date_regex = /^(0[1-9]|1\d|2\d|3[01])\-(0[1-9]|1[0-2])\-(19|20)\d{2}$/;
	if (!(date_regex.test(d))) {
		
		document.getElementById('date_of_superannuation').focus();
		document.getElementById('date_of_superannuation').value = "";
		
		return false;
	    
		}
	}

</script>
<style> 
  input[type=date] {
    width: 99.4%;
    height: 100%;
    min-height: 100%;
    max-height: 100%;
    font-size: 1.5vw;
    background-color: white ;
    border-color: gray;
    border: 1px solid black;
  }
  input[type=button] {
    width: 60%;
    height: 100%;
    min-height: 100%;
    max-height: 100%;
      font-size: 1.5vw;
      background-color: rgb(214, 217, 255);
      border-color: black;
      border: 1px solid black;
  }
  input[type=submit] {
    width: 60%;
    height: 100%;
    min-height: 100%;
    max-height: 100%;
      font-size: 1.5vw;
      background-color: rgb(214, 217, 255);
      border-color: black;
      border: 1px solid black;
  }
  input[type=text] {
    width: 98.5%;
    height: 100%;
    min-height: 100%;
    max-height: 100%;
    font-size: 1.5vw;
    background-color: white ;
    border-color: gray;
    border: 1px solid black;
  }
  select {
    width: 100%;
    height:100%;
    min-height: 100%;
    max-height: 100%;
    font-size: 1.5vw;
    background-color: white ;
    border-color: gray;
    border: 1px solid black;
  }
  td, th {
      border: 1px solid black;
    border-collapse: collapse;
    height: 100%;
    min-height: 100%;
    max-height: 100%;
    padding-left: .1vw;
    }
  html {
     height: 98%;
    min-height: 98%;
    max-height: 98%;
  }
  body {
    height: 100%;
    min-height: 100%;
    max-height: 100%;
    font-size: 1.5vw;
    background-image: url("resources/images/dpl.jpg");
    background-repeat: no-repeat;
    background-size: auto 80vh;
    background-position: 50% 10vh;
  }
  table {
    border:1px solid black;
    border-collapse: collapse;
    table-layout: fixed;
    width: 66vw;
    background-color:#F0FFFF;
  }
  #footer {
    position: fixed;
    bottom: 0;
    width: 98.8%;
    /* Height of the footer*/
    height: 5vh;
    background: bisque;
  }
  #formSubmit {
    position: fixed;
    border: 1px solid #000;
    border-style: solid;
    bottom: 5vh;
    width: 98.7%;
    height: 5vh;
    background: #F0FFFF;
  }
  #addDiv {
    position: fixed;
    bottom: 10;
    width: 98.8%;
    /* Height of the footer*/
    height: 11.5vh;
  }
  tr {
    height: 5.7vh;
    min-height: 5.7vh;
    max-height: 5.7vh;
  }
</style>

<!-- 
<style type="text/css">
input { font-size: 20px; }
body { 
				
				font-size: 4vh;
				background-image: url("resources/images/dpl.jpg");
				background-size: auto 90vh;
				background-position: 50%;
				background-repeat: no-repeat;
 			}
</style> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">

function getEmployeeDetails() {
    var empNo = $("#empNo").val();

    $.ajax({
        type: "POST",
        url: "/epfo-eps/GetEmployeeDetails",
        data: { empNo: empNo },
        success: function(employee) {
        	document.getElementById("empNo").readOnly=true;
            $("#employee_name").val(employee.empName);
            $("#department").val(employee.dept);
            $("#date_of_joining").val(employee.dateOfJoin);
            $("#pf_account_number").val(employee.pfNo);
            $("#fpf_account_number").val(employee.fpfNo);
            $("#uan_number").val(employee.uanNo);
            $("#mobile_number").val(employee.mobile);
            $("#aadhar_number").val(employee.aadharNo);
            $("#add1").val(employee.address1);
            $("#add2").val(employee.address2);
            $("#city").val(employee.city);
            $("#dist").val(employee.district);
            $("#state").val(employee.state);
            $("#pin").val(employee.pin);
            $("#emp_status").val(employee.empStatus);
            
            }
    });
}

</script>
<script>
function loadEmp(){
	
	var user_id = "${emp_no}";
	if(user_id!='dpl_eps'){
		document.getElementById("empNo").value=user_id;
		getEmployeeDetails();
		
	
	 }  
}

</script>
<script>
$(document).ready(function() {
    $("#empNo").change(getEmployeeDetails);
});

</script>
<!-- <style type="text/css">
<!--
.style1 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 16px;
}
.style2 {font-size: 24px; font-weight: bold;}
.style4 {font-size: 18px}
.style5 {font-size: 14px}
</style> -->
<body  onload="loadEmp()" >

<!-- <div class="form-container"  -->
<div align="center" style="height: 98.5vh; overflow-y: auto;" >
  <table>
    <tr bgcolor = "#eeffcc">
      <td style="width:7vw" align="center"><a href="user_auth.dpl">Home</a></td>
      <td align="center"><b>The Duragpur Projects Limited</b></td>
      <td style="width: 7vw" align="center"><a href="user_login.dpl">Logout</a></td>
    </tr>
</table>
  

  <form action="handleOption" method="POST">
    <table width="90%" border="1">
      <tr style="height:.1vh">
        <td style="width:40vw; border: none;"></td>
        <td style="width:25vw; border: none;"></td>
      </tr>
      <tr>
      <td height="43" colspan="2" align="center" style="font-size: 3vh;font-style: italic;"><b>EMPLOYEE PENSION OPTION FORM- INPUT RELEVANT INFORMATION</b></td>
      </tr>
      <!-- <div align="center"><span class="style1"></span><span class="style2">EMPLOYEE PENSION OPTION FORM- INPUT RELEVANT INFORMATION </span></div></tr> -->
      <tr>
        <td width="39%"><span class="style4">Employee Number:
        </span>
        <td width="61%"><input type="text" id="empNo" name="empNo" required></td>
      </tr>
      <tr>
        <td><span class="style4">Employee Name:
        </span>
        <td><input name="employee_name" type="text" id="employee_name" size="50" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">Department:
        </span>
        <td><input name="department" type="text" id="department" size="70" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Joining in DPL:
        </span>
        <td><input type="text" id="date_of_joining" name="date_of_joining" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">Employment Status:</span>
        <td><input type="text" id="emp_status" name="emp_status" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">PF Account Number:
        </span>
        <td><input type="text" id="pf_account_number" name="pf_account_number" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">FPF Number:
        </span>
        <td><input type="text" id="fpf_account_number" name="fpf_account_number" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">UAN Number:
        </span>
        <td><input type="text" id="uan_number" name="uan_number" readonly></td>
      </tr>
      <tr>
        <td><span class="style4">Mobile Number:
        </span>
        <td><input type="text" id="mobile_number" name="mobile_number" ></td>
      </tr>
      <tr>
        <td><span class="style4">Aadhar Number:
        </span>
        <td><input type="text" id="aadhar_number" name="aadhar_number" required></td>
      </tr>
      <tr>
        <td><span class="style4">Address Line 1:
        </span>
        <td><input type="text" id="add1" name="add1" required></td>
      </tr>
      <tr>
        <td><span class="style4">Address Line 2:
        </span>
        <td><input type="text" id="add2" name="add2" ></td>
      </tr>
      <tr>
        <td><span class="style4">City:
        </span>
        <td><input type="text" id="city" name="city" required></td>
      </tr>
      <tr>
        <td><span class="style4">District:
        </span>
        <td><input type="text" id="dist" name="dist" required></td>
      </tr>
      <tr>
        <td><span class="style4">State:
        </span>
        <td><input type="text" id="state" name="state" required></td>
      </tr>
      <tr>
        <td><span class="style4">Pin Code:
        </span>
        <td><input type="text" id="pin" name="pin" required></td>
      </tr>
      <tr>
        <td><span class="style4">Email id:
        </span>
        <td><input type="text" id="email" name="email" required></td>
      </tr>
      <tr>
        <td><span class="style4">Alternate Mobile No:
        </span>
        <td><input type="text" id="alt_mob" name="alt_mob" ></td>
      </tr>
      <tr>
        <td><span class="style4">PPO No:
        </span>
        <td><input type="text" id="ppo_no" name="ppo_no"></td>
      </tr>
      <tr>
        <td><span class="style4">Date of start of Pension(DD-MM-YYYY) </span></td>
        <td><input type="text" id="date_58_year" name="date_58_year"  ></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Superannuation /Cessation of Service (DD-MM-YYYY)</span></td>
        <td><input type="text" id="date_of_superannuation" name="date_of_superannuation" ></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank IFSC</span></td>
        <td><input type="text" id="bank_ifsc" name="bank_ifsc" ></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Name</span></td>
        <td><input type="text" id="bank_name" name="bank_name" ></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Branch</span></td>
        <td><input type="text" id="bank_branch" name="bank_branch" ></td>
      </tr>
      <tr>
        <td><span class="style4">Bank Account Number</span></td>
        <td><input type="text" id="bank_acc_no" name="bank_acc_no" ></td>
      </tr>
      <tr>
        <td><span class="style4">Applicant's Name</span></td>
        <td><input type="text" id="applicant_name" name="applicant_name" required></td>
      </tr>
      <tr>
        <td><span class="style4">Relation with Employee</span></td>
        <td><input type="text" id="relation" name="relation" required></td>
      </tr>
      <tr>
        <td colspan="2"><p align="center" class="style4"><strong>Declaration by Employee</strong></p>
          <p align="justify" class="style5">I accept and submit the option form for full pension and I certify that aforesaid information is correct and I shall be solely responsible for any incorrect information submitted by me.</p></p>
          </p></td>
      </tr>
      <tr>
        <td colspan="2"><div align="center">
            <input name="submit" type="submit" value="I ACCEPT AND SUBMIT THE FORM">
        </div></td>
      </tr>
    </table>
  </form>
</div>     
       
      

</body>
</html>