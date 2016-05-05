package co.com.ensayoMVC.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServicioServicesImpTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testListServicios() {
		ServicioServices servicios = new ServicioServicesImp();
		assertNotNull(servicios.listServicios());
	}

}
