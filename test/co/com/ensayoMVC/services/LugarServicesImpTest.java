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
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public void testFindById()  {
		int lugarId=1;
		LugarServices lugarServices = new LugarServicesImp();
		try {
			assertNotNull(lugarServices.findById(lugarId));
		} catch ( SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Test method for {@link co.com.ensayoMVC.services.LugarServicesImpl#findByIdList()}.
	 */
	
	/*public void testFindByIdList() {
		
		LugarServices lugarServices = new LugarServicesImp();
		assertNotNull(lugarServices.findByIdList());
		
		
	}*/

}
