package xxx.space.service.impl;

import java.sql.SQLException;
import java.util.List;

import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.PageBean;
import xxx.space.entity.Product;
import xxx.space.service.ProductService;

public class ProductServiceImpl implements ProductService {
	Productdao pt =new ProductDaoImpl();
	Product product = null;
	
	/**
	 * 页面展示产品信息
	 * @return
	 */
	public List<Product> showProducts(){
		List<Product> products=null;
		try {
			products = pt.SelectProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}


	@Override
	public PageBean<Product> showPageByPage(int currentPage, int pageSize) {
		PageBean<Product> pageBeans = new PageBean<Product>();
		int count=0;
		try {
			count = pt.findProductCount();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int totalPage = (int) Math.ceil(count*1.0/pageSize);
		List<Product> products = null;
		try {
			products = pt.selectProductByPage(currentPage, pageSize);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pageBeans.setCount(count);
		pageBeans.setCurrentPage(currentPage);
		pageBeans.setLists(products);
		pageBeans.setTotalPage(totalPage);
		pageBeans.setPageSize(pageSize);
		return pageBeans;
	}


	@Override
	public void deleteProduct(int id) {
		try {
			pt.deleteProduct(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Product showProductByID(int id) {
		try {
			product=pt.selectProductByID(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	
}
