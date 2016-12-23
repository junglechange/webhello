package jungle.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class PeopleController {
	
	@Autowired
	@Qualifier("peopledao")
	private PeopleDao peopleDao;
	
	@RequestMapping(value="people",method=RequestMethod.GET)
	public ModelAndView  getAllPeoples(){
		ModelAndView modelAndView=new ModelAndView();		
		List<PeopleModel> peopleModels= peopleDao.getAllPeoples();
		modelAndView.addObject("peoples", peopleModels);
		modelAndView.addObject("te", "te");
		System.out.println("peopledao");
		return modelAndView;
	}
	
	@RequestMapping(value="getpeople",method=RequestMethod.GET)
	public @ResponseBody Object getAllPeoplesJson(){
		return peopleDao.getAllPeoples();
	}
	
	@RequestMapping(value="getjson",method=RequestMethod.GET)
	public @ResponseBody String getjson(){
		try {
			System.out.println("22");
			Thread.sleep(5000);
			System.out.println("33");
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "[1,2,3]";
	}
	
	@RequestMapping(value="getjson1",method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getjson1(){
		Map<String, Object> reMap=new HashMap<String, Object>();
		reMap.put("data", "value");
		return reMap;
	}
	
	@RequestMapping(value="test",method=RequestMethod.GET)
	public @ResponseBody String gettest(){
		return "spring test";
	}
	
	@RequestMapping(value="testcontext",method=RequestMethod.GET)
	public String getContext(HttpServletRequest request,HttpServletResponse response){
		String test = "test";
		ServletContext curContext=request.getServletContext();
		String contextConfigLocation=(String) curContext.getAttribute("contextConfigLocation");
		String tests=(String) curContext.getAttribute("contextConfigLocation");
		if (curContext==TestServletContextListener.servletContext) {
			System.out.println("context equal");
		}
		return test;
	}
		
	

}
