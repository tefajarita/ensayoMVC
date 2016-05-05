package co.com.ensayoMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.ensayoMVC.model.ContactoDTO;
import co.com.ensayoMVC.model.SessionFirstPageDTO;
import co.com.ensayoMVC.services.EnsayoMVCFacade;


@Controller
public class ContactoController {
	@RequestMapping(value="/contacto",method=RequestMethod.POST)
	public ModelAndView contacto (){
		SessionFirstPageDTO imagen1 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen2 = new SessionFirstPageDTO();
		 
		imagen1.setImagePath("resources/imagenes/logo_banner.png");
		imagen1.setTittle("banner");
		
		imagen2.setImagePath("resources/imagenes/border-bg.png");
		imagen2.setTittle("borde");
		
		ModelAndView model = new ModelAndView ("contacto");		
		model.addObject("imagen1",imagen1);
		model.addObject("imagen2",imagen2);
	
		
		return model;
	}
	
	
	@RequestMapping(value="/contactar", method= RequestMethod.POST)
	public String contacto (@ModelAttribute("SpringWeb") ContactoDTO cont, ModelMap model) {
		model.addAttribute("nombre", cont.getNombre());
		model.addAttribute("apellido", cont.getApellido());
		model.addAttribute("celular", cont.getCelular());
	
		return "sucessContact";
	}
	
	
	@RequestMapping(value="/volverContact",method=RequestMethod.POST)
	public ModelAndView volverContact (){ 	 	 	
		return new ModelAndView ("redirect:contacto");
	}
	
	
	@RequestMapping(value="/lugar",method = RequestMethod.GET)
	public ModelAndView barbero1() {
		EnsayoMVCFacade barberFacade = new EnsayoMVCFacade();		
		return new ModelAndView("contacto", "contactoInfo", barberFacade.getLugarPageDTO());
		

		
	}
}
