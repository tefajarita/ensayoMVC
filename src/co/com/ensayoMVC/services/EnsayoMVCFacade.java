package co.com.ensayoMVC.services;

import java.util.ArrayList;

import co.com.ensayoMVC.model.BarberoDTO;
import co.com.ensayoMVC.model.FirstPageDTO;

public class EnsayoMVCFacade {

	public FirstPageDTO getFirstPageDTO() {
				FirstPageServices firstPageServices = new FirstPageServicesImpl();
			return firstPageServices.getFirstPageDTO();
		}
	public ArrayList<BarberoDTO> getBarberoPageDTO(){
		BarberoServices barberoServices = new BarberoServicesImp();
		
		return barberoServices.findByIdList();
	}
	
}
