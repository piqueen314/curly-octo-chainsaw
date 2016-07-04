<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>HTTP Headers</title>
</head>
<body>
<h1>HTTP Headers</h1>

<pre>
<c:forEach var="elem" items="${headers}">
${elem.key} : ${elem.value}</c:forEach>
</pre>

</body>
</html>
