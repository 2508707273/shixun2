package xxx.space.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xxx.space.entity.Category;
import xxx.space.service.CategoryService;
import xxx.space.service.impl.CategoryServiceImpl;

@WebServlet("/Add_Prepare")
public class Add_Prepare extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Category> categories = new ArrayList<Category>();
		CategoryService categoryService = new CategoryServiceImpl();
		categories=categoryService.showAllCategory();
		req.setAttribute("categories", categories);
		req.getRequestDispatcher("Add_Product.jsp").forward(req, resp);
	}
	
}
