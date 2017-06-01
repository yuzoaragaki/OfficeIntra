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
import actionform.form.WikiInfoInputForm;
import api.WikiInfoInsert;



public class WikiInfoConfirmAction extends Action {

	public ActionForward execute (ActionMapping map, ActionForm actionform,
			HttpServletRequest request, HttpServletResponse response) throws SQLException {

			WikiInfoInputForm wikiInfoInputForm = (WikiInfoInputForm)actionform;

			WikiInfoInsert biz = new WikiInfoInsert();
			Map<String, String> containerMap = new HashMap<String, String>();

			try {
				containerMap = biz.wikiInfoInsert(wikiInfoInputForm);
			} catch (Exception e) {
				wikiInfoInputForm.setErrorMsg(Const.ERROR_MSG_EXCEPTION + ":" + e);
				return map.findForward("error");
			}

			if (Const.SHORI_KEKKA_NG.equals(containerMap.get(Key.SHORI_KEKKA))) {
				wikiInfoInputForm.setErrorMsg(Const.ERROR_MSG_INSERT);
				return map.findForward("error");
			}
			return map.findForward("success");
	}
}
