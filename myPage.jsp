<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.mypage"/></title>
  </head>
  <body>
    <table>

<h1>登録完了しました。</h1>
	    <tr>
	      <td><font size="3">name</font></td>
	      <td><bean:write name="loginForm" property="name" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">nickname</font></td>
	      <td><bean:write name="loginForm" property="nickname" /></td>
	    </tr>


	    <tr>
	      <td><font size="3">mail</font></td>
	      <td><bean:write name="loginForm" property="mail" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">address</font></td>
	      <td><bean:write name="loginForm" property="address" /></td>
	    </tr>

	    <tr>
	      <td><font size="3">age</font></td>
	      <td><bean:write name="loginForm" property="age" /></td>
	    </tr>

    </table>

<!-- 	   <br> <a href="/./login">トップへ</a> -->

  </body>
</html:html>

