package xxx.space.service;

import java.util.List;

import xxx.space.entity.Category;

public interface CategoryService {
	/**
	 * 展示遍历后的列表
	 * @return 集合类型的递归列表
	 */
	public List<Category> showAllCategory(); 
	/**
	 * 返回所在目录名汉语
	 * @param id
	 * @return
	 */
	public String showCategoryByID(int id);
	/**
	 * 根据父级id查找所有列表
	 * @return
	 */
	public List<Category> showPIDCategory(int id);
}
