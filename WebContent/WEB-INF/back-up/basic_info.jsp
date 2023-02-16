<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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
<style type="text/css">
input { font-size: 20px; }
body { 
				
				font-size: 4vh;
				background-image: url("resources/images/dpl.jpg");
				background-size: auto 90vh;
				background-position: 50%;
				background-repeat: no-repeat;
 			}
</style>
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
<style type="text/css">
<!--
.style1 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 16px;
}
.style2 {font-size: 24px; font-weight: bold;}
.style4 {font-size: 18px}
.style5 {font-size: 14px}
-->
</style>
<body  onload="loadEmp()" >

<div class="form-container" align="center" >
  <form action="handleOption" method="POST">
    <table width="90%" border="1">
      <tr>
      <td height="43" colspan="2"><div align="center"><span class="style1">Ee</span><span class="style2">EMPLOYEE PENSION OPTION FORM- INPUT RELEVANT INFORMATION </span></div>      </tr>
      <tr>
        <td width="39%"><span class="style4">Employee Number:
        </span>
        <td width="61%"><input type="text" id="empNo" name="empNo" required></td>
      </tr>
      <tr>
        <td><span class="style4">Employee Name:
        </span>
        <td><input name="employee_name" type="text" id="employee_name" size="50" required></td>
      </tr>
      <tr>
        <td><span class="style4">Department:
        </span>
        <td><input name="department" type="text" id="department" size="70" required></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Joining in DPL:
        </span>
        <td><input type="text" id="date_of_joining" name="date_of_joining" required></td>
      </tr>
      <tr>
        <td><span class="style4">Employment Status:</span>
        <td><input type="text" id="emp_status" name="emp_status" required></td>
      </tr>
      <tr>
        <td><span class="style4">PF Account Number:
        </span>
        <td><input type="text" id="pf_account_number" name="pf_account_number" required></td>
      </tr>
      <tr>
        <td><span class="style4">FPF Number:
        </span>
        <td><input type="text" id="fpf_account_number" name="fpf_account_number" required></td>
      </tr>
      <tr>
        <td><span class="style4">UAN Number:
        </span>
        <td><input type="text" id="uan_number" name="uan_number" required></td>
      </tr>
      <tr>
        <td><span class="style4">Mobile Number:
        </span>
        <td><input type="text" id="mobile_number" name="mobile_number" required></td>
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
        <td><input type="text" id="add2" name="add2" required></td>
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
        <td><input type="text" id="alt_mob" name="alt_mob" required></td>
      </tr>
      <tr>
        <td><span class="style4">PPO No:
        </span>
        <td><input type="text" id="ppo_no" name="ppo_no" required></td>
      </tr>
      <tr>
        <td><span class="style4">Date of start of Pension(DD-MM-YYYY) </span></td>
        <td><input type="text" id="date_58_year" name="date_58_year" onBlur="datevalidate_58()" required></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Superannuation /Cessation of Service (DD-MM-YYYY)</span></td>
        <td><input type="text" id="date_of_superannuation" name="date_of_superannuation" onBlur="datevalidate_retire()" required></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank IFSC</span></td>
        <td><input type="text" id="bank_ifsc" name="bank_ifsc" required></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Name</span></td>
        <td><input type="text" id="bank_name" name="bank_name" required></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Branch</span></td>
        <td><input type="text" id="bank_branch" name="bank_branch" required></td>
      </tr>
      <tr>
        <td><span class="style4">Bank Account Number</span></td>
        <td><input type="text" id="bank_acc_no" name="bank_acc_no" required></td>
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
          <p align="justify" class="style5">            1. It is certified that immediately after joining THE DURGAPUR PROJECTS LIMITED, I had been contributing towards the Provident Fund on my actual wage/salary and an equal amount used to be contributed in my PF by the employer also as provided under Para 26(6) of EPF Scheme, 1952. It is to further certify that an amount @ 8.33% of the statutory ceiling limit Le. Rs.15,000/- pm (earlier Rs.5,000/ 6500) out of the Employer's Contribution has been remitted by my employer every monch towards EPS, 1995 since 16/11/1995/ the date of my joining, whichever is later.</p>
          <p align="justify" class="style5">2. I do hereby opt for diverting 8.33% of my actual salary/wages out of Employer's Contribution from my PF A/c. towards Pension Fund (after adjusting the amount already remitted by the mployer to the Pension Fund upto the prescribed wage ceiling under the Act) from the date of joining EPS, 1995 till my attaining the age of 58 years. I hereby authorize, PF Trust of DPL to transfer the differential amount with interest accrued thus making me eligible for drawing pension on the basis of actual salary/wages instead of on the salary/wages fixed as per prevailing ceiling under the Act, in accordance with the aforesaid judgement.</p>
          <p align="justify" class="style5">3.I also undertake that in case my corpus/balance in PF Account is insufficient to meet the aforesaid requirement, I am ready to pay the differential amount thus making me eligible for drawing pension on the basis of actual salary/wages instead of on the salary/wages as per prevailing celling under the Act in accordancewith the<br>
        aforesaid jugement.</p>
        <p align="justify" class="style5">4.I understand that the Joint Option Form submitted by me shall be subject to acceptance by EPFO. I further understand that the Option exercised is irrevocable at any later date, and no claim for change of Option shall be entertained or considered under any circumstances.</p>
        <p align="justify" class="style5">5. I undertake that the Option exercised herein is Loject to the EPFO instructions/guidelines/directives that 
        may be issued from time to time.</p></td>
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