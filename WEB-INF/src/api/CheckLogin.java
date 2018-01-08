package api;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import actionform.form.LoginForm;
import database.Query;
import database.Sql;


public class CheckLogin {

	// コンストラクタ
	public CheckLogin () {

	}

	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {

		// ① 氏名を受け取る
		String name = loginForm.getName();
		// ② ニックネームを受け取る
		String nickname= loginForm.getNickname();
		// ③ここで メールアドレスを受け取る
		String mail = loginForm.getMail();
		// ④ここで 住所を受け取る
		String address = loginForm.getAddress();
		// ⑤ここで 年齢を受け取る
		String age = loginForm.getAge();

		String sql = Sql.INSERT_TOROKU_SQL;

		sql = sql.replaceFirst("nameVal", name);
		sql = sql.replaceFirst("nicknameVal", nickname);
		sql = sql.replaceFirst("mailVal", mail);
		sql = sql.replaceFirst("addressVal", address);
		sql = sql.replaceFirst("ageVal", age);

		Map<String, String> containerMap = new HashMap<String, String>();
		try {
			Query query = new Query();

		int aaa = 0;;
		int i =aaa; query.getInsertResult(sql);

		} catch (SQLException e) {
			throw new SQLException(e);
		}
		return containerMap;
	}
}