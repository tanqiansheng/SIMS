package com.demo.text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.junit.Test;

import com.demo.db.DbUtil;

public class DemoTextlog {
	

	@Test
	public void login(String sno,String password) throws SQLException {
		Connection conn = DbUtil .getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from 用户表 where 学号=? and 密码 = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, sno);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, this, "登录成功", 0);
				//update(tFieldxh.getText());
			}else {
				JOptionPane.showMessageDialog(null, this, "登录失败", 0);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn,ps,rs);
		}
	}

	private void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				rs=null;
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				ps=null;
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				conn=null;
			}
		}
		
		// TODO Auto-generated method stub
		
	}

}
