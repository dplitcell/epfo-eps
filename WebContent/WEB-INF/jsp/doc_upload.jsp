<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DPL EPS PENSION PORTAL-DOCUMENT UPLOAD</title>

<style>
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
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="//code.jquery.com/jquery-1.11.3.js"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.js"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/additional-methods.js"></script>

<script type="text/javascript">
$.validator.addMethod('filesize', function (value, element, arg) {
    var minsize=1000; // min 1kb
    if((value>minsize)&&(value<=arg)){
        return true;
    }else{
        return false;
    }
});

$("#frm1" ).validate({
    rules: {
        file_upload:{
            required:true,
            accept:"application/pdf",
            filesize: 500000   //max size 500 kb
        }
    },messages: {
        file_upload:{
            filesize:"file size must be less than 5 MB.",
            accept:"Please upload .pdf file ",
            required:"Please upload file."
        }
    },
    submitHandler: function(form) {
        form.submit();
    }
});
</script>




</head>
<style>



input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  
  padding: 20px;
}
</style>

<body>

<p>${sessionScope.app_id}</p>
<p>${sessionScope.full_name}</p>
<a href="user_auth.dpl">Home</a>
<p align="center" class="style2">${requestScope.message}</p>
<p align="center" class="style1">DPL EPS PENSION-APPLICATION FORM UPLOAD </p>
<div align="center">
<table width="616" border="1">
  <tr>
    <th width="345" scope="col"><div align="left">
      <p>All the required details have been captured. </p>
      <p>Now please upload scanned signed copy of the Joint Option Form in PDF Format:</h3></p>
      
      <p>&nbsp;</p>
    </div></th>
    <th width="255" scope="col"> 
    <form name="frm1" id="frm1" method="post" action="UploadDoc.dpl" enctype="multipart/form-data">
            Select file to upload:
            <input type="file" name="fname" id="fname" accept="application/pdf"/>
            <br/><br/>
            
            <input type="submit" value="Upload Option Form" />
        </form></th>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</div>
<p>&nbsp;</p>
</body>
</html>