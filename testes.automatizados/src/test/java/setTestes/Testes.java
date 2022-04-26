package setTestes;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class Testes {
	WebDriver dr;
	Elementos el = new Elementos();

		
		@Test
		public void teste() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://wj-qa-automation-test.github.io/qa-test/");
			dr.findElement(el.getBotaoOne()).click();
			boolean display = dr.findElement(el.getBotaoOne()).isDisplayed();
			System.err.println(display);
			JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("Scrollby(0,50)", "");
			
			
			//dr.close();
			
			
			
			
		}
}
