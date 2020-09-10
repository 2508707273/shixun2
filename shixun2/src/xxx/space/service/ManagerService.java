package xxx.space.service;

import java.util.List;

import xxx.space.entity.Manager;
import xxx.space.entity.Result;

public interface ManagerService {
	/**
	 * 验证登录并返回提示信息
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public Result login(String userName,String passWord);
	/**
	 * 展示所有Manager但不展示密码
	 * @return
	 */
	public List<Manager> ShowManager();
}
