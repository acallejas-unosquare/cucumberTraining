package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanceSearch_Page {
	
	WebDriver driver;
	
	@FindBy(id = "gh-la")
	public WebElement ebayLogo;
	
	@FindBy(xpath = "//input[@id='_nkw']")
	public WebElement advanceSearch;
	
	@FindBy(xpath = "//input[@id='_ex_kw']")
	public WebElement excludeWord;
	
	@FindBy(xpath = "//input[@name='_udlo']")
	public WebElement min;
	
	@FindBy(xpath = "//input[@name='_udhi']")
	public WebElement max;
	
	@FindBy(xpath = "//button[@id='searchBtnLowerLnk']")
	public WebElement btnSearch;
	
	public EbayAdvanceSearch_Page(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(driver, this);
	}
}
