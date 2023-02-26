package com.demo.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DbUtil {

	// uri子类 统一资源定位�?
	private static String url = "jdbc:mysql://127.0.0.1:3306/stus?characterEncoding=UTF-8";
	private static String user = "root";// account
	private static String password = "";
	static {
		// 01加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//获取链接
	public static Connection getConnection()throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	//关闭资源
	public static void release(Connection conn,Statement statement,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs=null;
			}
		}
		if(statement!=null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				statement=null;
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn=null;
			}
		}
	}
	

}
