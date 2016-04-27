package co.com.ensayoMVC.model;

import java.util.List;

public class BarberoListDTO {
	private List<BarberoDTO> barberoDTOList;

	public List<BarberoDTO> getBarberoDTOList() {
		return barberoDTOList;
	}

	public void setBarberoDTOList(BarberoDTO barberoDTOList) {
		this.barberoDTOList.add(barberoDTOList);
	}
}
