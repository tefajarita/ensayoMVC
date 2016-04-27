package co.com.ensayoMVC.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class LugarServicesImpTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link co.com.ensayoMVC.services.LugarServicesImpl#findById(int)}.
	 */
	@Test
	public void testFindById() {
		int lugarId=2;
		LugarServices lugarServices = new LugarServicesImp();
		assertNotNull(lugarServices.findById(lugarId));
	}
	
	
	/**
	 * Test method for {@link co.com.ensayoMVC.services.LugarServicesImpl#findByIdList()}.
	 */
	@Test
	public void testFindByIdList() {
		
		LugarServices lugarServices = new LugarServicesImp();
		assertNotNull(lugarServices.findByIdList());
		
		
	}

}
