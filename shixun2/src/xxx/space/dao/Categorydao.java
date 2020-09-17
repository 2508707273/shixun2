package xxx.space.dao;

import java.sql.SQLException;
import java.util.List;

import xxx.space.entity.Category;

public interface Categorydao {
	/**
	 * 返回所有分类信息
	 * @return List<Category> 
	 * @throws SQLException
	 */
	List<Category> SelectCategory() throws SQLException;
	/**
	 * 通过id查找的分类对象
	 * @param id
	 * @return Category
	 * @throws SQLException
	 */
	Category  selectCategoryByID(int id) throws SQLException;
	/**
	 * 根据父id返回所有信息
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	List<Category> selectCategoryByPID(int id) throws SQLException;
	/**
	 * 根据类别id返回类的名称
	 * @param id
	 * @return 类别名称
	 * @throws SQLException
	 */
	String selectCNameByID(int id) throws SQLException;
}
