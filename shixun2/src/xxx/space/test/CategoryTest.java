package xxx.space.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import xxx.space.dao.Categorydao;
import xxx.space.dao.impl.CategoryDaoImpl;
import xxx.space.entity.Category;
import xxx.space.util.CategoryUtil;

public class CategoryTest {
	Categorydao categorydao = new CategoryDaoImpl();
	List<Category> categories= new ArrayList<Category>();
	List<Category> categories1  = new ArrayList<Category>();;
	Category category = null;
	
	@Test
	public void Test(){
		
		try {
			categories= categorydao.SelectCategory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Category category : categories) {
			System.out.println(category);
		}
	}
	
	@Test
	public void Test2(){
		try {
			category =  categorydao.selectCategoryByID(1001);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(category);
	}
	
	@Test
	public void Test3(){
		try {
			categories1 =  categorydao.SelectCategory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		categories = CategoryUtil.getCategoryList(categories1);
//		for (Category category : categories) {
//			System.out.println(category);
//		}
		System.out.println(categories);
		System.out.println(categories.size());
	}
	
	@Test
	public void Test4(){
		try {
			categories1 =  categorydao.selectCategoryByPID(200);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		categories = CategoryUtil.getCategoryList(categories1,200);
//		for (Category category : categories) {
//			System.out.println(category);
//		}
		System.out.println(categories);
		System.out.println(categories.size());
	}
}
