package xxx.space.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DbUtil {
	private static DataSource dataSource;//数据源
	
	static{
		InputStream resInputStream = DbUtil.class.getResourceAsStream("db.properties");
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
		return null;
	}
}
