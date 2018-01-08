package database;

public class Sql {

	public static final String GET_TOROKU_NAME_SQL
		= "SELECT name,nickname,mail,address,age FROM toroku WHERE name = 'name' AND age = 'age';";

	public static final String INSERT_TOROKU_SQL

	= "INSERT INTO kaiin.toroku (name,nickname,mail,address,age)  VALUES ('nameVal','nicknameVal','mailVal','addressVal', ageVal);";

}
