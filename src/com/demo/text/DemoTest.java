package com.demo.text;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.demo.db.DbUtil;

public class DemoTest {

	@Test  //ºìÏßÏÂctrl+1
	public void testConn() throws SQLException{
		 Connection conn=DbUtil.getConnection();
		 System.out.println(conn);
	}
	
}
