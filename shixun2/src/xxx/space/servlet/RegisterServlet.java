package xxx.space.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import xxx.space.dao.Managedao;
import xxx.space.entity.Manager;
import xxx.space.entity.Result;
import xxx.space.service.ManagerService;
import xxx.space.service.impl.ManagerServiceImpl;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private ManagerService managerService = new ManagerServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Manager newManager = new Manager();
		newManager.setLname(req.getParameter("reg_name"));
		newManager.setEmail(req.getParameter("reg_Email"));
		newManager.setPwd(req.getParameter("reg_pass"));
		newManager.setReal_name(req.getParameter("reg_Realname"));
		newManager.setTel(req.getParameter("reg_tel"));
		Date now_date = new Date(System.currentTimeMillis());
		newManager.setCreate_time(now_date);
		Result result = managerService.register(newManager);
		System.out.println(result.getMessage());
		req.setAttribute("message", result.getMessage());
		if (result.getState() == 2) {
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}

}
