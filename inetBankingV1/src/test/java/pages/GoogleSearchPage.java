package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
		public static WebElement refuse_button(WebDriver driver) {
		element = driver.findElement(By.id("W0wltc"));
		return element;
	}
	public static WebElement textbox_search(WebDriver  driver) {
		
	 element = driver.findElement(By.name("q"));
	return element;

	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		return element;
	}
	public static WebElement button_tout_refuser(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[text()='Tout refuser']"));
		return element;
	}
	

}
