package co.com.ensayoMVC.services;


import java.util.ArrayList;

import co.com.ensayoMVC.model.LugarDTO;

public interface LugarServices {
	public LugarDTO findById(int lugarId);
	public ArrayList<LugarDTO> findByIdList();

}
