package co.com.ensayoMVC.services;

import co.com.ensayoMVC.model.FirstPageDTO;

public class EnsayoMVCFacade {

	public FirstPageDTO getFirstPageDTO() {
				FirstPageServices firstPageServices = new FirstPageServicesImpl();
			return firstPageServices.getFirstPageDTO();
		}
}
