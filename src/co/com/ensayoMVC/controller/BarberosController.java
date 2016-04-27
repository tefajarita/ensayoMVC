package co.com.ensayoMVC.controller;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.SessionFirstPageDTO;
import co.com.ensayoMVC.services.EnsayoMVCFacade;

@Controller 
public class BarberosController {

	@RequestMapping(value="/barberos",method=RequestMethod.GET)
	public ModelAndView barbero(){
		SessionFirstPageDTO imagen1 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen2 = new SessionFirstPageDTO();
		
		imagen1.setImagePath("/resources/imagenes/logo_banner.png");
		imagen1.setTittle("banner");
		
		imagen2.setImagePath("/resources/imagenes/border-bg.png");
		imagen2.setTittle("borde");
		
	
		//barberos 
		BarberoDTO barbero1 = new BarberoDTO();
		BarberoDTO barbero2 = new BarberoDTO();
		BarberoDTO barbero3 = new BarberoDTO();
		
		barbero1.setNombre("Emanuel Morales	");
		barbero2.setNombre("Eduardo Romero");
		barbero1.setNombre("Ruben Mancilla");
		
		barbero1.setDescripcion("	Inicio en este negocio hace 20 años. Su especialidad estÃ¡ enfocada en todo tipo de cortes, desde militar, hasta mediano y largo. El âmaestro de las tijerasâ le llaman sus compaÃ±eros. Los arreglos de barba y bigote y afeitados son parte de su especialidad. Ha colaborado en distintas ferias internacionales de âBarber Shopsâ, atendiendo a clientes de varias partes del mundo. Un profesional de grandes ligas");
		barbero2.setDescripcion("	Barbero profesional con 5 años de experiencia. Aprendió el arte del oficio en una barbería de la Ciudad de Bello. Pionero en la fusion de la barbería y los festivales de Altavoz en la capital Medellín, genero del cual es gran aficionado.Experto en afeitados, arreglos y alineados de barba, pompadours, quiffs, desvanecidos y cortes tradicionales. Fundador de la pomada Gallo Negro. FanÃ¡tico de las los tatuajes, la grasa y las pomadas.");
		barbero3.setDescripcion("Barbero de profesión, originario del estado de Puebla. ComenzÃ³ en el arte de la barberÃ­a en el año de 2007, trabajando 6 años en peluquerÃ­as de Bello y dos años en barberías de la Ciudad de Bello. Especialista en cortes a tijera y mÃ¡quina -desde cortes clÃ¡sicos hasta estilos contemporÃ¡neos-, cuidado/mantenimiento en barbas largas y cortas, y afeitados de primera clase. Para Ã©l, âLo bueno no basta, solo la excelencia es suficienteâ. Orgulloso de sus ocho años de carrera, ha trabajado con peluqueros y barberos profesionales de los que ha aprendido mucho. El resultado de la práctica y la experiencia se ven reflejados en la calidad de su trabajo.");
		
		barbero1.setFotoperfil("resources/imagenes/Emmanuel-Morales.png");
		barbero2.setFotoperfil("resources/imagenes/Eduardo-Romero1.png");
		barbero3.setFotoperfil("resources/imagenes/Ruben-Mancilla.png");
		String[]  nuestros ={ "Nuestros Barberos",
				"UN MAL CORTE DE PELO PUEDE CONVERTIR A UN HOMBRE EN UN MONSTRUO UN BUEN BARBERO HARÁ QUE SE VEA COMO UN CABALLERO."};
		
		LinkedList<BarberoDTO> barberosLista = new LinkedList<BarberoDTO>();
		
		barberosLista.add(barbero1);
		barberosLista.add(barbero2);
		barberosLista.add(barbero3);
		//Creo los textos 
		

		
		
		ModelAndView model = new ModelAndView("barberos");
		model.addObject("imagen1", imagen1);
		model.addObject("imagen2",imagen2);
		model.addObject("nuestros",nuestros);
		model.addObject("barberosLista",barberosLista.listIterator());
	
		return model;
	}
	
	@RequestMapping(value="/barbero",method = RequestMethod.GET)
	public ModelAndView barbero1() {
		EnsayoMVCFacade barberFacade = new EnsayoMVCFacade();		
		return new ModelAndView("barberos1", "barberInfo", barberFacade.getBarberoPageDTO());
		

		
	}
}
