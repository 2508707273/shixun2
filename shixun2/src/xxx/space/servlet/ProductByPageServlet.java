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

@WebServlet("/product_page")
public class ProductByPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 按页展示
		 */
		ProductService pService =new ProductServiceImpl();
//		System.out.println("信息1");
		int currentPage =Integer.parseInt(req.getParameter("currentPage"));
		int pageSize = Integer.parseInt(req.getParameter("pageSize"));
//		System.out.println(currentPage);
//		System.out.println(pageSize);
		PageBean<Product> pageBean1 = pService.showPageByPage(currentPage, pageSize);
		req.setAttribute("pageBean1", pageBean1);
		req.getRequestDispatcher("tables_product2.jsp").forward(req, resp);
	}
}
