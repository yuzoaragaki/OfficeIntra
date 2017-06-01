package actionform.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import actionform.form.WikiInfoInputForm;




public class WikiInfoInputAction extends Action {

	public ActionForward execute (ActionMapping map, ActionForm actionform,
			HttpServletRequest request, HttpServletResponse response) {

		WikiInfoInputForm wikiInfoInputForm = (WikiInfoInputForm) actionform;

		request.setAttribute("wikiInfoInputForm",wikiInfoInputForm);
		return map.findForward("success");
	}
}