package co.com.ensayoMVC.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.BarberoDAO;
import co.com.ensayoMVC.jdbc.dao.BarberoDao;
import co.com.ensayoMVC.jdbc.entity.Barbero;
import co.com.ensayoMVC.model.BarberoDTO;

public class BarberoServicesImp implements BarberoServices {

	private ApplicationContext context;


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
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
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
	
	//Metodos con JPA
	public BarberoDTO FindBarberoById(String barberoCedula) {
		ClassPathXmlApplicationContext	context = null;	
		try {
			// Se obtiene el contexto de la aplicacion

			 context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			BarberoDTO barbero = barberoDAO.findBarberoById(barberoCedula);
			return barbero;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
		return null;
	}

	
	public List<BarberoDTO> listBarberosPorLugar(int lugar) {
		ClassPathXmlApplicationContext	context = null;		
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			List<BarberoDTO> barbero;
			barbero = barberoDAO.listBarberosPorLugar(lugar);
		return barbero;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
		return null;
	}
	

	public List<BarberoDTO> listBarbero(){
		ClassPathXmlApplicationContext context=null;
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			List<BarberoDTO> barbero;
			barbero = barberoDAO.listBarbero();
			return barbero;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
		return null;
		
	}
}
