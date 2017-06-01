package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Query {

	// コンストラクタ
	public Query () {

	}

	public ResultSet getSelectResult(String sql) throws SQLException {
		Statement stmt;
		try {
			stmt = getStatement();
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException(e);
		}
	}

	public int getInsertResult(String sql) throws SQLException {
		Statement stmt;
		try {
			stmt = getStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			throw new SQLException(e);
		}
	}


	private Statement getStatement() throws SQLException {
		try {
			InitialContext initCon = new InitialContext();
			DataSource ds = (DataSource)initCon.lookup("java:comp/env/MySQL_JDBC");
			Connection con = ds.getConnection();
			return  con.createStatement();
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}
}