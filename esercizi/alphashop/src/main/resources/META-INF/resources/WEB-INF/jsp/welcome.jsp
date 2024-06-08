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
	
		<%@ include file="common/navbar.jspf" %>
	
		<h1>Benvenuti in Alfashop</h1>
		<h3>Saluti ${name}, clicca <a href="/articoli">qui</a> per vedere gli articoli disponibili.</h3>
		
		
		
		
		<script src="<c:url value="/static/js/bootstrap.bundle.min.js" />"></script>
	</body>
</html>