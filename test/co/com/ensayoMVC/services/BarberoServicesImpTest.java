package co.com.ensayoMVC.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class BarberoServicesImpTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testFindById() {
		int barberoId=1;
		BarberoServices barberServices = new BarberoServicesImp();
		assertNotNull(barberServices.findById(barberoId));
	}
	
	
	
	@Test
	public void testFindByIdList() {
		
		BarberoServices barberoServices = new BarberoServicesImp();
		assertNotNull(barberoServices.findByIdList());
		
		
	}

}
