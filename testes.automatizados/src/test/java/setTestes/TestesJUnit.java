package setTestes;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import elementos.Elementos;
import packObject.Metodos;

public class TestesJUnit {
	
	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	String site = "https://wj-qa-automation-test.github.io/qa-test/";
	//@Before
	public void setUp() throws Exception {
		metodos.abrirBrowser("firefox",site);
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test()   {
		
		metodos.abrirBrowser("chrome",site);
		metodos.clicar(el.getBotaoOne());
	    metodos.clicar(el.getBotaoTwo());
	    metodos.clicar(el.getBotaoFour());
	   
	   boolean display = driver.findElement(el.getBotaoTwo()).isDisplayed();
	   System.out.println("o display é" + display);
	   assertTrue(display);
	   
	   
	    
	    
	}
	
	@Test
	public void test2t() {
		metodos.abrirBrowser("chrome",site);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.Scrollby(0,350)", "");
		metodos.clicar(el.getBotaoOneIFrame());
	    metodos.clicar(el.getBotaoTwoIFrame());
	    metodos.clicar(el.getBotaoFourIFrame());
	}
	@Test
	public void tes3t() {
		metodos.abrirBrowser("chrome",site);
		metodos.escrever(el.getFirstName(), "Testes para analista");
		metodos.clicar(el.getBotaoOne());
		metodos.clicar(el.getOptionThree());
		metodos.clicar(el.getExampleTwo());
		
	}

}
