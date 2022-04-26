package packObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;
	public void abrirBrowser(String browser,String site) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}else System.out.println("Escolha outro navegador!");
		driver.manage().window().maximize();
		driver.get(site);
		
	}
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	public void fecharNavegador() {
		driver.close();
	}
	
		

}
