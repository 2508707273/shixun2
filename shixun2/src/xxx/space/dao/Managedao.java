package xxx.space.dao;

import java.sql.SQLException;
import java.util.List;

import xxx.space.entity.Manager;

public interface Managedao {
    /**
     * 通过用户名写用户信息
     * @param name
     * @return
     * @throws SQLException 
     */
	Manager selsctManageByIname(String name) throws SQLException;
	/**
	 * 输出所有Manager
	 * @return List
	 * @throws SQLException 
	 */
	List<Manager> selectManager() throws SQLException;
}
