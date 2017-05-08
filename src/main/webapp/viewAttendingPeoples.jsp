<%@page import="pojo.AttendingPeople"%>
<%@page import="util.Select"%>
<%@page import="pojo.TalkPojo"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<head>
<%String username= (String)request.getSession().getAttribute("username");
if(username.equals(null)) response.sendRedirect("index.jsp");
%>

<meta charset="UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
<title>Techtonics Login</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<link href="bootstrap/myCss.css" rel="stylesheet">
<link href="bootstrap/tech.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<!-- Navigation -->
	<nav class="navbar " role="navigation">
		<div class="">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->

			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">Home</a></li>
					<li><a href="#">About </a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Contact </a></li>
					<li><a href="LogoutController">LogOut </a></li>

				</ul>
				
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<div class="brand">
		<img class="img-responsive img-border img-left"
			src="bootstrap/images/logo.jpg">

	</div>
	<h1 class="brand" style="color: white;">TechTonics</h1>

	<p style="color: orange;margin-left:50px;">Welcome <%=request.getSession().getAttribute("username") %></p>
	<div class="container">

		<div class="row">
			<div class="box">
				<div class="col-lg-12 text-center">
					<input type="submit" class="btn-danger btn-lg"
						onclick="location.href = 'AddTalk.jsp';" value="Add new TechTalk" />
						
						<input type="submit" class="btn-danger btn-lg"
						onclick="location.href = 'AdminPannel.jsp';" value="Go Back" />
					<h3 style="color: blue;" class="text-left">Peoples Attending Talk on <%=request.getSession().getAttribute("topicName") %></h3>

					<table class="table text-color text-left">
						<thead>
							<tr>
								<th><p style="color: green;">Topic</p></th>
								<th><p style="color: green;">Employee</p></th>
								
							</tr>
						</thead>
						<tbody>
						<% 
						String topicname=(String)request.getSession().getAttribute("topicName");
						ArrayList<AttendingPeople> list =Select.getAttendingPeopleList(topicname);						
						for(AttendingPeople obj : list)
						{	
						%>
						
								<tr class="default ">
									<td><%=obj.getTopic() %></td>
									<td><%=obj.getEmp() %></td>
									
								</tr>
							<%} %>

						</tbody>
					</table>


				</div>
			</div>
		</div>

		
	<!-- /.container -->






</body>
</html>