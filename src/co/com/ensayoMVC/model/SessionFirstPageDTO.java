package co.com.ensayoMVC.model;

import java.io.Serializable;

public class SessionFirstPageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7806483511561942544L;

	private String imagePath;
	
	private String tittle;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
}