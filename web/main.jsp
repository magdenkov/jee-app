<%@ page import="org.bugfix.dao.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<bean:define id="users" name="ListUsersForm" property="users" type="java.util.List" scope="session" />

<html>
<head>
  <title>Users</title>
</head>
<body>
  <html:form action="/user.do">
  <table width="100%" height="100%">
    <tr>
      <td colspan="4" align="left">
        <input type="submit" value="New" onclick="document.forms[0].mode.value='new'; return true;" />&nbsp;
        <input type="submit" value="Edit" onclick="document.forms[0].mode.value='edit'; return true;" />&nbsp;
      </td>
    </tr>
    <tr>
      <td bgcolor="#a9a9a9">&nbsp;</td>
      <td bgcolor="#a9a9a9" width="20%">Login</td>
      <td bgcolor="#a9a9a9" width="30%">User Name</td>
      <td width="50%">&nbsp;</td>
    </tr>
<%
  for (User user : (List<User>)users) {
%>
    <tr>
      <td><input type="radio" name="id" value="<%=user.getUserID()%>" /></td>
      <td><%=user.getUserLogin()%></td>
      <td><%=user.getUserName()%></td>
      <td width="100%">&nbsp;</td>
    </tr>
<%
  }
%>
    <tr><td colspan="4" height="100%">&nbsp;</td></tr>
  </table>
  <input type="hidden" name="mode" />
  </html:form>
</body>
</html>
