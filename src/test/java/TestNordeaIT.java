import nordea.it.pages.MainPage;
import nordea.it.pages.NordeaIT;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNordeaIT {

	NordeaIT it;
	MainPage main;
	
	@BeforeTest
	public void before(){
		main = new MainPage();
	}
	
	@Test
	public void testNordeaIt(){
		it = main.getPageNordeaIt();
	}
	
	
	@AfterTest
	public void after(){
		it.closeDriver();
	}
}
