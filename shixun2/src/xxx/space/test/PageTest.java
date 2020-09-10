package xxx.space.test;

import org.junit.Test;

import xxx.space.entity.PageBean;
import xxx.space.entity.Product;
import xxx.space.service.ProductService;
import xxx.space.service.impl.ProductServiceImpl;

public class PageTest {
	@Test
	public void Test(){
		ProductService pService =new ProductServiceImpl();
		PageBean<Product> pageBean1 = pService.showPageByPage(1, 5);
		System.out.println(pageBean1);
	}
}
