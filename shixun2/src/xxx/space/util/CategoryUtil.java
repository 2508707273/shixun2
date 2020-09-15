package xxx.space.util;

import java.util.ArrayList;
import java.util.List;

import xxx.space.entity.Category;

public class CategoryUtil {
	
	/**
	 * 获取全部目录
	 * @param entityList
	 * @return
	 */
	public static List<Category> getCategoryList(List<Category> entityList) {
		List<Category> resultList = new ArrayList<>();
		// 获取顶层元素集合
		int parentCode;
		for (Category entity : entityList) {
			parentCode = entity.getP_id();
			// 顶层元素的parentCode==null或者为0
			if (parentCode == 0 || "null".equals(parentCode)) {
				resultList.add(entity);
			}
		}
	

		// 获取每个顶层元素的子数据集合
		for (Category entity : resultList) {
			entity.setChildrenList(getSubList(entity.getId(), entityList));
		}

		return resultList;
	}
	public static List<Category> getCategoryList(List<Category> entityList,int id) {
		List<Category> resultList = new ArrayList<>();
		// 获取顶层元素集合
		int parentCode;
		for (Category entity : entityList) {
			parentCode = entity.getP_id();
			// 顶层元素的parentCode==null或者为0
			if (parentCode == id) {
				resultList.add(entity);
			}
		}
	

		// 获取每个顶层元素的子数据集合
		for (Category entity : resultList) {
			entity.setChildrenList(getSubList(entity.getId(), entityList));
		}

		return resultList;
	}
	/**
	 * 获取子数据集合（递归）
	 * @param id 
	 * @param entityList
	 * @return
	 */
	private static List<Category> getSubList(int id, List<Category> entityList) {
		List<Category> childList = new ArrayList<>();
		int parentId;

		// 子集的直接子对象
		for (Category entity : entityList) {
			parentId = entity.getP_id();
			if (id==parentId) {
				childList.add(entity);
			}
		}

		// 子集的间接子对象
		for (Category entity : childList) {
			entity.setChildrenList(getSubList(entity.getId(), entityList));
		}

		// 递归退出条件
		if (childList.size() == 0) {
			return null;
		}

		return childList;
	}
}
