package setTestes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class CenarioDois {
	WebDriver driver;
	Elementos el = new Elementos();

	@Test
	public void cenarioDois() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wj-qa-automation-test.github.io/qa-test/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement iFrame = driver.findElement(el.getiFrame());
		js.executeScript("arguments[0].scrollIntoView(true)", iFrame);

		WebElement botao = driver.findElement(el.getBotaoOneIFrame());
		botao.submit();

		boolean displayOne = driver.findElement(el.getBotaoOneIFrame()).isDisplayed();
		boolean displayTwo = driver.findElement(el.getBotaoTwoIFrame()).isDisplayed();
		boolean displayFour = driver.findElement(el.getBotaoFour()).isDisplayed();
		assertTrue(displayOne);
		assertTrue(displayTwo);
		assertTrue(displayFour);

	}

}
