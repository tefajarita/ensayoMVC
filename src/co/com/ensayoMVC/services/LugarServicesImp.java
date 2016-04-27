package co.com.ensayoMVC.services;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.jdbc.dao.LugarDAO;
import co.com.ensayoMVC.jdbc.entity.Lugar;
import co.com.ensayoMVC.model.LugarDTO;

public class LugarServicesImp implements LugarServices {

	
	private ApplicationContext context;
	

	@Override
	public LugarDTO findById(int lugarId) {
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		LugarDAO sesionDAO = (LugarDAO) context.getBean("lugarDAO");
    	
        
		Lugar lugar = sesionDAO.findLugarById(lugarId);
		LugarDTO lugarDTO= new LugarDTO();
		lugarDTO.setNombre(lugar.getNombre());
		lugarDTO.setTelefono(lugar.getTelefono());
		lugarDTO.setLon(lugar.getLon());
		lugarDTO.setHorario(lugar.getHorario());
		lugarDTO.setDireccion(lugar.getDireccion());
		lugarDTO.setDescripcion(lugar.getDescripcion());
		lugarDTO.setCorreo(lugar.getCorreo());
		lugarDTO.setAlt(lugar.getAlt());
		
		
		
		return lugarDTO;
	}

	

	@Override
	public ArrayList<LugarDTO> findByIdList() {
	context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	LugarDAO sesionDAO = (LugarDAO) context.getBean("lugarDAO");
    ArrayList<Lugar> lugares = 	new ArrayList<Lugar>();
        
		lugares = sesionDAO.findLugarByIdList();
		ArrayList<LugarDTO> lugarDTOList= new ArrayList<LugarDTO>();
		LugarDTO lugarDTO= new LugarDTO();
		
		for (Lugar lugar:lugares){
		
		lugarDTO.setNombre(lugar.getNombre());
		lugarDTO.setTelefono(lugar.getTelefono());
		lugarDTO.setLon(lugar.getLon());
		lugarDTO.setHorario(lugar.getHorario());
		lugarDTO.setDireccion(lugar.getDireccion());
		lugarDTO.setDescripcion(lugar.getDescripcion());
		lugarDTO.setCorreo(lugar.getCorreo());
		lugarDTO.setAlt(lugar.getAlt());
		
		lugarDTOList.add(lugarDTO);
		
		}
		return lugarDTOList;
	}
}
