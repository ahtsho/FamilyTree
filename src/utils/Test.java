package utils;

import java.sql.*;


public class Test {
	public static void main (String[] args) throws SQLException{
		Connection connection = DBConnectionAdapter.getConnection();
		Statement statement = connection.createStatement();
		statement.executeQuery("");
	}
}
