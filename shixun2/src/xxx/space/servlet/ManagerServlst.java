package xxx.space.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xxx.space.dao.Productdao;
import xxx.space.dao.impl.ProductDaoImpl;
import xxx.space.entity.Manager;
import xxx.space.entity.Product;
import xxx.space.service.ManagerService;
import xxx.space.service.ProductService;
import xxx.space.service.impl.ManagerServiceImpl;
import xxx.space.service.impl.ProductServiceImpl;

@WebServlet("/manager")
public class ManagerServlst extends HttpServlet{
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//super.doPost(req, resp);
//		req.getRequestDispatcher("tables_data.jsp").forward(req, resp);
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		ManagerService mService = new ManagerServiceImpl();
		List<Manager> managers = mService.ShowManager();
		req.setAttribute("managers", managers);
		req.getRequestDispatcher("tables_manager.jsp").forward(req, resp);
	}
}
