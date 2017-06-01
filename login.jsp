<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.login"/></title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript" ></script>
    <link href="WEB-INF/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="WEB-INF/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <script src="WEB-INF/bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>
    <html:errors property="loginId" />
    <html:form action="/LoginAction">
    <table>
    <tr>
      <td><font size="3"><bean:message key="label.id"/></font></td>
      <td><html:text property="loginId" size="20" maxlength="50" /></td>
    </tr>
    <tr>
      <td><font size="3"><bean:message key="label.password"/></font></td>
      <td><html:password property="loginPassword" size="20" maxlength="50" /></td>
    </tr>
    </table><br>
      <html:submit property="submit" value="Submit" />
    </html:form>
    <p><bean:write name="loginForm" property="errorMsg" /></p>
  </body>
</html:html>