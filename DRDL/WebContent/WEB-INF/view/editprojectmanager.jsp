<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Edit Project Manager </title>
 <script type="text/javascript">
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
					<h4 class=" panel-title text-center">Edit ProjectManager</h4>
				</div>
				<div class="panel-body">
					<c:url var="saveUrl" value="editProjectManager?id=${projectManagerDto.id}" />
					<form:form modelAttribute="projectManagerDto" method="post"
						action="${saveUrl}" cssClass="form-horizontal">
				<div class="form-group">
								<label for="pmcode" class="col-sm-2 control-label">Project Manager Code</label>
								<div class="col-sm-4">
									<form:input path="pmcode" placeholder="ProjectManager Code"
										cssClass="form-control" />
								</div>
								</div>
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">Name </label>
								<div class="col-sm-4">
									<form:input path="name" placeholder="name"
										cssClass="form-control" />
								</div>
								</div>
								<div class="form-group">
								<label for="grade" class="col-sm-2 control-label">Grade </label>
								<div class="col-sm-4">
									<form:input path="grade" placeholder="grade"
										cssClass="form-control" />
								</div>
								</div>
							<div class="form-group">
								<label for="designation" class="col-sm-2 control-label">Designation</label>
								<div class="col-sm-4">
									<form:input path="designation" placeholder="designation"
										cssClass="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label for="email" class="col-sm-2 control-label">Email</label>
								<div class="col-sm-4">
									<form:input path="email" placeholder="email"
										cssClass="form-control" />
								</div>
								</div>
                                 <div class="form-group">
								<label for="phoneNumber" class="col-sm-2 control-label">Phone
									Number</label>
								<div class="col-sm-4">
									<form:input path="phoneNumber" placeholder="phoneNumber"
										cssClass="form-control" />
								</div>
							</div>
							 <div class="form-group" >
								<label for="dob" class="col-sm-2 control-label">Date of Birth
									</label>
								<div class="col-sm-4">
								  <div class="input-group">
									<%-- <form:input path="dob"  id="dobdatepicker" placeholder="Date of Birth"
										cssClass="date-picker form-control"/>
									 --%>	
									 <input type="text" value="<fmt:formatDate value="${projectManagerDto.dob}" pattern="dd/MM/yyyy"/>" name="dob" id="dobdatepicker" class="date-picker form-control"/>
									  <label for="dobdatepicker" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>
                                      </label>
								</div>
								</div>
							</div>
						<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.updateProjectManager" />
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
