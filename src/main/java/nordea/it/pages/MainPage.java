package nordea.it.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import nordea.it.pattern.*;


public class MainPage extends PatternPage{
	
	public WebElement getButtonNordeaIT(){
		return driver.findElement(By.xpath("/html/body/section/nav/ul/li[2]/a"));
	}
	
	public WebElement getNordeaPte(){
		return driver.findElement(By.xpath("/html/body/section/nav/ul/li[4]/a"));
	}
	
	public NordeaIT getPageNordeaIt(){
		getButtonNordeaIT().click();
		return new NordeaIT();
	}
	

}
