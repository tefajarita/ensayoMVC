package co.com.ensayoMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




import co.com.ensayoMVC.services.EnsayoMVCFacade;



@Controller
public class HelloWordController {
	
	/*@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView inicio(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}*/
	
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ModelAndView index() {
		EnsayoMVCFacade barberFacade = new EnsayoMVCFacade();		
		return new ModelAndView("index", "informacion", barberFacade.getFirstPageDTO());
		

		
	}
	
	
	
	

	
	
}
