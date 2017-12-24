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

		// ① 氏名を受け取る
		String name = loginForm.getName();
		// ② ニックネームを受け取る
		String nickname= loginForm.getName();
		// ③ここで メールアドレスを受け取る
		String mail = loginForm.getMail();
		// ④ここで 住所を受け取る
		String address = loginForm.getAddress();
		// ⑤ここで 年齢を受け取る
//		Int 年齢 = loginForm.get年齢();
		String age = loginForm.getAge();

		String sql = Sql.GET_TOROKU_NAME_SQL;
		sql = sql.replaceFirst("name", name);
		sql = sql.replace("nickname", nickname);
		sql = sql.replace("mail", mail);
		sql = sql.replace("address", address);
		sql = sql.replace("age", age);
		Map<String, String> containerMap = new HashMap<String, String>();
		try {
			Query query = new Query();
			ResultSet result = query.getSelectResult(sql);


			if(result.next()) {
				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);

				containerMap.put(Key.name, result.getString("name"));
				containerMap.put(Key.nickname, result.getString("nickname"));
				containerMap.put(Key.mail, result.getString("mail"));
				containerMap.put(Key.address, result.getString("address"));
				containerMap.put(Key.age, result.getString("age"));
			} else {
				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
			}
		} catch (SQLException e) {
			throw new SQLException(e);
		}
		return containerMap;
	}
}



















//package api;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//
//import actionform.Const;
//import actionform.Key;
//import actionform.form.LoginForm;
//import database.Query;
//import database.Sql;
//
//
//public class CheckLogin {
//
//	// コンストラクタ
//	public CheckLogin () {
//
//	}
//
//	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {
//
//		// ① loginIdを受け取る
//		String loginId = loginForm.getLoginId();
//		// ② loginPasswordを受け取る
//		String loginPassword = loginForm.getLoginPassword();
//		// ③ここで loginTestを受け取る
//		String comment = loginForm.getComment();
//		// ④ここで commentを受け取る
//		String mailaddress = loginForm.getmailaddress();
//		// ⑤ここで mailaddressを受け取る
//
//		String sql = Sql.GET_USER_INFO_NAME_SQL;
//		sql = sql.replaceFirst("userId", loginId);
//		sql = sql.replace("loginPassword", loginPassword);
//		Map<String, String> containerMap = new HashMap<String, String>();
//		try {
//			Query query = new Query();
//			ResultSet result = query.getSelectResult(sql);
//
//
//
//			if(result.next()) {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
//				containerMap.put(Key.NAME_SEI, result.getString("NAME_SEI"));
//				containerMap.put(Key.NAME_MEI, result.getString("NAME_MEI"));
//			} else {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
//			}
//		} catch (SQLException e) {
//			throw new SQLException(e);
//		}
//		return containerMap;
//	}
//}
//
//


















//package api;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//
//import actionform.Const;
//import actionform.Key;
//import actionform.form.LoginForm;
//import database.Query;
//import database.Sql;
//
//
//public class CheckLogin {
//
//	// コンストラクタ
//	public CheckLogin () {
//
//	}
//
//	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {
//
//		// ① loginIdを受け取る
//		String loginId = loginForm.getLoginId();
//		// ② loginPasswordを受け取る
//		String loginPassword = loginForm.getLoginPassword();
//		// ③ここで loginTestを受け取る
//		String comment = loginForm.getComment();
//		// ④ここで commentを受け取る
//		String mailaddress = loginForm.getmailaddress();
//		// ⑤ここで mailaddressを受け取る
//
//		String sql = Sql.GET_USER_INFO_NAME_SQL;
//		sql = sql.replaceFirst("userId", loginId);
//		sql = sql.replace("loginPassword", loginPassword);
//		sql = sql.replace("nameMei", mailaddress);
//		Map<String, String> containerMap = new HashMap<String, String>();
//		try {
//			Query query = new Query();
//			ResultSet result = query.getSelectResult(sql);
//
//
//			if(result.next()) {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
//
//				containerMap.put(Key.USER_ID, result.getString("USER_ID"));
//				containerMap.put(Key.PASSWORD, result.getString("PASSWORD"));
//				containerMap.put(Key.NAME_SEI, result.getString("NAME_SEI"));
//				containerMap.put(Key.NAME_MEI, result.getString("NAME_MEI"));
//			} else {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
//			}
//		} catch (SQLException e) {
//			throw new SQLException(e);
//		}
//		return containerMap;
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package api;
////
////import java.sql.ResultSet;
////import java.sql.SQLException;
////import java.util.HashMap;
////import java.util.Map;
////
////import actionform.Const;
////import actionform.Key;
////import actionform.form.LoginForm;
////import database.Query;
////import database.Sql;
////
////
////public class CheckLogin {
////
////	// コンストラクタ
////	public CheckLogin () {
////
////	}
////
////	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {
////
////		// ① loginIdを受け取る
////		String loginId = loginForm.getLoginId();
////		// ② loginPasswordを受け取る
////		String loginPassword = loginForm.getLoginPassword();
////		// ③ここで loginTestを受け取る
////		String comment = loginForm.getComment();
////		// ④ここで commentを受け取る
////		String mailaddress = loginForm.getmailaddress();
////		// ⑤ここで mailaddressを受け取る
////
////		String sql = Sql.GET_USER_INFO_NAME_SQL;
////		sql = sql.replaceFirst("userId", loginId);
////		sql = sql.replace("loginPassword", loginPassword);
////		Map<String, String> containerMap = new HashMap<String, String>();
////		try {
////			Query query = new Query();
////			ResultSet result = query.getSelectResult(sql);
////
////
////
////			if(result.next()) {
////				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
////				containerMap.put(Key.NAME_SEI, result.getString("NAME_SEI"));
////				containerMap.put(Key.NAME_MEI, result.getString("NAME_MEI"));
////			} else {
////				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
////			}
////		} catch (SQLException e) {
////			throw new SQLException(e);
////		}
////		return containerMap;
////	}
////}
////
////




//--------------------------------------------------------------------------------------1224
//package api;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//
//import actionform.Const;
//import actionform.Key;
//import actionform.form.LoginForm;
//import database.Query;
//import database.Sql;
//
//
//public class CheckLogin {
//
//	// コンストラクタ
//	public CheckLogin () {
//
//	}
//
//	public Map<String, String> checkLogin (LoginForm loginForm) throws SQLException {
//
//		String loginId = loginForm.getLoginId();
//		String loginPassword = loginForm.getLoginPassword();
//		String sql = Sql.GET_USER_INFO_NAME_SQL;
//		sql = sql.replaceFirst("userId", loginId);
//		sql = sql.replace("loginPassword", loginPassword);
//		Map<String, String> containerMap = new HashMap<String, String>();
//		try {
//			Query query = new Query();
//			ResultSet result = query.getSelectResult(sql);
//
//			if(result.next()) {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
//				containerMap.put(Key.NAME_SEI, result.getString("NAME_SEI"));
//				containerMap.put(Key.NAME_MEI, result.getString("NAME_MEI"));
//			} else {
//				containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
//			}
//		} catch (SQLException e) {
//			throw new SQLException(e);
//		}
//		return containerMap;
//	}
//}