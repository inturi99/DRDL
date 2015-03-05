<%@ include file="pageCashing.jsp"%>
<html>
<head>
<title>Working Days</title>
   <script>
$(document).ready(function(){
  $.dobPicker({
    daySelector: '#dobday', /* Required */
    monthSelector: '#dobmonth', /* Required */
    yearSelector: '#dobyear', /* Required */
    dayDefault: 'Day', /* Optional */
    monthDefault: 'Month', /* Optional */
    yearDefault: 'Year', /* Optional */
    minimumAge: 8, /* Optional */
    maximumAge: 100 /* Optional */
  });
});
</script>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
<style>
.error {
	color: #ee0d25;
}
</style>

</head>
<body>
<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
		<div class="container">
			<div class="col-sm-offset-1 col-sm-10">
				<div class="panel panel-primary ">
					<div class="panel-heading">
						<h4 class=" panel-title text-center">Add Working Days</h4>
					</div>
					<div class="panel-body">
						<form:form method="post" action="addMonthlyworkingdays"
							commandName="monthlyWorkingDaysDto" cssClass="form-horizontal">
							<div class="form-group">
								<label for="workingdays" class="col-sm-2 control-label">workingdays</label>
								<div class="col-sm-4">
									<form:select path="workingdays" id="dobday" placeholder="workingdays"
										cssClass="form-control" />
								</div>
							</div>
							<div class="form-group" >
								<label for="month" class="col-sm-2 control-label">Month
									</label>
								<div class="col-sm-4">
									<form:select path="month"  id="dobmonth" placeholder="Month"
										cssClass="form-control" />
								</div>
							</div>
                             <div class="form-group" >
								<label for="year" class="col-sm-2 control-label">Year
									</label>
								<div class="col-sm-4">
									<form:select path="year"  id="dobyear" placeholder="Year"
										cssClass="form-control" />		 
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<button type="submit" class="btn btn-primary">
										<spring:message code="label.addworkingdays" />
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
