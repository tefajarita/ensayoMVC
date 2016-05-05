package co.com.ensayoMVC.services;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.LugarDAO;
import co.com.ensayoMVC.model.LugarDTO;

public class LugarServicesImp implements LugarServices {

	
	private ApplicationContext context;
	

	@Override
	public LugarDTO findById(int lugarId) {
		Boolean isJPA =true;
		if(isJPA){
		
			return this.findByIDJPA(lugarId);
		}else{
			
			return this.findByIDJDBC(lugarId);
		}
	}

	private LugarDTO findByIDJDBC (int lugarId){
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		LugarDAO sesionDAO = (LugarDAO) context.getBean("lugarDAO");
		LugarDTO lugarDTO= sesionDAO.findLugarById(lugarId);
		/*lugarDTO.setNombre(lugar.getNombre());
		lugarDTO.setTelefono(lugar.getTelefono());
		lugarDTO.setLon(lugar.getLon());
		lugarDTO.setHorario(lugar.getHorario());
		lugarDTO.setDireccion(lugar.getDireccion());
		lugarDTO.setDescripcion(lugar.getDescripcion());
		lugarDTO.setCorreo(lugar.getCorreo());
		lugarDTO.setAlt(lugar.getAlt());*/
		
		
		
		return lugarDTO;
	}
	
	
	//jpa
	private LugarDTO findByIDJPA (int lugarId){
		 // Se obtiene el contexto de la aplicacion
		   
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);

	    // Se realiza el insert
	    LugarDTO lugar = lugarDAO.findLugarById(lugarId);
	    return lugar;
	
		
	}

	@Override
	public List<LugarDTO> findByIdList() {
		try {
	    	 // Se obtiene el contexto de la aplicacion
		   
			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);

		    
			List<LugarDTO> lugar;
			return lugar = lugarDAO.listLugar();
		

			
		}catch(Exception e){
			System.out.println("Error a ejecutar consulta");
		} finally {
			((AbstractApplicationContext) context).close();
		}
		return null;
	}
}
