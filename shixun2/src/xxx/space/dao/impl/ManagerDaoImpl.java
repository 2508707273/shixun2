package xxx.space.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xxx.space.dao.Managedao;
import xxx.space.entity.Manager;
import xxx.space.util.Jdbc;

public class ManagerDaoImpl implements Managedao {
	PreparedStatement pst = null;
	Manager manager = null;
	ResultSet rs = null;

	public Manager selsctManageByIname(String name) {

		// Statement sm = null;
		// int id=-1;
		String sql = "SELECT * FROM `manager` where Iname= ?";
		Jdbc jdbc = new Jdbc();
		Connection conn1 = jdbc.getConnection();
		try {
			pst = conn1.prepareStatement(sql);
			// System.out.println("进入dao");
			pst.setString(1, name);
			// sm=conn1.createStatement();
			rs = pst.executeQuery();
			if (rs.next()) {
				// id = rs.getInt(1);
				manager = new Manager();
				manager.setId(rs.getInt(1));
				manager.setLname(rs.getString(2));
				manager.setPwd(rs.getString(3));
				manager.setReal_name(rs.getString(4));
				manager.setSalt(rs.getString(5));
				manager.setEmail(rs.getString(6));
				manager.setJoined_date(rs.getDate(7));
				manager.setStatus(rs.getInt(8));
				manager.setAvatar(rs.getString(9));
				manager.setTel(rs.getString(10));
				manager.setMemo(rs.getString(11));
				manager.setCreate_time(rs.getDate(12));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return manager;
	}

	@Override
	public List<Manager> selectManager() {
		String sql = "SELECT * FROM `manager`";
		Jdbc jdbc = new Jdbc();
		List<Manager> managers=new ArrayList<Manager>();
		Connection conn1 = jdbc.getConnection();
		try {
			pst = conn1.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				manager = new Manager();
				manager.setId(rs.getInt(1));
				manager.setLname(rs.getString(2));
				//不显示密码
				//manager.setPwd(rs.getString(3));
				manager.setReal_name(rs.getString(4));
				manager.setSalt(rs.getString(5));
				manager.setEmail(rs.getString(6));
				manager.setJoined_date(rs.getDate(7));
				manager.setStatus(rs.getInt(8));
				manager.setAvatar(rs.getString(9));
				manager.setTel(rs.getString(10));
				manager.setMemo(rs.getString(11));
				manager.setCreate_time(rs.getDate(12));
				managers.add(manager);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return managers;
	}
}
