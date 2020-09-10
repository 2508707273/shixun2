package xxx.space.servlet;

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import xxx.space.dao.Managedao;
import xxx.space.entity.Manager;
import xxx.space.entity.Result;
import xxx.space.service.ManagerService;
import xxx.space.service.impl.ManagerServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private ManagerService managerService = new ManagerServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
//		System.out.println("进入dopost");
		String login_name=req.getParameter("login_name");
		String login_pass =req.getParameter("login_pass");
		Result result = managerService.login(login_name, login_pass);
		req.setAttribute("message", result.getMessage());
		if(result.getState()!=1){
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("Index.jsp").forward(req, resp);
		}
//		String url = null;
//		if(login_name==null||login_pass==null||login_name.isEmpty()||login_pass.isEmpty()){
//			System.out.println("输入为空值");
//			req.setAttribute("message", "请正确输入信息");
//			url = "login.jsp";
//		}else {
//			HttpSession session = req.getSession();
//			session.setAttribute("login_flag", 0);
////			System.out.println(login_name+login_pass);
//			Managedao md=new Managedao();
//			System.out.println("test1");
//			Manager manager = md.selsctManageByIname(login_name);
////			System.out.println(manager);
//			if (manager==null) {
//				System.out.println("用户未找到");
//				req.setAttribute("message", "用户名或密码错误");
//				url = "login.jsp";
//			}
//			else if(login_pass.equals(manager.getPwd())) {
//				System.out.println("登陆成功");
//				session.setAttribute("login_flag", 1);
//				url = "Index.jsp";
//			}
//			else {
//				System.out.println("密码错误");
//				req.setAttribute("message", "用户名或密码错误");
//				url = "login.jsp";
//			}
//		}
//		req.getRequestDispatcher(url).forward(req, resp);
		
	}

}
