<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<!-- Required meta tags -->
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	<!-- Bootstrap CSS -->
		<link href="<c:url value="/static/css/bootstrap.min.css" />" rel="stylesheet">
		<title>Alfashop</title>
	</head>
	<body>
	
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
  			<div class="container-fluid">
    			<a class="navbar-brand" href="/">Alfashop</a>
    			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      				<span class="navbar-toggler-icon"></span>
    			</button>
    		<div class="collapse navbar-collapse" id="navbarNav">
      			<ul class="navbar-nav">
        			<li class="nav-item">
          				<a class="nav-link active" aria-current="page" href="/index">Home</a>
        			</li>
        			<li class="nav-item">
          				<a class="nav-link" href="#">Features</a>
        			</li>
        			<li class="nav-item">
          				<a class="nav-link" href="#">Pricing</a>
        			</li>
       	 			<li class="nav-item">
          				<a class="nav-link disabled" aria-disabled="true">Disabled</a>
        			</li>
      			</ul>
    		</div>
  			</div>
		</nav>
	
		<h1>Benvenuti in Alfashop</h1>
		<h3>Saluti ${name}, clicca <a href="/articoli">qui</a> per vedere gli articoli disponibili.</h3>
		
		
		
		
		<script src="<c:url value="/static/js/bootstrap.bundle.min.js" />"></script>
	</body>
</html>