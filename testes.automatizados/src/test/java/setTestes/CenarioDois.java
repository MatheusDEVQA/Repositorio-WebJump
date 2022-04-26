package setTestes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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

		// não tive tempo de colocar os metodos em outra classe

		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='buttons.html']"));
		driver.switchTo().frame(iframe);

		// clicar no botao iframe
		driver.findElement(el.getBotaoTwoIFrame()).click();
		WebElement botao = driver.findElement(el.getBotaoOneIFrame());
		Actions act = new Actions(driver);
		act.moveToElement(botao);
		act.click().build().perform();

		driver.findElement(el.getBotaoFourIFrame()).click();

		boolean displayOne = driver.findElement(el.getBotaoOneIFrame()).isDisplayed();
		boolean displayTwo = driver.findElement(el.getBotaoTwoIFrame()).isDisplayed();
		boolean displayFour = driver.findElement(el.getBotaoFour()).isDisplayed();
		assertTrue(displayOne);
		assertTrue(displayTwo);
		assertTrue(displayFour);

	}

}
