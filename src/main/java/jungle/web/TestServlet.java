package jungle.web;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;

public class TestServlet extends HttpServlet{
	
	public void init(){
		System.out.println("init servlet");
		ServletConfig config = getServletConfig(); 
		ServletContext servletContext=config.getServletContext();
		String tString=(String)servletContext.getAttribute("t");
		String conf = config.getInitParameter("contextConfigLocation"); 
		String myconfString=servletContext.getInitParameter("contextConfigLocation");
		Enumeration<String> myconf1=servletContext.getAttributeNames();
		while (myconf1.hasMoreElements()) {
			Object string = (Object) myconf1.nextElement();	
			System.out.println(string.toString());
		}
		System.out.println(conf);
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		ServletContext servletContext=getServletContext();
		System.out.println(servletContext.getInitParameter("contextConfigLocation"));
		WebApplicationContext webApplicationContext=(WebApplicationContext)servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		System.out.println(webApplicationContext);
		try {
			response.getWriter().write("hello");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void tests(){
		
	}

}
