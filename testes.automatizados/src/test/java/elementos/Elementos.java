package elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By botaoOne = By.xpath("//p/button[@id='btn_one']");
	private By botaoTwo = By.xpath("//*[@id=\"panel_body_one\"]/p/button[@id='btn_two']");
	private By botaoFour = By.id("//*[@id='panel_body_one']/p/button[@id='btn_link']");
	
	private By botaoOneIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_one']");
	private By botaoTwoIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_two']");
	private By botaoFourIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_link']");
	
	private By firstName = By.cssSelector("#form_group #first_name");
	private By optionThree = By.cssSelector("#panel_body_one .checkbox #opt_three");
	private By exampleTwo = By.cssSelector("#panel_body_one #select_box option:nth-child(2)");
	private By imgSelenium = By.cssSelector("img[alt='selenium']");
	
	
	public By getBotaoOne() {
		return botaoOne;
	}
	public By getBotaoTwo() {
		return botaoTwo;
	}
	public By getBotaoFour() {
		return botaoFour;
	}
	public By getBotaoOneIFrame() {
		return botaoOneIFrame;
	}
	public By getBotaoTwoIFrame() {
		return botaoTwoIFrame;
	}
	public By getBotaoFourIFrame() {
		return botaoFourIFrame;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getOptionThree() {
		return optionThree;
	}
	public By getExampleTwo() {
		return exampleTwo;
	}
	public By getImgSelenium() {
		return imgSelenium;
	}
	
			
			
}
