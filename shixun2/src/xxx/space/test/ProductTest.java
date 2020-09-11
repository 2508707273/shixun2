package xxx.space.test;

import java.util.List;

import org.junit.Test;

import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.Product;

public class ProductTest {
	Productdao pt = new ProductDaoImpl();
	@Test
	public void Test(){
		List<Product> products = pt.SelectProduct();
		System.out.println(products.size());
		for (Product product : products) {
			System.out.println(product);
		}
	}
	@Test
	public void Test1(){
		List<Product> products =pt.selectProductByPage(1, 5);
		System.out.println(products.size());
		for (Product product : products) {
			System.out.println(product);
		}
	}
	@Test
	public void Test3(){
		System.out.println(pt.findProductCount());
		System.out.println("测试git");
	}
}
