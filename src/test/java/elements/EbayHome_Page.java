package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Page {

	WebDriver driver;
	
	@FindBy(id = "gh-as-a")
	public WebElement advanceLink;

	@FindBy(id = "gh-ac")
	public WebElement searchField;

	@FindBy(id = "gh-btn")
	public WebElement searchBtn;

	@FindBy(css = "h1.srp-controls__count-heading > span:nth-child(1)")
	public WebElement resultCount; 
	
	@FindBy(xpath = "//select[@id='gh-cat']/option")
	public List<WebElement> categories;
	
	@FindBy(linkText = "Tecnología")
	public WebElement technologyLink;
	
	@FindBy(linkText = "Moda")
	public WebElement fashionLink;
	
	@FindBy(linkText = "Deportes")
	public WebElement sportLink;
	
	public EbayHome_Page(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(driver, this);
	}
}
