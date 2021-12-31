package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {
	public boolean insert(String uid, String ume) 
			throws NamingException, SQLException{
		Connection conn = null; //DB연결
		PreparedStatement stmt = null; //SQL 구문
		
		conn = ConnectionPool.get();
		String sql = "INSERT INTO memo(id,memo) VALUES(?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, ume);
		
		//성공하면 숫자1 실패하면 숫자0
		int result = stmt.executeUpdate();
		
		return result==1;
				
	}
}
