package xxx.space.test;

import java.sql.Connection;

import org.junit.Test;

import xxx.space.util.DbUtil;

public class DbUnitTest {
	@Test
	public void Test(){
		DbUtil dbUtil = new DbUtil();
		Connection connection = dbUtil.getConnection();
	}
}
