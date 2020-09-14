package xxx.space.service.impl;

import java.sql.SQLException;
import java.util.List;

import xxx.space.dao.Managedao;
import xxx.space.dao.impl.ManagerDaoImpl;
import xxx.space.entity.Manager;
import xxx.space.entity.Result;
import xxx.space.service.ManagerService;
import xxx.space.util.MD5Util;

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
		System.out.println(MD5Util.MD5Encode(login_pass, "UTF-8"));
		if (manager == null) {
			System.out.println("用户未找到");
			result = new Result(2, "用户名或密码错误");
		} else if (MD5Util.MD5Encode(login_pass, "UTF-8").equals(manager.getPwd())) {
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

	@Override
	public Result register(Manager newManager) {
		Result result = null;
		Result result1 = null;
		Manager manager = newManager;
		String pass = newManager.getPwd();
		manager.setPwd(MD5Util.MD5Encode(pass, "UTF-8"));
		System.out.println(manager);
		try {
			result1 = md.insertManager(manager);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (manager== null || result1.getState()==2) {
			result = new Result(2,"用户注册失败");
		}else {
			result = new Result(result1.getState(), "注册成功");
		}
		return result;
	}

}
