package xxx.space.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import xxx.space.entity.Category;
import xxx.space.service.CategoryService;
import xxx.space.service.impl.CategoryServiceImpl;

@WebServlet("/ShowCategory")
public class ShowCategoryServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("进入ShowCategoryGet");
		resp.getWriter().append("Served at: ").append(req.getContextPath());
        doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("into doPost");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		String idString = req.getParameter("id");
		if("null".equals(idString )|| "" == idString){
			System.out.println("未选择类目");
		}
		else {
			int id = Integer.parseInt(idString);
			List<Category> categories = new ArrayList<Category>();
			CategoryService categoryService = new CategoryServiceImpl();
			categories = categoryService.showPIDCategory(id);

//			System.out.println(categories);
			JSONArray jsonArray = JSONArray.fromObject(categories);
//			System.out.println(jsonArray);
			PrintWriter printWriter = resp.getWriter();
			printWriter.print(jsonArray);
			printWriter.flush();
			printWriter.close();
//			System.out.println("finish");
		}
		
	}

}
