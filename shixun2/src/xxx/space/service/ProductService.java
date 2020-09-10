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
}
