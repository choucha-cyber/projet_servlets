<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire mineur</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header>
		<!-- Navigation -->
				<nav>
				<ul class="nav">
					<li><a href="index" >
					<img
							style="width: 8rem; height:auto; border-radius: 50%;"
							alt="logo " src="images/logo_ajc.png"></a></li>
					<li><a href="index"> Qui
							sommes nous</a></li>
					<li><a href="contact">
							Contact</a></li>
					<c:if test="${empty client }">
						<li><a href="login">Login</a></li>
					</c:if>
					<c:if test="${not empty client }">
						<li><a href="#" >Bonjour
								${ client.prenom}</a><a href="logout">logout</a></li>
					</c:if>
				</ul>
				</nav>	
	</header>