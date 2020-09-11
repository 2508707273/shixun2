package xxx.space.service.impl;

import java.sql.SQLException;
import java.util.List;

import xxx.space.dao.Managedao;
import xxx.space.dao.impl.ManagerDaoImpl;
import xxx.space.entity.Manager;
import xxx.space.entity.Result;
import xxx.space.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {

	private Managedao md = new ManagerDaoImpl();

	@Override
	public Result login(String login_name, String login_pass) {
		// TODO Auto-generated method stub
		Result result = null;
		Manager manager = null;
		try {
			manager = md.selsctManageByIname(login_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (manager == null) {
			System.out.println("用户未找到");
			result = new Result(2, "用户名或密码错误");
		} else if (login_pass.equals(manager.getPwd())) {
			System.out.println("登陆成功");
			result = new Result(1, "登录成功");
		} else {
			System.out.println("密码错误");
			result = new Result(3, "用户名或密码错误");
		}
		return result;
	}

	@Override
	public List<Manager> ShowManager() {
		List<Manager> managers = null ;
		try {
			managers = md.selectManager();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return managers;
	}

}
