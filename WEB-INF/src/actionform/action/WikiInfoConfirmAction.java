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
import actionform.form.WikiInfoConfirmForm;
import actionform.form.WikiInfoInputForm;
import api.WikiInfoInsert;



public class WikiInfoConfirmAction extends Action {

	public ActionForward execute (ActionMapping map, ActionForm actionform,
			HttpServletRequest request, HttpServletResponse response) throws SQLException {

		WikiInfoConfirmForm wikiInfoConfirmForm = (WikiInfoConfirmForm) actionform;

		WikiInfoInsert biz = new WikiInfoInsert();
		Map<String, String> containerMap = new HashMap<String, String>();

			try {
				containerMap = biz.wikiInfoInsert(wikiInfoConfirmForm);
			} catch (Exception e) {
				wikiInfoConfirmForm.setErrorMsg(Const.ERROR_MSG_EXCEPTION + ":" + e);
				request.setAttribute("wikiInfoInputForm", new WikiInfoInputForm());
				return map.findForward("error");
			}

			if (Const.SHORI_KEKKA_NG.equals(containerMap.get(Key.SHORI_KEKKA))) {
				wikiInfoConfirmForm.setErrorMsg(Const.ERROR_MSG_INSERT);
				request.setAttribute("wikiInfoInputForm", new WikiInfoInputForm());
				return map.findForward("error");
			}

			request.setAttribute("wikiInfoConfirmForm", wikiInfoConfirmForm);
			return map.findForward("success");
	}
}
