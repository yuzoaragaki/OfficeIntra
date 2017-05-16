package database;

public class Sql {
	// ユーザー情報（氏名）取得SQL
	public static final String GET_USER_INFO_NAME_SQL
		= "SELECT NAME_SEI, NAME_MEI FROM USER_INFO WHERE USER_ID = 'userId' AND PASSWORD = 'loginPassword';";
}