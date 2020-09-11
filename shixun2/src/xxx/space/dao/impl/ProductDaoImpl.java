package xxx.space.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import xxx.space.dao.Productdao;
import xxx.space.entity.Product;
import xxx.space.util.DbUtil;
import xxx.space.util.Jdbc;

public class ProductDaoImpl implements Productdao{
	Product product=null;
	PreparedStatement pst=null;
	ResultSet rs = null;
	@Override
	public List<Product> SelectProduct() throws SQLException {

//    	Jdbc jdbc = new Jdbc();
//        Connection conn1 = jdbc.getConnection();
        
        DbUtil dbUtil = new DbUtil();
		Connection conn1= dbUtil.getConnection();
        
		String sql="SELECT * FROM `product`";
        List<Product> products= new ArrayList<Product>();
			pst=conn1.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				product =new Product();
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
		return products;
	}

	@Override
	public List<Product> selectProductByPage(int currentPage, int pageSize) throws SQLException {
//    	Jdbc jdbc = new Jdbc();
//        Connection conn1 = jdbc.getConnection();
        
        DbUtil dbUtil = new DbUtil();
		Connection conn1= dbUtil.getConnection();
		
		String sql="SELECT * FROM product limit ?,?";
        List<Product> products= new ArrayList<Product>();
			pst=conn1.prepareStatement(sql);
        	pst.setInt(1, (currentPage-1)*pageSize);
        	pst.setInt(2, pageSize);

			rs=pst.executeQuery();
			while(rs.next()){
				product =new Product();
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
		return products;
	}

	@Override
	public int findProductCount() throws SQLException {
		String sql="SELECT count(*) from product";
    	int n=0;
    	
//    	Jdbc jdbc = new Jdbc();
//        Connection conn1 = jdbc.getConnection();
        
        DbUtil dbUtil = new DbUtil();
		Connection conn1= dbUtil.getConnection();
		
			pst=conn1.prepareStatement(sql);
			rs=pst.executeQuery();
			if(rs.next()){
				n=rs.getInt(1);
			}
        return n;
	}
	
}
