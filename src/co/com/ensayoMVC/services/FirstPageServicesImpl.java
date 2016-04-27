package co.com.ensayoMVC.services;

import java.util.LinkedList;

import co.com.ensayoMVC.model.FirstPageDTO;
import co.com.ensayoMVC.model.SessionFirstPageDTO;

public class FirstPageServicesImpl implements FirstPageServices{

	@Override
	public FirstPageDTO getFirstPageDTO() {
		FirstPageDTO firstPageDTO = new FirstPageDTO();
		SessionFirstPageDTO imagen1 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen2 = new SessionFirstPageDTO();
		SessionFirstPageDTO imagen3 = new SessionFirstPageDTO();
		
		imagen1.setImagePath("/resources/imagenes/logo_banner.png");
		imagen1.setTittle("banner");
		
		imagen2.setImagePath("/resources/imagenes/border-bg.png");
		imagen2.setTittle("borde");
		
		imagen3.setImagePath("/resources/imagenes/servicios.png");
		imagen3.setTittle("SERVICIOS");
		
		
		String[]  quien ={ "¿Quienes Somos?",
				"BARBERÍA SANTY BARBERSHOP RESCATAMOS EL ARTE DE LAS ANTIGUAS BARBERÍAS Y LA EXPERIENCIA EN LAS QUE EN ELLAS SE VIVÍA. CONJUNTUAMOS TRADICIONES, SERVICIOS CON ALTOS ESTÁNDARES DE CALIDAD E HIGIENE, Y LOS MEJORES PRODUCTOS.",
				"AQUÍ ENCONTRARÁS ESE ESPACIO QUE HEMOS PERDIDOS LOS HOMBRES, DONDE MOTILARSE Y AFEITARSE SE CONVIERTE EN UNA TERAPIA DE AMIGOS Y RELAJACIÓN, MÁS QUE UN HABITO."};
		
		String recortes = "RECORTE/ALINEADO";
		String recortes1="RECORTE DE CABALLERO";
		//Creo los textos 
		
		LinkedList<String> textos = new LinkedList<String>();
		LinkedList<String> textos1 = new LinkedList<String>();
		LinkedList<String> textos2 = new LinkedList<String>();
		textos.add("CABEZA / $45");
		textos.add("TOALLA CALIENTE, ACEITE PRE-SHAVE, ESPUMA CALIENTE, AFEITADO DE CABEZA, BÁLSAMOS AFTER-SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		textos.add("SANTY / $45");
		textos.add("EL SELLO DE LA CASA: DOBLE TRATAMIENTO DE TOALLA CALIENTE, ACEITE PRE-SHAVE Y ESPUMA CALIENTE, DOS PASADOS CON NAVAJA LIBRE PARA UNA AFEITADA MÁS CERRADA, BÁLSAMO AFTER SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		textos.add("CLASICO / $20");
		textos.add("TOALLA CALIENTE, ACEITE PRE-SHAVE, ESPUMA CALIENTE, AFEITADO DE BARBA, BÁLSAMO AFTER SHAVE Y UNA REFRESCANTE TOALLA FRÍA.");
		
		textos1.add("BARBA / $15");
		textos1.add("RECORTE, ARREGLO Y ALINEADO DE BARBA CON NAVAJA LIBRE.");
		textos1.add("BIGOTE / $10");
		textos1.add("RECORTE, ARREGLO Y ALINEADO DE BIGOTE CON NAVAJA LIBRE.");
		
		textos2.add("CABALLERO / $10");
		textos2.add("JUNIOR / $6");
		String afectado = "AFEITADO";
		
		
		// Se adiciona al DTO del modelo la informacion de las imagenes,textos.
		firstPageDTO.setImagen1(imagen1);
		firstPageDTO.setImagen2(imagen2);
		firstPageDTO.setImagen3(imagen3);
		firstPageDTO.setQuien(quien);
		firstPageDTO.setRecortes(recortes);
		firstPageDTO.setRecortes1(recortes1);
		firstPageDTO.setTextos(textos);
		firstPageDTO.setTextos1(textos1);
		firstPageDTO.setTextos2(textos2);
		firstPageDTO.setAfectado(afectado);
		return firstPageDTO;
	}

}
