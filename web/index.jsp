<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html>
  <head>
    <title>Bug fixing trial project</title>
  </head>
  <body>
  <form action="<html:rewrite page="/login.do" />" >
  <table width="100%" height="100%">
    <tr><td colspan="3" height="40%">&nbsp;</td></tr>
    <tr>
      <td width="40%">&nbsp;</td>
      <td>
        <table>
          <tr>
            <td colspan="2">Welcome to Bug Nest</td>
          </tr>
          <tr>
            <td>Login:</td>
            <td><input type="text" name="login" width="20"></td>
          </tr>
          <tr>
            <td>Password:</td>
            <td><input type="password" name="password" width="20"></td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="submit" value="Login" />
            </td>
          </tr>
        </table>
      </td>
      <td width="100%">&nbsp;</td>
    </tr>
    <tr><td colspan="3" height="100%">&nbsp;</td></tr>
  </table>
  </form>
  </body>
</html>