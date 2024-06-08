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
		<h3>Saluti ${name}, questi sono gli articoli disponibili.</h3>
		
		<table class="table">
			<thead>
				<tr>
					<th>Codice</th>
					<th>Descrizione</th>
					<th>UM</th>
					<th>Pezzi</th>
					<th>Peso</th>
					<th>Prezzo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${articoli}" var="article">
					<tr>
						<td>${article.codArt}</td>
						<td>${article.descrizione}</td>
						<td>${article.um}</td>
						<td>${article.pzcart}</td>
						<td>${article.pesonetto}</td>
						<td>${article.prezzo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		<script src="<c:url value="/static/js/bootstrap.bundle.min.js" />"></script>
	</body>
</html>