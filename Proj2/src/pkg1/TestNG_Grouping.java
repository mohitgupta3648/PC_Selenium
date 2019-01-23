package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Grouping {

@Test
public void TC1()
{	
	System.out.println("test1");
}

@Test
public void TC2()
{	
	System.out.println("test2");
}

@BeforeSuite
public void Before_Suite()
{	
	System.out.println("before suite");
}

@AfterSuite
public void After_Suite()
{	
	System.out.println("After suite");
}

@BeforeClass
public void Before_Class()
{	
	System.out.println("Before_Class");
}

@AfterClass
public void After_Class()
{	
	System.out.println("After_Class");
}

@BeforeTest
public void Before_Test()
{	
	System.out.println("Before Test");
}

@AfterTest
public void After_Test()
{	
	System.out.println("After_Test");
}
	
	@BeforeMethod
public void Before_Method()
{	
	System.out.println("before method");
}

@AfterMethod
public void After_Method()
{	
	System.out.println("After_Method");
}


}
