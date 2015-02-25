<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Project Manager</title>
<script src="./resources/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="./resources/js/jquery-ui-1.10.2.smoothness.min.js"
	type="text/javascript"></script>
<script src="./resources/js/jquery-validate.min.js"
	type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/fileinput.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/fileinput.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap-datepicker.js" type="text/javascript"></script>
 <script type="text/javascript">       
 $(document).ready(
			function() {
				$('#addVen').submit(
						function(e) {
							$.post('/DRDL/addVendor',
									 $(this).serialize(), 
									function() {
								       alert("SuccessFully Inserted");
							
							});			
							clearInputs();
							e.preventDefault();
						});
			});
        function clearInputs() {
        	$("form")[0].reset();
	}     
	/* function doAjaxPost() {
	    // get the form values
	    var vendorCode = $('#vendorCode').val()+"s1";
	    var vendorName = $('#vendorName').val();
	    var address = $('#address').val();
	    var phoneNumber = $('#phoneNumber').val();
	    var status=$('#status').val();

	    $.ajax({
	        type: "POST",
	        url: contexPath + "/DRDL/addVendor" ,
	        data: {"vendorCode":"vvvv","vendorName":vendorName,"address":address,"phoneNumber":phoneNumber,"status":status},
	        success: function(response){
	            // we have the response
	            
	            if(response.status == "SUCCESS"){
	                vendorInfo = "<ol>";
	                for(i =0 ; i < response.result.length ; i++){
	                	vendorInfo += "<br><li><b>vendorCode</b> : " + response.result[i].vendorCode +
	                    ";<b> vendorName</b> : " + response.result[i].vendorName +
	                    ";<b> address</b> : " + response.result[i].address +
	                    ";<b> PhoneNumber</b> : " + response.result[i].phoneNumber;
	                	";<b> Status</b> : " + response.result[i].status;
	                 }
	                vendorInfo += "</ol>";
	                 $('#info').html("Vendor has been added to the list successfully. " + vendorInfo);
	                 $('#vendorCode').val('');
	                 $('#vendorName').val('');
	                 $('#address').val('');
	                 $('#phoneNumber').val('');
	                 $('#status').val('');
	                 $('#error').hide('slow');
	                 $('#info').show('slow');
	             }else{
	                 errorInfo = "";
	                 for(i =0 ; i < response.result.length ; i++){
	                     errorInfo += "<br>" + (i + 1) +". " + response.result[i].code;
	                 }
	                 $('#error').html("Please correct following errors: " + errorInfo);
	                 $('#info').hide('slow');
	                 $('#error').show('slow');
	             }
	         },
	         error: function(e){
	             alert('Error: ' + e);
	         }
	    });
	} */

 </script>
<style>
.error {
	color: #ee0d25;
}
</style>

</head>
<body>
	<div class="page-header" style="margin-top: 0px">
		<h1  align="center" style="font-family: serif; color:#357ebd;">Defence Research and Development Organization
		</h1>
		</div>
		<ul class="nav nav-tabs" style="margin-top: -25px">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">MASTERS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="pmList">ProjectManager</a></li>
					<li><a href="venList">Vendor</a></li>
					<li><a href="#">Page 1-3</a></li>
				</ul></li>
			<li><a href="#">TRANSACTIONS</a></li>
			<li><a href="#">DECISION</a></li>
			<li><a href="#">QUERY FORMS</a></li>
			<li><a href="#">REPORTS</a></li>
			<li><a href="#">EXIT</a></li>
			<li><a href="list">EMPLOYEE</a></li>
		</ul>
		<div class="container">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="panel panel-primary ">
					<div class="panel-heading">
						<h4 class=" panel-title text-center">Add Vendor</h4>
					</div>
					<div class="panel-body">
						<form:form 
							commandName="vendorDto" cssClass="form-horizontal">
							<div class="form-group">
								<label for="vendorCode" class="col-sm-2 control-label">Vendor
									Code</label>
								<div class="col-sm-4">
									<form:input path="vendorCode" id="vendorCode" placeholder="VendorCode Code"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="vendorName" class="col-sm-2 control-label">Vendor Name </label>
								<div class="col-sm-4">
									<form:input path="vendorName" id="vendorName" placeholder="vendorName"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="address" class="col-sm-2 control-label">address
								</label>
								<div class="col-sm-4">
									<form:input path="address" id="address" placeholder="address"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="phoneNumber" class="col-sm-2 control-label">PhoneNumber</label>
								<div class="col-sm-4">
									<form:input path="phoneNumber" id="phoneNumber" placeholder="phoneNumber"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="status" class="col-sm-2 control-label">Status</label>
								<div class="col-sm-2">
									<form:checkbox path="status" value="active" id="status" placeholder="status"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button id="submit" type="submit" class="btn btn-primary">
										<spring:message code="label.addVendor" />
									</button>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
