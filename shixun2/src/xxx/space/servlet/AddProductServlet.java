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
public class AddProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("into AddProductServlet doPost");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int cate_id = 0;
		int inventory = 0;
		int sales_volume = 0;
		double price = 0.0;
		double sale_price = 0.0;
		String thumbnail = "图片.jpg";
		Date create_time = new Date(System.currentTimeMillis());;
		Date sale_time = new Date(System.currentTimeMillis());;
		String name = req.getParameter("name");
		if(req.getParameter("Cate_id") == null||("".equals(req.getParameter("Cate_id")))){
			
		}else {
			cate_id = Integer.parseInt(req.getParameter("Cate_id"));
		}
		
		thumbnail = req.getParameter("thumbnail");
		if(req.getParameter("inventory") == null||("".equals(req.getParameter("inventory")))){
			
		}else {
			inventory = Integer.parseInt(req.getParameter("inventory"));
		}
		if(req.getParameter("sales_volume") == null||("".equals(req.getParameter("sales_volume")))){
			
		}else {
			sales_volume = Integer.parseInt(req.getParameter("sales_volume"));
		}
		if(req.getParameter("price")== null||("".equals(req.getParameter("price")))){
			
		}else {
			price = Double.parseDouble(req.getParameter("price"));
		}
		if(req.getParameter("sale_price")== null||("".equals(req.getParameter("sale_price")))){
			
		}else {
			sale_price = Double.parseDouble(req.getParameter("sale_price"));
		}
		String detail_description = null;
		String selling_description = null;
		try {
			if(req.getParameter("create_time")== null||("".equals(req.getParameter("create_time")))){
				
			}else {
				create_time = sdf.parse(req.getParameter("create_time"));
			}
			if(req.getParameter("sale_time")== null||("".equals(req.getParameter("sale_time")))){
				
			}else {
				sale_time = sdf.parse(req.getParameter("sale_time"));
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		detail_description = req.getParameter("detail_description");
		selling_description = req.getParameter("selling_description");

		Product product = new Product(0, name, cate_id, thumbnail, inventory, sales_volume, price, sale_price,
				detail_description, selling_description, create_time, sale_time);
		ProductService ps = new ProductServiceImpl();
		int rs = ps.InsertProduct(product);
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(rs);
		printWriter.flush();
		printWriter.close();
	}

}
