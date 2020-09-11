package xxx.space.util;

import java.sql.*;

public class Jdbc {
	private static final String DRIVERCLASS="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/shixun1";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	private static final ThreadLocal<Connection>threadLocal=new ThreadLocal<Connection>();
	static {
		try {
			Class.forName(DRIVERCLASS).newInstance();
		} catch(Exception e) {
			//System.out.print("链接失败");
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		//System.out.println("链接成功");
		Connection conn=threadLocal.get();
		if(conn==null) {
			try {
				conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				threadLocal.set(conn);
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static boolean closeConnection() {
		boolean isClosed=true;
		Connection conn=threadLocal.get();
		if(conn!=null) {
			threadLocal.set(null);
			try {
				conn.close();
				threadLocal.set(conn);
			} catch(SQLException e) {
				isClosed=false;
				e.printStackTrace();
			}
		}
		return isClosed;
	}
}
