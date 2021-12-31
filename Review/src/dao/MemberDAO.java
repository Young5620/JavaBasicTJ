package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemberDAO {
	public int login(String uid, String ups) 
			throws NamingException, SQLException{
		Connection conn = null; //DB연결
		PreparedStatement stmt = null; //SQL 구문
		ResultSet rs = null; //결과
		
		conn = ConnectionPool.get();
		String sql = "SELECT id, password FROM user WHERE id = ? ";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		
		rs = stmt.executeQuery();
		
		if(!rs.next()) return 1; //아이디가 존재하지 않는다.
		
		if(!ups.equals(rs.getString("password"))) { //DB에 있는 패스워드 꺼내오기
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public boolean exist(String uid) 
			throws NamingException, SQLException{
		Connection conn = null; //DB연결
		PreparedStatement stmt = null; //SQL 구문
		ResultSet rs = null; //결과
		
		conn = ConnectionPool.get();
		String sql = "SELECT id FROM user WHERE id = ? ";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		
		rs = stmt.executeQuery();
		
		return rs.next(); //rs가 있으면 true 없으면 false
		
	}
	
	public boolean insert(String una, String uem, String uid, String ups, String uge) 
			throws NamingException, SQLException{
		Connection conn = null; //DB연결
		PreparedStatement stmt = null; //SQL 구문
		
		conn = ConnectionPool.get();
		String sql = "INSERT INTO user(name,email,id,password,gender) VALUES(?,?,?,?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, una);
		stmt.setString(2, uem);
		stmt.setString(3, uid);
		stmt.setString(4, ups);
		stmt.setString(5, uge);
		
		//성공하면 숫자1 실패하면 숫자0
		int result = stmt.executeUpdate();
		
		return result==1;
				
	}
	
	public boolean delete(String uid) 
			throws NamingException, SQLException{
		Connection conn = null; //DB연결
		PreparedStatement stmt = null; //SQL 구문
		
		conn = ConnectionPool.get();
		String sql = "DELETE FROM user WHERE id = ?";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		
		int result = stmt.executeUpdate();
		
		return result==1; //rs가 있으면 true 없으면 false
		
	}
}
