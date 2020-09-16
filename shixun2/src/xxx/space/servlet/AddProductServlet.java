package xxx.space.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xxx.space.entity.Product;
import xxx.space.service.ProductService;
import xxx.space.service.impl.ProductServiceImpl;

@WebServlet("/AddProduct")
public class AddProductServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("into AddProductServlet doPost");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String name = req.getParameter("name");
		int cate_id = Integer.parseInt(req.getParameter("Cate_id"));
		int inventory = Integer.parseInt(req.getParameter("inventory"));
		int sales_volume= Integer.parseInt(req.getParameter("sales_volume"));
		double price = Double.parseDouble(req.getParameter("price"));
		double sale_price = Double.parseDouble(req.getParameter("sale_price"));
		Date create_time=null;
		Date sale_time=null;
		try {
			create_time = sdf.parse(req.getParameter("create_time"));
			sale_time = sdf.parse(req.getParameter("sale_time")); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		String detail_description = req.getParameter("detail_description");
		String selling_description = req.getParameter("selling_description");
		
		Product product = new Product(0, name, cate_id, null,inventory, sales_volume, price, sale_price, detail_description, selling_description, create_time, sale_time);
		ProductService ps = new ProductServiceImpl();
		int rs = ps.InsertProduct(product);
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(rs);
		printWriter.flush();
		printWriter.close();
	}
	
}
