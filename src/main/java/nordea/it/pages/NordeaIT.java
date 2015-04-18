package nordea.it.pages;

import nordea.it.pattern.PatternPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NordeaIT extends PatternPage {
	
	public WebElement getPeople(){
		return driver.findElement(By.xpath("//*[@id=\"subnav\"]/ul/li[2]/a"));
	}
	
	public void closeDriver(){
		driver.close();
	}

}
