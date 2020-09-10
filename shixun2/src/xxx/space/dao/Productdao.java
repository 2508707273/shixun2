package xxx.space.dao;

import java.util.List;

import xxx.space.entity.Product;

public interface Productdao {
	/**
	 * 返回所有商品信息
	 * @return
	 */
	List<Product> SelectProduct();
	/**
	 * 按页查找
	 * @param currentPage 当前是第几页
	 * @param pageSize	每一页显示几个
	 * @return
	 */
	List<Product> selectProductByPage(int currentPage,int pageSize);
	/**
	 * 查询商品总数量
	 * @return
	 */
	int findProductCount();
}
