<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<bean:define id="user" name="UserForm" type="org.bugfix.ui.UserForm" scope="session" />

<html>
<head>
  <title><%="new".equals(user.getMode()) ? "New User" : "Edit User"%>User</title>
</head>
<body>
<html:form action="/user">
<table width="100%" height="100%">
<% if ("edit".equals(user.getMode())) { %>
  <tr>
    <td>ID:&nbsp;</td>
    <td><%=user.getId()%></td>
    <td>&nbsp;</td>
  </tr>
<% } %>
  <tr>
    <td>Login</td>
    <td><html:text property="login" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Password</td>
    <td><html:password property="password" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>User Name</td>
    <td><html:text property="name" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" height="100%" align="left" valign="top">
      <input type="submit" value="Finish" onclick="document.forms[0].mode.value='finish'; return true;"/>&nbsp;
      <input type="submit" value="Cancel" />
    </td>
  </tr>
</table>
<input type="hidden" name="mode" value="cancel">
</html:form>
</body>
</html>
