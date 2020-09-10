package xxx.space.service.impl;

import java.util.List;

import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.PageBean;
import xxx.space.entity.Product;
import xxx.space.service.ProductService;

public class ProductServiceImpl implements ProductService {
	Productdao pt =new ProductDaoImpl();
	
	
	/**
	 * 页面展示产品信息
	 * @return
	 */
	public List<Product> showProducts(){
		List<Product> products = pt.SelectProduct();
		return products;
	}


	@Override
	public PageBean<Product> showPageByPage(int currentPage, int pageSize) {
		PageBean<Product> pageBeans = new PageBean<Product>();
		int count = pt.findProductCount();
		int totalPage = (int) Math.ceil(count*1.0/pageSize);
		List<Product> products =pt.selectProductByPage(currentPage, pageSize);
		pageBeans.setCount(count);
		pageBeans.setCurrentPage(currentPage);
		pageBeans.setLists(products);
		pageBeans.setTotalPage(totalPage);
		pageBeans.setPageSize(pageSize);
		return pageBeans;
	}
	
}
