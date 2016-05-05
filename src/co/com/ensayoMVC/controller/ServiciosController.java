package co.com.ensayoMVC.controller;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.ensayoMVC.model.SessionFirstPageDTO;
import co.com.ensayoMVC.services.EnsayoMVCFacade;

@Controller
public class ServiciosController {
	@RequestMapping(value="/servicios", method= RequestMethod.POST)
    public ModelAndView servicio ()
    {
		

		SessionFirstPageDTO imagen1 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen2 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen3 = new SessionFirstPageDTO();
		
		imagen1.setImagePath("/resources/imagenes/logo_banner.png");
		imagen1.setTittle("banner");
		
		imagen2.setImagePath("/resources/imagenes/border-bg.png");
		imagen2.setTittle("borde");
		
		imagen3.setImagePath("/resources/imagenes/servicios.png");
		imagen3.setTittle("SERVICIOS");
		
	
		String recortes = "RECORTE/ALINEADO";
		String recortes1="RECORTE DE CABALLERO";
		//Creo los textos 
		
		LinkedList<String> textos = new LinkedList<String>();
		LinkedList<String> textos1 = new LinkedList<String>();
		LinkedList<String> textos2 = new LinkedList<String>();
		textos.add("CABEZA / $45");
		textos.add("TOALLA CALIENTE, ACEITE PRE-SHAVE, ESPUMA CALIENTE, AFEITADO DE CABEZA, BÁLSAMOS AFTER-SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		textos.add("SANTY / $45");
		textos.add("EL SELLO DE LA CASA: DOBLE TRATAMIENTO DE TOALLA CALIENTE, ACEITE PRE-SHAVE Y ESPUMA CALIENTE, DOS PASADOS CON NAVAJA LIBRE PARA UNA AFEITADA MÁS CERRADA, BÁLSAMO AFTER SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		textos.add("CLASICO / $20");
		textos.add("TOALLA CALIENTE, ACEITE PRE-SHAVE, ESPUMA CALIENTE, AFEITADO DE BARBA, BÁLSAMO AFTER SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		
		textos1.add("BARBA / $15");
		textos1.add("RECORTE, ARREGLO Y ALINEADO DE BARBA CON NAVAJA LIBRE.");
		textos1.add("BIGOTE / $10");
		textos1.add("RECORTE, ARREGLO Y ALINEADO DE BIGOTE CON NAVAJA LIBRE.");
		
		textos2.add("CABALLERO / $10");
		textos2.add("JUNIOR / $6");
		String afectado = "AFEITADO";
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("imagen1", imagen1);
		model.addObject("imagen2",imagen2);
		model.addObject("imagen3",imagen3);
		
		model.addObject("textos",textos.listIterator());
		model.addObject("textos1",textos1.listIterator());
		model.addObject("afectado",afectado);
		return model;
    }
	
	
	@RequestMapping(value="/servicio",method = RequestMethod.GET)
	public ModelAndView barbero1() {
		EnsayoMVCFacade barberFacade = new EnsayoMVCFacade();		
		return new ModelAndView("servicios", "serviciosInfo", barberFacade.getServicioPageDTO());
		

		
	}

}
