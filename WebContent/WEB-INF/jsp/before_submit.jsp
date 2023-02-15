<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<style type="text/css">
<!--
.style1 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 16px;
}
.style2 {font-size: 24px; font-weight: bold;}
.style4 {font-size: 18px}
.style5 {font-size: 14}
-->
</style>
<body>

<div class="form-container" align="center">
  <form action="handleOptionFinal" method="POST" >
    <table width="81%" border="1">
      <tr>
        <td height="43" colspan="2"><div align="center"><span class="style1"></span><span class="style2">FINAL CHECK-EMPLOYEE PENSION OPTION FORM </span></div>      
      </tr>
      <tr>
        <td width="39%"><span class="style4">Employee Number:
        </span>
        <td width="61%"><c:out value="${employeeNumber}" /><input type="hidden" id="empNo" name="empNo" value="${employeeNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">Employee Name:
        </span>
        <td><c:out value="${employeeName}" /><input name="employee_name" type="hidden" id="employee_name" size="50" value="${employeeName}"></td>
      </tr>
      <tr>
        <td><span class="style4">Department:
        </span>
        <td><c:out value="${department}" /><input name="department" type="hidden" id="department" size="70" value="${department}"></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Joining in DPL:
        </span>
        <td><c:out value="${dateOfJoining}" /><input type="hidden" id="date_of_joining" name="date_of_joining" value="${dateOfJoining}"></td>
      </tr>
      <tr>
        <td><span class="style4">Employment Status:</span>
        <td><c:out value="${emp_status}" /> <input type="hidden" id="emp_status" name="emp_status" value="${emp_status}"></td>
      </tr>
      <tr>
        <td><span class="style4">PF Account Number:
        </span>
        <td><c:out value="${epfAccountNumber}" /><input type="hidden" id="pf_account_number" name="pf_account_number" value="${epfAccountNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">FPF Number:
        </span>
        <td><c:out value="${epsAccountNumber}" /><input type="hidden" id="fpf_account_number" name="fpf_account_number" value="${epsAccountNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">UAN Number:
        </span>
        <td><c:out value="${uanNumber}" /><input type="hidden" id="uan_number" name="uan_number" value="${uanNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">Mobile Number:
        </span>
        <td><c:out value="${mobileNumber}" /><input type="hidden" id="mobile_number" name="mobile_number" value="${mobileNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">Aadhar Number:
        </span>
        <td><c:out value="${aadharNumber}" /><input type="hidden" id="aadhar_number" name="aadhar_number" value="${aadharNumber}"></td>
      </tr>
      <tr>
        <td><span class="style4">Address Line 1:
        </span>
        <td><c:out value="${add1}" /><input type="hidden" id="add1" name="add1" value="${add1}"></td>
      </tr>
      <tr>
        <td><span class="style4">Address Line 2:
        </span>
        <td><c:out value="${add2}" /><input type="hidden" id="add2" name="add2" value="${add2}"></td>
      </tr>
      <tr>
        <td><span class="style4">City:
        </span>
        <td><c:out value="${city}" /><input type="hidden" id="city" name="city" value="${city}"></td>
      </tr>
      <tr>
        <td><span class="style4">District:
        </span>
        <td><c:out value="${dist}" /><input type="hidden" id="dist" name="dist" value="${dist}"></td>
      </tr>
      <tr>
        <td><span class="style4">State:
        </span>
        <td><c:out value="${state}" /><input type="hidden" id="state" name="state" value="${state}" ></td>
      </tr>
      <tr>
        <td><span class="style4">Pin Code:
        </span>
        <td><c:out value="${pin}" /><input type="hidden" id="pin" name="pin" value="${pin}"></td>
      </tr>
      <tr>
        <td><span class="style4">Email id:
        </span>
        <td><c:out value="${email}" /><input type="hidden" id="email" name="email" value="${email}"></td>
      </tr>
      <tr>
        <td><span class="style4">Alternate Mobile No:
        </span>
        <td><c:out value="${altMob}" /><input type="hidden" id="alt_mob" name="alt_mob" value="${altMob}"></td>
      </tr>
      <tr>
        <td><span class="style4">PPO No:
        </span>
        <td><c:out value="${ppoNo}" /><input type="hidden" id="ppo_no" name="ppo_no" value="${ppoNo}"></td>
      </tr>
      <tr>
        <td><span class="style4">Date of start of Pension </span></td>
        <td><c:out value="${date58Year}" /><input type="hidden" id="date_58_year" name="date_58_year" value="${date58Year}"></td>
      </tr>
      <tr>
        <td><span class="style4">Date of Superannuation /Cessation of Service</span></td>
        <td><c:out value="${dateOfSuperannuation}" /><input type="hidden" id="date_of_superannuation" name="date_of_superannuation" value="${dateOfSuperannuation}"></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank IFSC</span></td>
        <td><c:out value="${bankIfsc}" /><input type="hidden" id="bank_ifsc" name="bank_ifsc" value="${bankIfsc}"></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Name</span></td>
        <td><c:out value="${bankName}" /><input type="hidden" id="bank_name" name="bank_name" value="${bankName}"></td>
      </tr>
      <tr>
        <td><span class="style4">Pension Disbursing Bank Branch</span></td>
        <td><c:out value="${bankBranch}" /><input type="hidden" id="bank_branch" name="bank_branch" value="${bankBranch}"></td>
      </tr>
      <tr>
        <td><span class="style4">Bank Account Number</span></td>
        <td><c:out value="${bankAccNo}" /><input type="hidden" id="bank_acc_no" name="bank_acc_no" value="${bankAccNo}"></td>
      </tr>
      <tr>
        <td><span class="style4">Applicant's Name</span></td>
        <td><c:out value="${applicantName}" /><input type="hidden" id="applicant_name" name="applicant_name" value="${applicantName}"></td>
      </tr>
      <tr>
        <td><span class="style4">Relation with Employee</span></td>
        <td><c:out value="${relation}" /><input type="hidden" id="relation" name="relation" value="${relation}"></td>
      </tr>
      <tr>
        <td colspan="2"><div align="center">
          <p align="center" class="style4"><strong>Declaration by Employee</strong></p>
          <p align="justify" class="style5"> 1. It is certified that immediately after joining THE DURGAPUR PROJECTS LIMITED, I had been contributing towards the Provident Fund on my actual wage/salary and an equal amount used to be contributed in my PF by the employer also as provided under Para 26(6) of EPF Scheme, 1952. It is to further certify that an amount @ 8.33% of the statutory ceiling limit Le. Rs.15,000/- pm (earlier Rs.5,000/ 6500) out of the Employer's Contribution has been remitted by my employer every monch towards EPS, 1995 since 16/11/1995/ the date of my joining, whichever is later.</p>
          <p align="justify" class="style5">2. I do hereby opt for diverting 8.33% of my actual salary/wages out of Employer's Contribution from my PF A/c. towards Pension Fund (after adjusting the amount already remitted by the mployer to the Pension Fund upto the prescribed wage ceiling under the Act) from the date of joining EPS, 1995 till my attaining the age of 58 years. I hereby authorize, PF Trust of DPL to transfer the differential amount with interest accrued thus making me eligible for drawing pension on the basis of actual salary/wages instead of on the salary/wages fixed as per prevailing ceiling under the Act, in accordance with the aforesaid judgement.</p>
          <p align="justify" class="style5">3.I also undertake that in case my corpus/balance in PF Account is insufficient to meet the aforesaid requirement, I am ready to pay the differential amount thus making me eligible for drawing pension on the basis of actual salary/wages instead of on the salary/wages as per prevailing celling under the Act in accordancewith the<br>
            aforesaid jugement.</p>
          <p align="justify" class="style5">4.I understand that the Joint Option Form submitted by me shall be subject to acceptance by EPFO. I further understand that the Option exercised is irrevocable at any later date, and no claim for change of Option shall be entertained or considered under any circumstances.</p>
          <p align="justify" class="style5">5. I undertake that the Option exercised herein is Loject to the EPFO instructions/guidelines/directives that 
            may be issued from time to time.</p>
        </div></td>
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