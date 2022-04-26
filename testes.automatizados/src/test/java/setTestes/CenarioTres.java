package setTestes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class CenarioTres {
	WebDriver driver;
	Elementos el = new Elementos();

	@Test
	public void cenarioTres() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wj-qa-automation-test.github.io/qa-test/");

		driver.findElement(el.getFirstName()).sendKeys("TEstes WEBJUMP");
		driver.findElement(el.getBotaoOne()).click();
		driver.findElement(el.getOptionThree()).click();
		driver.findElement(el.getExampleTwo()).click();
		String img = driver.findElement(el.getImgSelenium()).getAttribute("src");
		assertTrue(img.equals("https://i.imgur.com/1vsaEJB.jpg"));

	}

}
