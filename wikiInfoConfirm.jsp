<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html>
  <head>
    <title><bean:message key="title.mypage"/></title>
  </head>
  <body>
  <h3>確認画面</h3>
    <table>
	    <tr>
	      <td><font size="3">投稿者</font></td>
	      <td><bean:write name="wikiInfoInputForm" property="writer" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">タイトル</font></td>
	      <td><bean:write name="wikiInfoInputForm" property="title" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">プログラミング言語</font></td>
	      <td><bean:write name="wikiInfoInputForm" property="language" /></td>
	    </tr>
	    <tr>
	      <td><font size="3">手順1</font></td>
	      <td><bean:write name="wikiInfoInputForm" property="tejyun1" /></td>
	    </tr>
    </table>

 	<html:form action="/WikiInfoConfirmAction">
    	<html:submit property="submit" value="登録" />
    </html:form>
  </body>
</html:html>