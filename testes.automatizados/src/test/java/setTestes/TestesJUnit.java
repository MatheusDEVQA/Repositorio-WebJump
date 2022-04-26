package setTestes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elementos.Elementos;
import packObject.Metodos;

public class TestesJUnit {
	WebDriver driver;
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	String site = "https://wj-qa-automation-test.github.io/qa-test/";
	@Before
	public void setUp() throws Exception {
		metodos.abrirBrowser("chrome",site);
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws InterruptedException {
		
		
		metodos.clicar(el.getBotaoOne());
	    metodos.clicar(el.getBotaoTwo());
	    metodos.clicar(el.getBotaoFour());
	   
	   boolean display = driver.findElement(el.getBotaoTwo()).isDisplayed();
	   assertTrue(display);
	   
	   
	    
	    
	}
	@Test
	public void test2() {
		metodos.clicar(el.getBotaoOneIFrame());
	    metodos.clicar(el.getBotaoTwoIFrame());
	    metodos.clicar(el.getBotaoFourIFrame());
	}
	@Test
	public void tes3t() {
		
	}

}
