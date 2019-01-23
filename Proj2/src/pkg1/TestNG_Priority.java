package pkg1;

import org.testng.annotations.Test;

public class TestNG_Priority {

	@Test(priority=0)
	public void TC1()
	{	
		System.out.println("TC1");
	}

	@Test(priority=1)
	public void TC2()
	{	
		System.out.println("TC2");
	}
	
	
}
