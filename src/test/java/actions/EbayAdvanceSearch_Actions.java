package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvanceSearch_Page;
import elements.EbayHome_Page;
import steps.Common_Steps;

public class EbayAdvanceSearch_Actions {
	
	WebDriver webdriver;
	EbayAdvanceSearch_Page ebayAdvance_page;
	
	public EbayAdvanceSearch_Actions(Common_Steps common_steps) {
		this.webdriver = common_steps.getDriver();
		ebayAdvance_page = new EbayAdvanceSearch_Page(this.webdriver);
	}

	public void clickEbayLogo() {
		ebayAdvance_page.ebayLogo.click();
	}
	
	public void fillAdvanceSearch(String product) {
		ebayAdvance_page.advanceSearch.sendKeys(product);
	}
	
	public void fillExcludeWord(String word) {
		ebayAdvance_page.excludeWord.sendKeys(word);
	}

	public void fillMinPrice(String price) {
		ebayAdvance_page.min.sendKeys(price);
	}

	public void fillMaxPrice(String price) {
		ebayAdvance_page.max.sendKeys(price);
	}
	
	public void clickSearchBtn() {
		ebayAdvance_page.btnSearch.click();
	}
	
}
