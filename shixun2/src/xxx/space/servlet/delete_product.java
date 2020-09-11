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

@WebServlet("/delete_product")
public class delete_product extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int product_id =Integer.parseInt(req.getParameter("product_id"));
		int currentPage = Integer.parseInt(req.getParameter("currentPage"));
		System.out.println(product_id);
		ProductService  productService=new ProductServiceImpl();
		productService.deleteProduct(product_id);
		resp.sendRedirect("product_page?currentPage="+currentPage+"&pageSize=5");	
	}
}
