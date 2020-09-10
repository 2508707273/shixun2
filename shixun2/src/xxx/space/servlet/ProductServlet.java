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
import xxx.space.entity.PageBean;
import xxx.space.entity.Product;
import xxx.space.service.ProductService;
import xxx.space.service.impl.ProductServiceImpl;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{
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
		ProductService pService =new ProductServiceImpl();
		List<Product> products = pService.showProducts();
		req.setAttribute("products", products);
		req.getRequestDispatcher("tables_product.jsp").forward(req, resp);
		
		
		/*
		 * 按页展示
		 */
//		int currentPage =Integer.parseInt(req.getParameter("currentPage"));
//		int pageSize = Integer.parseInt(req.getParameter("pageSize"));
//		
//		PageBean<Product> pageBean1 = pService.showPageByPage(currentPage, pageSize);
//		req.setAttribute("pageBean1", pageBean1);
//		req.getRequestDispatcher("tables_product.jsp").forward(req, resp);
	}
}
