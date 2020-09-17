package xxx.space.servlet;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

  

import javax.servlet.ServletException;

import javax.servlet.annotation.MultipartConfig;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Part;

  

/**

 * Servlet implementation class UpdataFile

 */

@MultipartConfig(location="C:/Java/apache-tomcat-9.0.24/webapps/shixun2/update")
@WebServlet("/UpdataFile")
public class UpdataFile extends HttpServlet {

    private static final long serialVersionUID = 1L;
 
    private File file;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
            System.out.println("1111111111");
    }
    
      /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //得到part对象，这个对象有write的方法，直接写到指定位置。但是千万别忘了写@MultipartConfig(location="E:/")注解，不指定位置默认是写到注解指定的位置。
        Part part = request.getPart("file");
        //普通的字段可以采用常规的getparamter的方法得到。
        System.out.println(new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8"));
        System.out.println(part.getName());
        System.out.println(part.getHeader("Content-Disposition"));
        System.out.println(part.getSize());
        String fileName = getFileNameFromPart(part); 
        part.write(fileName);
        PrintWriter printWriter = response.getWriter();
		printWriter.print(fileName);
		printWriter.flush();
		printWriter.close();

    }
    
     //截取文件名 
    public String getFileNameFromPart(Part part) { 
        String header = part.getHeader("Content-Disposition"); 
        String fileName = header.substring(header.indexOf("filename=\"")+10, header.lastIndexOf("\"")); 
        return fileName; 
    }

}
