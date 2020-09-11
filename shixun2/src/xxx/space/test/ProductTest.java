package xxx.space.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.Product;

public class ProductTest {
	Productdao pt = new ProductDaoImpl();
	@Test
	public void Test(){
		List<Product> products = null;
		try {
			products = pt.SelectProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products.size());
		for (Product product : products) {
			System.out.println(product);
		}
	}
	@Test
	public void Test1(){
		List<Product> products = null;
		try {
			products = pt.selectProductByPage(1, 5);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products.size());
		for (Product product : products) {
			System.out.println(product);
		}
	}
	@Test
	public void Test3(){
		try {
			System.out.println(pt.findProductCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("测试git");
	}
	@Test
	public void Test4(){
		try {
			pt.deleteProduct(1000008);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
