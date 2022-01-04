package Com.dws.utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookss {
	
	@Before
	public void beformethod() {
		System.out.println("Befor method");
	}
	
	@After
	public void aftermethod() {
		System.out.println("After method ---");	
	}

}
