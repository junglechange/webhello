package jungle.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.WebApplicationContext;

public class TestServletContextListener implements ServletContextListener{
	
	@Autowired
	@Qualifier("peopledao")
	private PeopleDao peopleDao;

	public static ServletContext servletContext=null;
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext sContext= sce.getServletContext();
		servletContext=sContext;
		WebApplicationContext springString=(WebApplicationContext)sContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//PeopleDao peopleDao=(PeopleDao) springString.getBean("t1");
		//System.out.println(peopleDao.getAllPeoples());
		int t=1;
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
