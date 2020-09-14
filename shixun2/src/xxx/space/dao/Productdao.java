package xxx.space.dao;

import java.sql.SQLException;
import java.util.List;

import xxx.space.entity.Product;

public interface Productdao {
	/**
	 * 返回所有商品信息
	 * @return
	 * @throws SQLException 
	 */
	List<Product> SelectProduct() throws SQLException;
	/**
	 * 按页查找
	 * @param currentPage 当前是第几页
	 * @param pageSize	每一页显示几个
	 * @return
	 * @throws SQLException 
	 */
	List<Product> selectProductByPage(int currentPage,int pageSize) throws SQLException;
	/**
	 * 查询商品总数量
	 * @return
	 * @throws SQLException 
	 */
	int findProductCount() throws SQLException;
	/**
	 * 按照id删除某产品
	 * @param id
	 * @throws SQLException
	 */
	void deleteProduct(int id) throws SQLException;
	/**
	 * 按id查找对应产品信息
	 * @param id
	 * @return 产品全信息
	 * @throws SQLException
	 */
	Product selectProductByID(int id) throws SQLException;
}
