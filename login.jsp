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
    <html:errors property="name" />
    <html:form action="/LoginAction">
    <table>
    <tr>
      <td><font size="3"><bean:message key="label.name"/></font></td>
      <td><html:text property="name" size="20" maxlength="50" /></td>
    </tr>
    <tr>
      <td><font size="3"><bean:message key="label.nickname"/></font></td>
      <td><html:password property="nickname" size="20" maxlength="50" /></td>
    </tr>

        <!-- コメント　property="loginTest"で1行追加する -->
    <!-- ヒント 以下を真似する-->

	<tr>
      <td><font size="3"><bean:message key="label.mail"/></font></td>
      <td><html:text property="mail" size="20" maxlength="50" /></td>
    </tr>

    <tr>
      <td><font size="3"><bean:message key="label.address"/></font></td>
      <td><html:text property="address" size="20" maxlength="50" /></td>
    </tr>

    <tr>
      <td><font size="3"><bean:message key="label.age"/></font></td>
      <td><html:text property="age" size="20" maxlength="50" /></td>
    </tr>

    </table><br>
      <html:submit property="submit" value="Submit" />
    </html:form>
    <p><bean:write name="loginForm" property="errorMsg" /></p>

  </body>
</html:html>
