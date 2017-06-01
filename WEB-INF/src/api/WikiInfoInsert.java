package api;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import actionform.Const;
import actionform.Key;
import actionform.form.WikiInfoInputForm;
import database.Query;
import database.Sql;


public class WikiInfoInsert {

	// コンストラクタ
	public WikiInfoInsert () {

	}

	public Map<String, String> wikiInfoInsert (WikiInfoInputForm wikiInfoInputForm) throws SQLException {

		String writer = wikiInfoInputForm.getWriter();
		String title = wikiInfoInputForm.getTitle();
		String language = wikiInfoInputForm.getLanguage();
		String tejyun1 = wikiInfoInputForm.getTejyun1();

		String sql = Sql.INSERT_USER_INFO_SQL;
		sql = sql.replace("writer", writer);
		sql = sql.replace("title", title);
		sql = sql.replace("language", language);
		sql = sql.replace("tejyun1", tejyun1);

		Map<String, String> containerMap = new HashMap<String, String>();
			try{
				Query query = new Query();
				int result = query.getInsertResult(sql);
				if (result == 1) {
					containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_OK);
				} else {
					containerMap.put(Key.SHORI_KEKKA, Const.SHORI_KEKKA_NG);
				}
			} catch (SQLException e) {
				throw new SQLException(e);
			}
			return containerMap;
	}
}