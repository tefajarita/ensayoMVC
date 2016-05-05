package co.com.ensayoMVC.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.BarberoDAO;
import co.com.ensayoMVC.DAO.ServicioDAO;
import co.com.ensayoMVC.model.ServicioDTO;

public class ServicioServicesImp implements ServicioServices {

	public ServicioServicesImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ServicioDTO> listServicios() {
		ClassPathXmlApplicationContext context=null;
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			ServicioDAO servicioDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

			// Se realiza el insert
			List<ServicioDTO> servicios;
			return servicioDAO.listServicios();
			

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
		return null;
	}

}
