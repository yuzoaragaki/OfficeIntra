package actionform.action;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import actionform.Const;
import actionform.Key;
import actionform.form.LoginForm;
import api.CheckLogin;

public class SendAction extends Action {

	public ActionForward execute (ActionMapping map, ActionForm actionform,
			HttpServletRequest request, HttpServletResponse response) throws SQLException {

		LoginForm loginForm = (LoginForm) actionform;

		CheckLogin biz = new CheckLogin();
		Map<String, String> containerMap = new HashMap<String, String>();
		try {
			containerMap = biz.checkLogin(loginForm);
		} catch (Exception e) {
			loginForm.setErrorMsg(Const.ERROR_MSG_EXCEPTION + ":" + e);
			return map.findForward("error");
		}

		if (Const.SHORI_KEKKA_NG.equals(containerMap.get(Key.SHORI_KEKKA))) {
			loginForm.setErrorMsg(Const.ERROR_MSG_LOGIN);
			return map.findForward("error");
		}
		Const.SHORI_KEKKA_OK.equals(containerMap.get(Key.SHORI_KEKKA));
		loginForm.setName(containerMap.get(Key.name));
		loginForm.setNickname(containerMap.get(Key.nickname));
		loginForm.setMail(containerMap.get(Key.mail));
		loginForm.setAddress(containerMap.get(Key.address));
		loginForm.setAge(containerMap.get(Key.age));
		request.setAttribute("loginForm",loginForm);
		return map.findForward("success");
	}
}

