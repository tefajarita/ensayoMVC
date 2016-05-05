package co.com.ensayoMVC.services;

import java.util.ArrayList;
import java.util.List;

import co.com.ensayoMVC.model.BarberoDTO;


public interface BarberoServices {
	public BarberoDTO findById(int barberoId);
	public ArrayList<BarberoDTO> findByIdList();
	//metodos con JPA 
	public BarberoDTO FindBarberoById(String barberoCedula);
	public List<BarberoDTO> listBarberosPorLugar(int lugar);
	public List<BarberoDTO> listBarbero();
}
