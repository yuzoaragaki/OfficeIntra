package api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import actionform.Const;
import actionform.Key;
import actionform.form.LoginForm;
import database.Query;
import database.Sql;


public class CheckLogin {

	// コンストラクタ
	public CheckLogin () {

	}

	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {

		String loginId = loginForm.getLoginId();
		String loginPassword = loginForm.getLoginPassword();
		String sql = Sql.GET_USER_INFO_NAME_SQL;
		sql = sql.replaceFirst("userId", loginId);
		sql = sql.replace("loginPassword", loginPassword);
		Map<String, String> containerMap = new HashMap<String, String>();
		try {
			Query query = new Query();
			ResultSet result = query.getSelectResult(sql);

			if(result.next()) {
				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
				containerMap.put(Key.NAME_SEI, result.getString("NAME_SEI"));
				containerMap.put(Key.NAME_MEI, result.getString("NAME_MEI"));
			} else {
				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
			}
		} catch (SQLException e) {
			throw new SQLException(e);
		}
		return containerMap;
	}
}