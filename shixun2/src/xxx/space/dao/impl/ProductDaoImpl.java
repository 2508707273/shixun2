package xxx.space.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import xxx.space.dao.Productdao;
import xxx.space.entity.Manager;
import xxx.space.entity.Product;
import xxx.space.util.DbUtil;
import xxx.space.util.Jdbc;

public class ProductDaoImpl implements Productdao {
	Product product = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	DbUtil dbUtil = new DbUtil();

	@Override
	public List<Product> SelectProduct() throws SQLException {

		// Jdbc jdbc = new Jdbc();
		// Connection conn1 = jdbc.getConnection();

		Connection conn1 = dbUtil.getConnection();

		String sql = "SELECT * FROM `product`";
		List<Product> products = new ArrayList<Product>();
		pst = conn1.prepareStatement(sql);
		rs = pst.executeQuery();
		while (rs.next()) {
			product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setCate_id(rs.getInt(3));
			product.setThumbnail(rs.getString(4));
			product.setInventory(rs.getInt(5));
			product.setSales_volume(rs.getInt(6));
			product.setPrice(rs.getDouble(7));
			product.setSale_price(rs.getDouble(8));
			product.setDetail_description(rs.getString(9));
			product.setSelling_description(rs.getString(10));
			product.setCreate_time(rs.getDate(11));
			product.setSale_time(rs.getDate(12));
			products.add(product);
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return products;
	}

	@Override
	public List<Product> selectProductByPage(int currentPage, int pageSize) throws SQLException {
		// Jdbc jdbc = new Jdbc();
		// Connection conn1 = jdbc.getConnection();

		Connection conn1 = dbUtil.getConnection();

		String sql = "SELECT * FROM product limit ?,?";
		List<Product> products = new ArrayList<Product>();
		pst = conn1.prepareStatement(sql);
		pst.setInt(1, (currentPage - 1) * pageSize);
		pst.setInt(2, pageSize);

		rs = pst.executeQuery();
		while (rs.next()) {
			product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setCate_id(rs.getInt(3));
			product.setThumbnail(rs.getString(4));
			product.setInventory(rs.getInt(5));
			product.setSales_volume(rs.getInt(6));
			product.setPrice(rs.getDouble(7));
			product.setSale_price(rs.getDouble(8));
			product.setDetail_description(rs.getString(9));
			product.setSelling_description(rs.getString(10));
			product.setCreate_time(rs.getDate(11));
			product.setSale_time(rs.getDate(12));
			products.add(product);
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return products;
	}

	@Override
	public int findProductCount() throws SQLException {
		String sql = "SELECT count(*) from product";
		int n = 0;

		// Jdbc jdbc = new Jdbc();
		// Connection conn1 = jdbc.getConnection();

		Connection conn1 = dbUtil.getConnection();

		pst = conn1.prepareStatement(sql);
		rs = pst.executeQuery();
		if (rs.next()) {
			n = rs.getInt(1);
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return n;
	}

	@Override
	public void deleteProduct(int id) throws SQLException {
		Connection conn1 = dbUtil.getConnection();
		String sql = "delete FROM product where id= ?";

		pst = conn1.prepareStatement(sql);
		pst.setInt(1, id);

		pst.executeUpdate();
		dbUtil.closeConnection(conn1, pst, null);
		// TODO Auto-generated method stub

	}

	@Override
	public Product selectProductByID(int id) throws SQLException {
		Connection conn1= dbUtil.getConnection();
		String sql = "SELECT * FROM `product` where id= ?";
		
		pst = conn1.prepareStatement(sql);
		pst.setInt(1, id);
		rs = pst.executeQuery();
		
		if (rs.next()) {
			product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setCate_id(rs.getInt(3));
			product.setThumbnail(rs.getString(4));
			product.setInventory(rs.getInt(5));
			product.setSales_volume(rs.getInt(6));
			product.setPrice(rs.getDouble(7));
			product.setSale_price(rs.getDouble(8));
			product.setDetail_description(rs.getString(9));
			product.setSelling_description(rs.getString(10));
			product.setCreate_time(rs.getDate(11));
			product.setSale_time(rs.getDate(12));
		}
		dbUtil.closeConnection(conn1, pst, rs);
		return product;
	}

	@Override
	public int UpdateProductByID(Product product) throws SQLException {
		Connection conn1= dbUtil.getConnection();
		String sql = "update product set name=?,Cate_id=?,thumbnail=?,inventory=?,sales_volume=?,"
				+ "price=?,sale_price=?,detail_description=?,selling_description=?,create_time=?,sale_time=? where id=?";
		pst = conn1.prepareStatement(sql);
		pst.setString(1, product.getName());
		pst.setInt(2, product.getCate_id());
		pst.setString(3, product.getThumbnail());
		pst.setInt(4, product.getInventory());
		pst.setInt(5, product.getSales_volume());
		pst.setDouble(6, product.getPrice());
		pst.setDouble(7, product.getSale_price());
		pst.setString(8, product.getDetail_description());
		pst.setString(9, product.getSelling_description());
		pst.setDate(10, new java.sql.Date( product.getCreate_time().getTime()));
		pst.setDate(11, new java.sql.Date(product.getSale_time().getTime()));
		pst.setInt(12, product.getId());
		
		int res=pst.executeUpdate();
		dbUtil.closeConnection(conn1, pst,null);
		return res;
	}

}
