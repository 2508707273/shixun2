package xxx.space.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xxx.space.dao.Categorydao;
import xxx.space.entity.Category;
import xxx.space.entity.Manager;
import xxx.space.util.DbUtil;

public class CategoryDaoImpl implements Categorydao {
	ResultSet rs = null;
	DbUtil dbUtil = new DbUtil();
	Category category = null;
	PreparedStatement pst = null;

	@Override
	public List<Category> SelectCategory() throws SQLException {
		String sql = "SELECT * FROM category";
		List<Category> categorys = new ArrayList<Category>();

		Connection conn1 = dbUtil.getConnection();
		pst = conn1.prepareStatement(sql);
		rs = pst.executeQuery();

		while (rs.next()) {
			category = new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setAlias(rs.getString(3));
			category.setP_id(rs.getInt(4));
			category.setOrder_weight(rs.getInt(5));
			categorys.add(category);
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return categorys;
	}

	@Override
	public Category selectCategoryByID(int id) throws SQLException {
		String sql = "SELECT * FROM category where id= ?";

		Connection conn1 = dbUtil.getConnection();

		pst = conn1.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		if (rs.next()) {
			category = new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setAlias(rs.getString(3));
			category.setP_id(rs.getInt(4));
			category.setOrder_weight(rs.getInt(5));
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return category;
	}

	@Override
	public List<Category> selectCategoryByPID(int id) throws SQLException {
		String sql = "SELECT * FROM category where p_id = ?";
		Connection conn1 = dbUtil.getConnection();

		List<Category> categorys = new ArrayList<Category>();
		pst = conn1.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();

		while (rs.next()) {
			category = new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setAlias(rs.getString(3));
			category.setP_id(rs.getInt(4));
			category.setOrder_weight(rs.getInt(5));
			categorys.add(category);
		}
		// System.out.println(categorys);
		dbUtil.closeConnection(conn1, pst, rs);
		return categorys;
	}

	@Override
	public String selectCNameByID(int id) throws SQLException {
		String sql = "SELECT name FROM category where id = ?";
		Connection conn1 = dbUtil.getConnection();

		pst = conn1.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		String CName = null;
		if (rs.next()) {
			CName = rs.getString(1);
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return CName;
	}

}
