package co.com.ensayoMVC.services;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.jdbc.dao.BarberoDao;
import co.com.ensayoMVC.jdbc.dao.BarberoDao;
import co.com.ensayoMVC.jdbc.entity.Barbero;
import co.com.ensayoMVC.jdbc.entity.Barbero;
import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.BarberoDTO;

public class BarberoServicesImp implements BarberoServices {

	@Override
	public BarberoDTO findById(int barberoId) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		BarberoDao sesionDAO = (BarberoDao) context.getBean("barberoDAO");
		
		
		Barbero barbero = sesionDAO.findBarberoById(barberoId);
		BarberoDTO barberoDTO= new BarberoDTO();
		barberoDTO.setNombre(barbero.getNombre());
		barberoDTO.setDescripcion(barbero.getDescripcion());
		barberoDTO.setFotoperfil(barbero.getFotoperfil());
		
		return barberoDTO;
	}

	@Override
	public ArrayList<BarberoDTO> findByIdList() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		BarberoDao sesionDAO = (BarberoDao) context.getBean("barberoDAO");
	    ArrayList<Barbero> Barberoes = 	new ArrayList<Barbero>();
	        
			Barberoes = sesionDAO.findBarberoByIdList();
			ArrayList<BarberoDTO> BarberoDTOList= new ArrayList<BarberoDTO>();
		
			
			for (Barbero Barbero:Barberoes){
			//Los obj son por referencias	
				BarberoDTO BarberoDTO= new BarberoDTO();
			BarberoDTO.setNombre(Barbero.getNombre());
			BarberoDTO.setDescripcion(Barbero.getDescripcion());
			BarberoDTO.setFotoperfil(Barbero.getFotoperfil());
			
			
			BarberoDTOList.add(BarberoDTO);
			
			}
			return BarberoDTOList;
		}
	

}
