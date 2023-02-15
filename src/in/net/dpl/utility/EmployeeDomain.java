package in.net.dpl.utility;

import java.util.Date;

public class EmployeeDomain {
  
  public String getEmpName() {
	return empName;
}



public void setEmpName(String empName) {
	this.empName = empName;
}



public String getDateOfJoin() {
	return dateOfJoin;
}



public void setDateOfJoin(String dateOfJoin) {
	this.dateOfJoin = dateOfJoin;
}



public String getDept() {
	return dept;
}



public void setDept(String dept) {
	this.dept = dept;
}



public String getPfNo() {
	return pfNo;
}



public void setPfNo(String pfNo) {
	this.pfNo = pfNo;
}



public String getFpfNo() {
	return fpfNo;
}



public void setFpfNo(String fpfNo) {
	this.fpfNo = fpfNo;
}



public String getUanNo() {
	return uanNo;
}



public void setUanNo(String uanNo) {
	this.uanNo = uanNo;
}



public String getMobile() {
	return mobile;
}



public void setMobile(String mobile) {
	this.mobile = mobile;
}



public String getAadharNo() {
	return aadharNo;
}



public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}



public String getEmailId() {
	return emailId;
}



public void setEmailId(String emailId) {
	this.emailId = emailId;
}



public String getAddress1() {
	return address1;
}



public void setAddress1(String address1) {
	this.address1 = address1;
}



public String getAddress2() {
	return address2;
}



public void setAddress2(String address2) {
	this.address2 = address2;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getDistrict() {
	return district;
}



public void setDistrict(String district) {
	this.district = district;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getPin() {
	return pin;
}



public void setPin(String pin) {
	this.pin = pin;
}



public String getAltMobNo() {
	return altMobNo;
}



public void setAltMobNo(String altMobNo) {
	this.altMobNo = altMobNo;
}



public String getRetirementFlag() {
	return retirementFlag;
}



public void setRetirementFlag(String retirementFlag) {
	this.retirementFlag = retirementFlag;
}



public String getDeathFlag() {
	return deathFlag;
}



public void setDeathFlag(String deathFlag) {
	this.deathFlag = deathFlag;
}



public String getPpoNo() {
	return ppoNo;
}



public void setPpoNo(String ppoNo) {
	this.ppoNo = ppoNo;
}



public Date getStartDatePension() {
	return startDatePension;
}



public void setStartDatePension(Date startDatePension) {
	this.startDatePension = startDatePension;
}



public Date getDateRetire() {
	return dateRetire;
}



public void setDateRetire(Date dateRetire) {
	this.dateRetire = dateRetire;
}



public String getBankIfsc() {
	return bankIfsc;
}



public void setBankIfsc(String bankIfsc) {
	this.bankIfsc = bankIfsc;
}



public String getBankAcNo() {
	return bankAcNo;
}



public void setBankAcNo(String bankAcNo) {
	this.bankAcNo = bankAcNo;
}



public String getBankName() {
	return bankName;
}



public void setBankName(String bankName) {
	this.bankName = bankName;
}



public String getBankBranch() {
	return bankBranch;
}



public void setBankBranch(String bankBranch) {
	this.bankBranch = bankBranch;
}



public String getApplicantName() {
	return applicantName;
}



public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}



public String getRelationship() {
	return relationship;
}



public void setRelationship(String relationship) {
	this.relationship = relationship;
}



public String getApplicationNo() {
	return applicationNo;
}



public void setApplicationNo(String applicationNo) {
	this.applicationNo = applicationNo;
}



public Date getApplicationDate() {
	return applicationDate;
}



public void setApplicationDate(Date applicationDate) {
	this.applicationDate = applicationDate;
}



  private String empName;
  private String dateOfJoin;
  private String dept;
  private String pfNo;
  private String fpfNo;
  private String uanNo;
  private String mobile;
  private String aadharNo;
  private String emailId;
  private String address1;
  private String address2;
  private String city;
  private String district;
  private String state;
  private String pin;
  private String altMobNo;
  private String retirementFlag;
  private String deathFlag;
  private String ppoNo;
  private Date startDatePension;
  private Date dateRetire;
  private String bankIfsc;
  private String bankAcNo;
  private String bankName;
  private String bankBranch;
  private String applicantName;
  private String relationship;
  private String applicationNo;
  private Date applicationDate;
  private String empNo;
  public String getEmpStatus() {
	return empStatus;
}



public void setEmpStatus(String empStatus) {
	this.empStatus = empStatus;
}



private String empStatus;
  
  
  
  
  public String getEmpNo() {
	return empNo;
}



public void setEmpNo(String empNo) {
	this.empNo = empNo;
}



// toString() method for printing the object values
  @Override
  public String toString() {
    return "Employee [empName=" + empName + ", dateOfJoin=" + dateOfJoin + ", dept=" + dept + ", pfNo=" + pfNo
        + ", fpfNo=" + fpfNo + ", uanNo=" + uanNo + ", mobile=" + mobile + ", aadharNo=" + aadharNo + ", emailId="
        + emailId + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", district=" + district
        + ", state=" + state + ", pin=" + pin + ", altMobNo=" + altMobNo + ", retirementFlag=" + retirementFlag
        + ", deathFlag=" + deathFlag + ", ppoNo=" + ppoNo + ", startDatePension=" + startDatePension + ", dateRetire="
        + dateRetire + ", bankIfsc=" + bankIfsc + ", bankAcNo=" + bankAcNo + ", bankName=" + bankName
        + ", bankBranch=" + bankBranch + ", applicantName=" + applicantName + ", relationship=" + relationship
        + ", applicationNo=" + applicationNo + ", applicationDate=" + applicationDate + "]";
  }
}

