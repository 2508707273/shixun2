package xxx.space.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DbUtil {
	private static DataSource dataSource;//数据源
	
	static{
		InputStream resInputStream = DbUtil.class.getClassLoader().getResourceAsStream("xxx/sapce/properties/db.properties");
		Properties properties =  new Properties();
		try {
			properties.load(resInputStream);
			dataSource = DruidDataSourceFactory.createDataSource(properties); //创建连接池
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection(){
		Connection connection=null;
		try {
			connection = dataSource.getConnection();
//			System.out.println("创建成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection conn,Statement stat,ResultSet rs) {
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(stat!=null)
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
