<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Edit Vendor </title>
<!--  <script type="text/javascript">
 $(function() {
		var str = $('#txt-image').val();
		$('#image').attr('src', 'data:image/jpg;base64,' + str);
	      });
            // When the document is ready
            $(document).ready(function () {
                $('#dobdatepicker').datepicker({
                    format: "dd/mm/yyyy",
                    showMeridian: true,
                    autoclose: true,
                });  
            
            });
</script>
 -->
 <script type="text/javascript">
    var validationRules = {
        container: 'tooltip',
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	vendorCode: {
                message: 'VendorCode is not valid',
                validators: {
                    notEmpty: {
                        message: 'VendorCode is required and cannot be empty'
                    }
                }
            },
           
        	vendorName: {
                message: 'Vendor Name is not valid',
                validators: {
                    notEmpty: {
                        message: 'Vendor Name is required and cannot be empty'
                    }
                }
            },
           
            address: {
                message: 'Address is not valid',
                validators: {
                    notEmpty: {
                        message: 'Address is required and cannot be empty'
                    }
                }
            },
            phoneNumber: {
                message: '  Phone number is not valid',
                validators: {
                    notEmpty: {
                        message: 'Phone number is required and cannot be empty'
                    },
                    stringLength: {
                        min: 7,
                        max: 15,
                        message: 'Phone number must be more than 7 and less than 15 characters long'
                    }
                }
            },
           
           
            status: {
                message: 'Status is not valid',
                validators: {
                    notEmpty: {
                        message: 'Status is required and cannot be empty'
                    }
                }
            }
        }
           
    };
    $(function () {
       $('#vendorDto').bootstrapValidator(validationRules);
       $('#vendorDto').bootstrapValidator('revalidateField', $(this).data('for'));
    });
   
</script>
<style>
.error {
	color: #ee0d25;
}
 .control-label {
        text-align: left !important;
    }
body {
	font-family: Arial;
	font-size: 10pt;
}
</style>

</head>

<body>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
	<div class="container">
		<div class="col-sm-offset-1 col-sm-10">

			<div class="panel panel-primary ">
				<div class="panel-heading">
					<h4 class=" panel-title text-center">Edit Vendor</h4>
				</div>
				<div class="panel-body">
					<c:url var="saveUrl" value="editVendor?id=${vendorDto.id}" />
					<form:form modelAttribute="vendorDto" id="vendorDto" method="post"
						action="${saveUrl}" cssClass="form-horizontal">
			     	<div class="form-group">
								<label for="vendorCode" class="col-sm-2 control-label">Vendor
									Code</label>
								<div class="col-sm-4">
									<form:input path="vendorCode" placeholder="VendorCode Code"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="vendorName" class="col-sm-2 control-label">Vendor Name </label>
								<div class="col-sm-4">
									<form:input path="vendorName" placeholder="vendorName"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="address" class="col-sm-2 control-label">address
								</label>
								<div class="col-sm-4">
									<form:input path="address" placeholder="address"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="phoneNumber" class="col-sm-2 control-label">PhoneNumber</label>
								<div class="col-sm-4">
									<form:input path="phoneNumber" placeholder="phoneNumber"
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
									<button type="submit" onclick="updateVendor" class="btn btn-primary">
										<spring:message code="label.updateVendor" />
									</button>
								</div>
							</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
