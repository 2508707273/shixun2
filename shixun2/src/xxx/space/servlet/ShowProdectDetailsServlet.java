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

@WebServlet("/prodect_detail")
public class ShowProdectDetailsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product product = null;
		int product_id =Integer.parseInt(req.getParameter("product_id"));
		ProductService  productService=new ProductServiceImpl();
		product = productService.showProductByID(product_id);
		req.setAttribute("product", product);
		req.getRequestDispatcher("product_detail.jsp").forward(req, resp);
	}
}
