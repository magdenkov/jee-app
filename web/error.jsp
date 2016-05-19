<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<bean:parameter id="errMsg" name="errMsg" />

<html>
<head>
  <title>Error</title>
</head>
<body>
  Error: <%=errMsg%>
</body>
</html>
