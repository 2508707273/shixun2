package xxx.space.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xxx.space.dao.Categorydao;
import xxx.space.dao.impl.CategoryDaoImpl;
import xxx.space.entity.Category;
import xxx.space.service.CategoryService;
import xxx.space.util.CategoryUtil;

public class CategoryServiceImpl implements CategoryService {

	List<Category> categories1 = new ArrayList<Category>();
	List<Category> categories = new ArrayList<Category>();
	Categorydao categorydao = new CategoryDaoImpl();
	Category category = null;
	
	@Override
	public List<Category> showAllCategory() {
		try {
			categories1 =  categorydao.SelectCategory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		categories = CategoryUtil.getCategoryList(categories1);
		return categories;
	}

	@Override
	public String showCategoryByID(int id) {
		try {
			category = categorydao.selectCategoryByID(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return category.getName();
	}

	@Override
	public List<Category> showPIDCategory(int id) {
		try {
			categories1 = categorydao.selectCategoryByPID(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		categories = CategoryUtil.getCategoryList(categories1,id);
		return categories;
	}

	@Override
	public String ShowCNameByID(int id) {
		String CName=null;
		try {
			CName = categorydao.selectCNameByID(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return CName;
	}

}
