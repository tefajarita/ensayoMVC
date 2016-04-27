package co.com.ensayoMVC.model;

import java.io.Serializable;
import java.util.LinkedList;

import co.com.ensayoMVC.model.SessionFirstPageDTO;


public class FirstPageDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8932510463021288841L;
	private SessionFirstPageDTO imagen1;
	private SessionFirstPageDTO imagen2;
	private SessionFirstPageDTO imagen3;
	private String[]  quien;
	private String recortes;
	private String recortes1;
	private LinkedList<String> textos;
	private LinkedList<String> textos1;
	private LinkedList<String> textos2;
	private String afectado;
	public SessionFirstPageDTO getImagen1() {
		return imagen1;
	}
	public void setImagen1(SessionFirstPageDTO imagen1) {
		this.imagen1 = imagen1;
	}
	public SessionFirstPageDTO getImagen2() {
		return imagen2;
	}
	public void setImagen2(SessionFirstPageDTO imagen2) {
		this.imagen2 = imagen2;
	}
	public SessionFirstPageDTO getImagen3() {
		return imagen3;
	}
	public void setImagen3(SessionFirstPageDTO imagen3) {
		this.imagen3 = imagen3;
	}
	public String[] getQuien() {
		return quien;
	}
	public void setQuien(String[] quien) {
		this.quien = quien;
	}
	public String getRecortes() {
		return recortes;
	}
	public void setRecortes(String recortes) {
		this.recortes = recortes;
	}
	public String getRecortes1() {
		return recortes1;
	}
	public void setRecortes1(String recortes1) {
		this.recortes1 = recortes1;
	}
	public LinkedList<String> getTextos() {
		return textos;
	}
	public void setTextos(LinkedList<String> textos) {
		this.textos = textos;
	}
	public LinkedList<String> getTextos1() {
		return textos1;
	}
	public void setTextos1(LinkedList<String> textos1) {
		this.textos1 = textos1;
	}
	public LinkedList<String> getTextos2() {
		return textos2;
	}
	public void setTextos2(LinkedList<String> textos2) {
		this.textos2 = textos2;
	}
	public String getAfectado() {
		return afectado;
	}
	public void setAfectado(String afectado) {
		this.afectado = afectado;
	}
	
	

}
