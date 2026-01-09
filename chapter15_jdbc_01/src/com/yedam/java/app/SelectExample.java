package com.yedam.java.app;

import java.sql.*;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. DB 접속
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		
		// 3-2. SQL 전달 및 실행
		String sql = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(sql);
		
		// 3-3. 반환결과 처리
		while(rs.next()) {
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			System.out.printf("이름 : %s, %s\n", lastName, firstName);
		}
		
		// 4. 자원해제
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}

}
