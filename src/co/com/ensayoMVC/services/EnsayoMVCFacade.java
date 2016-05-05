package co.com.ensayoMVC.services;

import java.util.ArrayList;
import java.util.List;

import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.FirstPageDTO;
import co.com.ensayoMVC.model.LugarDTO;
import co.com.ensayoMVC.model.ServicioDTO;

public class EnsayoMVCFacade {

	public FirstPageDTO getFirstPageDTO() {
				FirstPageServices firstPageServices = new FirstPageServicesImpl();
			return firstPageServices.getFirstPageDTO();
		}
	public List<BarberoDTO> getBarberoPageDTO(){
		BarberoServices barberoServices = new BarberoServicesImp();
		
		return barberoServices.listBarbero();
	}
	
	
	public List<ServicioDTO> getServicioPageDTO(){
		ServicioServices servicioServices = new ServicioServicesImp();
		
		return servicioServices.listServicios();
	}
	
	public List<LugarDTO> getLugarPageDTO(){
		LugarServices lugarServices = new LugarServicesImp();
		return lugarServices.findByIdList();
	}
	
}
