package xxx.space.dao;

import java.util.List;

import xxx.space.entity.Manager;

public interface Managedao {
    /**
     * 通过用户名写用户信息
     * @param name
     * @return
     */
	Manager selsctManageByIname(String name);
	/**
	 * 输出所有Manager
	 * @return List
	 */
	List<Manager> selectManager();
}
