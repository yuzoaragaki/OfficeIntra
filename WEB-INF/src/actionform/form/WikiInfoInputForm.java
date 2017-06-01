package actionform.form;

import org.apache.struts.validator.ValidatorForm;

public class WikiInfoInputForm extends ValidatorForm{

	private String writer = "";

	private String title = "";

	private String language = "";

	private String tejyun1 = "";

	private String errorMsg = "";

	public WikiInfoInputForm(){
	  super();
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTejyun1() {
		return tejyun1;
	}

	public void setTejyun1(String tejyun1) {
		this.tejyun1 = tejyun1;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}