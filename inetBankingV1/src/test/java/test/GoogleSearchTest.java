package test;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage; 

public class GoogleSearchTest {
	
	WebDriver driver;
	
	@Test
	public void launch() {
		
		WebDriverManager.chromiumdriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.fr/");
		 driver.manage().window().maximize();
		 GoogleSearchPage.refuse_button(driver).click();
		 
		// GoogleSearchPage.button_tout_refuser(driver).click();

		 GoogleSearchPage.textbox_search(driver).sendKeys("testeur QA automaticien" + Keys.ENTER);
		
		 //Revoir 
		// GoogleSearchPage.button_search(driver);
		 
	}


}
