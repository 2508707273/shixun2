package xxx.space.service;

import java.util.List;

import xxx.space.entity.PageBean;
import xxx.space.entity.Product;

public interface ProductService {
	/**
	 * 展示产品
	 * @return
	 */
	public List<Product> showProducts();
	/**
	 * 分页展示商品
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public PageBean<Product> showPageByPage(int currentPage,int pageSize);
	/**
	 * 删除产品
	 * @param id
	 */
	void deleteProduct(int id);
	/**
	 * 展示商品详情
	 * @param id
	 * @return product
	 */
	public Product showProductByID(int id);
	/**
	 * 修改产品
	 * @param id
	 * @return 影响的行数
	 */
	public int UpdateProductByID(Product product);
	/**
	 * 
	 * @param product
	 * @return 影响的行数
	 */
	public int InsertProduct(Product product);
}
