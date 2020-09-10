package xxx.space.test;

import java.util.List;

import org.junit.Test;

import xxx.space.dao.Managedao;
import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ManagerDaoImpl;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.Manager;
import xxx.space.entity.Product;

public class DaoTest {
	@Test
	public void Test(){
		Managedao md=new ManagerDaoImpl();
		Manager manager = md.selsctManageByIname("xxx");
		System.out.println(manager);
		
	}
	@Test
	public void Test1(){
		System.out.println("helloworld");
	}

	@Test
	public void Test2(){
		Managedao pt = new ManagerDaoImpl();
		List<Manager> products = pt.selectManager();
		System.out.println(products.size());
		for (Manager product : products) {
			System.out.println(product);
		}
	}
}
