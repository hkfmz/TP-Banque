<%@ page import="modele.Client" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	IllegalArgumentException err = (IllegalArgumentException) request.getAttribute("ErreurCreationClient");
	Client client = (Client) request.getAttribute("ClientAjoute");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> R�sultat de l'enregistrement du client </h1>

<%	if (err == null) { %>
		<h2 style="color: green;">Le client a bien �t� enregistr� sous le num�ro : <%= client.getId() %> </h2>
<%	} else { %>
		<h2 style="color: red;">Le client n'a pas pu �tre enregistr�. Veuillez renseigner tous les champs </h2>
<%	} %>
</body>
</html>