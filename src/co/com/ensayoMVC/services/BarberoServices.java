package co.com.ensayoMVC.services;

import java.util.ArrayList;

import co.com.ensayoMVC.model.BarberoDTO;


public interface BarberoServices {
	public BarberoDTO findById(int barberoId);
	public ArrayList<BarberoDTO> findByIdList();
}
