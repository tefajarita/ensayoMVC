package co.com.ensayoMVC.services;



import java.util.List;

import co.com.ensayoMVC.model.LugarDTO;

public interface LugarServices {
	//quitar excepciones
	public LugarDTO findById(int lugarId) ;
	public List<LugarDTO> findByIdList();

}
