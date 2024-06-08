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
	
		<h1 style="text-align:center;display:block;color:red;margin:0px;">${intestazione}</h1>
		<h3 style="text-align:center;display:block;color:green;margin:0px;">${saluti}</h3>
		<script src="<c:url value="/static/js/bootstrap.bundle.min.js" />"></script>
	</body>
</html>