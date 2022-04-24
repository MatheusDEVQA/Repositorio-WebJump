package elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By botaoOne = By.xpath("//p/button[@id='btn_one']");
	private By botaoTwo = By.xpath("//*[@id=\"panel_body_one\"]/p/button[@id='btn_two']");
	private By botaoFour = By.id("//*[@id='panel_body_one']/p/button[@id='btn_link']");
	private By botaoOneIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_one']");
	private By botaoTwoIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_two']");
	private By botaoFourIFrame = By.xpath("//div[@class='col-sm-12']/p/button[@id='btn_link']");
}
