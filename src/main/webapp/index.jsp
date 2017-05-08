<!DOCTYPE html>

<head>
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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<header>
		
		<div class="page-header">
    		<h1 style="color:maroon;">TechTonics</h1>    
  		</div>
		
			
		</header>
		<section>
			<div id="container_demo">
				<!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
				<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
					id="tologin"></a>
				<div id="wrapper">
					<div id="login" class="animate form">
						<form action="LoginController" autocomplete="on" method="get">
							<h1>Log in</h1>
							<p>
								<label for="username" class="uname"> Your email or
									username </label> <input id="username" name="username"
									required="required" type="text"
									placeholder="myusername or mymail@mail.com" />
							</p>
							<p>
								<label for="password" class="youpasswd"> Your password </label>
								<input id="password" name="password"
									pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<p class="keeplogin">
								<input type="checkbox" name="loginkeeping" id="loginkeeping"
									value="loginkeeping" /> <label for="loginkeeping">Keep
									me logged in</label>
							</p>
							<p>
								<input type="submit" class="btn-danger" value="LogIn" />
							</p>

							<p class="change_link">
								Not a member yet ? <a href="#toregister" class="to_register">Join
									us</a>
							</p>
						</form>
					</div>

					<div id="register" class="animate form">
						<form action="RegistrationController" autocomplete="on"
							method="post">
							<h1>Sign up</h1>
							<p>
								<label for="usernamesignup" class="uname">Your username</label>
								<input id="usernamesignup" name="usernamesignup"
									required="required" type="text"
									placeholder="mysuperusername690" />
							</p>
							<p>
								<label for="emailsignup" class="youmail"> Your email</label> <input
									id="emailsignup" name="emailsignup"
									pattern="[a-z0-9._%+-]+@[atmecs.-]+\.[com]{3}$"
									title="must be xyz@atmecs.com only" required="required"
									type="email" placeholder="mysupermail@mail.com" />
							</p>
							<p>
								<label for="passwordsignup" class="youpasswd">Your
									password </label> <input id="passwordsignup" name="passwordsignup"
									pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
									required="required" required="required" type="password"
									placeholder="eg. X8df!90EO" />
							</p>
							<p>
								<label for="passwordsignup_confirm" class="youpasswd">Please
									confirm your password </label> <input id="passwordsignup_confirm"
									name="passwordsignup_confirm"
									pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
									required="required" required="required" type="password"
									placeholder="eg. X8df!90EO" />
							</p>
							<p class="signin button">
								<input type="submit" value="Sign up" />
							</p>
							<p class="change_link">
								Already a member ? <a href="#tologin" class="to_register">
									Go and log in </a>
							</p>
						</form>
					</div>
				</div>
				
			</div>
		</section>
		
	</div>
</body>
</html>