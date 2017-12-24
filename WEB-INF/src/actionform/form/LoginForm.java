package actionform.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{

	private String name = "";

	private String nickname = "";

	private String mail = "";

	private String address = "";

	private String age = "";
//	private Int 年齢 = "";

	private String errorMsg = "";

	public LoginForm(){
	  super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}



















//package actionform.form;
//
//import org.apache.struts.validator.ValidatorForm;
//
//public class LoginForm extends ValidatorForm{
//
//	private String loginId = "";
//
//	private String loginPassword = "";
//
//	private String comment = "";
//
//	private String mailaddress = "";
//
//	private String nameSei = "";
//
//	private String nameMei = "";
//
//	private String errorMsg = "";
//
//	public LoginForm(){
//	  super();
//	}
//
//	public String getLoginId() {
//		return loginId;
//	}
//
//	public void setLoginId(String loginId) {
//		this.loginId = loginId;
//	}
//
//	public String getLoginPassword() {
//		return loginPassword;
//	}
//
//	public void setLoginPassword(String loginPassword) {
//		this.loginPassword = loginPassword;
//	}
//
//
//	public String getComment() {
//		return comment;
//	}
//
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
//
//	public String getmailaddress() {
//		return mailaddress;
//	}
//
//	public void setmailaddress(String mailaddress) {
//		this.mailaddress = mailaddress;
//	}
//
//
//	public String getNameSei() {
//		return nameSei;
//	}
//
//	public void setNameSei(String nameSei) {
//		this.nameSei = nameSei;
//	}
//
//	public String getNameMei() {
//		return nameMei;
//	}
//
//	public void setNameMei(String nameMei) {
//		this.nameMei = nameMei;
//	}
//
//	public String getErrorMsg() {
//		return errorMsg;
//	}
//
//	public void setErrorMsg(String errorMsg) {
//		this.errorMsg = errorMsg;
//	}
//}









//--------------------------------------------------------------------------------------1224
//package actionform.form;
//
//import org.apache.struts.validator.ValidatorForm;
//
//public class LoginForm extends ValidatorForm{
//
//	private String loginId = "";
//
//	private String loginPassword = "";
//
//	private String nameSei = "";
//
//	private String nameMei = "";
//
//	private String errorMsg = "";
//
//	public LoginForm(){
//	  super();
//	}
//
//	public String getLoginId() {
//		return loginId;
//	}
//
//	public void setLoginId(String loginId) {
//		this.loginId = loginId;
//	}
//
//	public String getLoginPassword() {
//		return loginPassword;
//	}
//
//	public void setLoginPassword(String loginPassword) {
//		this.loginPassword = loginPassword;
//	}
//
//	public String getNameSei() {
//		return nameSei;
//	}
//
//	public void setNameSei(String nameSei) {
//		this.nameSei = nameSei;
//	}
//
//	public String getNameMei() {
//		return nameMei;
//	}
//
//	public void setNameMei(String nameMei) {
//		this.nameMei = nameMei;
//	}
//
//	public String getErrorMsg() {
//		return errorMsg;
//	}
//
//	public void setErrorMsg(String errorMsg) {
//		this.errorMsg = errorMsg;
//	}
//}