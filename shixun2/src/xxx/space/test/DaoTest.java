package xxx.space.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import xxx.space.dao.Managedao;
import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ManagerDaoImpl;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.Manager;
import xxx.space.entity.Product;

public class DaoTest {
	Managedao md=new ManagerDaoImpl();
	Manager manager=null;
	@Test
	public void Test(){
		try {
			manager = md.selsctManageByIname("xxx");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(manager);
		
	}
	@Test
	public void Test1(){
		System.out.println("helloworld");
	}

	@Test
	public void Test2(){
		Managedao pt = new ManagerDaoImpl();
		List<Manager> products =null;
		try {
			products = pt.selectManager();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products.size());
		for (Manager product : products) {
			System.out.println(product);
		}
	}
	@Test
	public void TestREgister(){
		try {
			md.insertManager(manager);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
