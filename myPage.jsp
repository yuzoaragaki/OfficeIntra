<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.mypage"/></title>
  </head>
  <body>
    <table>
	    <tr>
	      <td><font size="3">Id</font></td>
	      <td><bean:write name="loginForm" property="nameSei" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">Name</font></td>
	      <td><bean:write name="loginForm" property="nameMei" /></td>
	    </tr>
    </table>
  </body>
</html:html>