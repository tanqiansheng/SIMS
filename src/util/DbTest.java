package util;

import java.sql.Connection;
import java.sql.SQLException;

import com.demo.db.DbUtil;
import java.sql.PreparedStatement;

import org.junit.Test;

import domain.User;

public class DbTest {
	@Test
	public  void testInsert() throws SQLException{
		String uname="红红q";
		String account="a0h1";
		String passwd="abcdhe";
		User user =new User(null, uname, passwd, account);
		Connection conn=DbUtil.getConnection();
		String sql="insert into users(uname,account,passwd) values (?,?,?)";
		PreparedStatement ps =conn.prepareStatement(sql);
		ps.setString(1,user.getUname());
		ps.setString(2,user.getAccount());
		ps.setString(3,user.getPasswd());
		
		int success=ps.executeUpdate();
		if(success>0)
			System.out.print("增加成功");
		
		
	}

}
