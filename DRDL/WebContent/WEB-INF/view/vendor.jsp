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
<script src="./resources/js/knockout-3.1.0.js" type="text/javascript"></script>
<script src="./resources/js/main.js" type="text/javascript"></script>

<script src="./resources/js/bootstrapValidator.min.js" type="text/javascript"></script>
<script src="./resources/js/moment.min.js" type="text/javascript"></script>
<link href="<c:url value="/resources/css/datepicker.css" />"
	rel="stylesheet" type="text/css" />
	<link href="<c:url value="/resources/css/bootstrapValidator.min.css" />"
	rel="stylesheet" type="text/css" />
<script src="./resources/js/bootstrap-datepicker.js" type="text/javascript"></script>
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
        var urlprefix = 'DRDL/venList';
        var webapiUrl = 'DRDL/addVendor';
        var viewModel = {
         vendorCode: ko.observable(''),
         vendorName: ko.observable(''),
         address: ko.observable(''),
            PhoneNumber: ko.observable(''),
            status: ko.observable(''),
            createVendor: function (data) {
                var validator = $('#vendorDto').data('bootstrapValidator');
                validator.validate();
                if (validator.isValid()) {
                    var self = this;
                    var top = {
                    		 vendorCode: data.vendorCode(),
                             vendorName: data.vendorName(),
                             address: data.address(),
                             PhoneNumber:data. PhoneNumber(),
                             status: data.status(),    
                    }
                 
                       $.ajax({
                           url: webapiUrl,
                           type: "POST",
                           contentType: 'application/json',
                           data:JSON.stringify(top),
                           success: function (data) {
                               window.location.href = "list";
                           },
                           error: function (status) {
                               var a = status;
                           }
                       });
                    
                }

            },
            cancel: function () {
                window.location = urlprefix;
            }
        };
        $.ajax({
            url: webapiUrl,
            type: "GET",
            contentType: 'application/json',
            success: function (data) {
                viewModel.grades(data);
                ko.applyBindings(viewModel);
            },
            error: function (status) {
                var a = status;
            }
        });


    });
   
</script>
<style>
.error {
	color: #ee0d25;
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
						<h4 class=" panel-title text-center">Add Vendor</h4>
					</div>
					<div class="panel-body">
						<form:form 
							commandName="vendorDto" id="vendorDto" cssClass="form-horizontal">
							<div class="form-group">
								<label for="vendorCode" class="col-sm-2 control-label">Vendor
									Code</label>
								<div class="col-sm-4">
									<form:input path="vendorCode" id="vendorCode" data-bind="value : vendorCode" placeholder="VendorCode Code"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="vendorName" class="col-sm-2 control-label">Vendor Name </label>
								<div class="col-sm-4">
									<form:input path="vendorName" id="vendorName" data-bind="value : vendorName" placeholder="vendorName"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="address" class="col-sm-2 control-label">address
								</label>
								<div class="col-sm-4">
									<form:input path="address" id="address" data-bind="value : address" placeholder="address"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="phoneNumber" class="col-sm-2 control-label">PhoneNumber</label>
								<div class="col-sm-4">
									<form:input path="phoneNumber" id="phoneNumber"  data-bind="value : phoneNumber" placeholder="phoneNumber"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label for="status" class="col-sm-2 control-label">Status</label>
								<div class="col-sm-2">
									<form:checkbox path="status" value="active" id="status" data-bind="value : status" placeholder="status"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button  type="submit" data-bind="click: addVendor " value="Create" class="btn btn-primary">
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
