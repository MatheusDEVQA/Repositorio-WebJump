package setTestes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class CenarioUm {
	WebDriver driver;
	Elementos el = new Elementos();
	@Test
	public void cenarioUm() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wj-qa-automation-test.github.io/qa-test/");
	
		driver.findElement(el.getBotaoOne()).click();
		driver.findElement(el.getBotaoTwo()).click();
		driver.findElement(el.getBotaoFour()).click();
		boolean displayOne = driver.findElement(el.getBotaoOne()).isDisplayed();
		boolean displayTwo = driver.findElement(el.getBotaoTwo()).isDisplayed();
		boolean displayFour = driver.findElement(el.getBotaoFour()).isDisplayed();
					
		assertTrue(displayOne);
		assertTrue(displayTwo);
		assertTrue(displayFour);
		
}
}