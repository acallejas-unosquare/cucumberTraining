package actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.EbayHome_Page;
import steps.Common_Steps;

public class EbayHome_Actions {

	WebDriver webdriver;
	EbayHome_Page ebayHome_page;
	
	public EbayHome_Actions(Common_Steps common_steps) {
		this.webdriver = common_steps.getDriver();
		ebayHome_page = new EbayHome_Page(this.webdriver);
	}
	
	public void clickAdvanceLink() {
		ebayHome_page.advanceLink.click();
	}

	public void fillSearchField(String product) {
		ebayHome_page.searchField.sendKeys(product);
	}

	public void clickSeachBtn() {
		ebayHome_page.searchBtn.click();
	}

	public String getResultCount() {
		return ebayHome_page.resultCount.getText().trim();
	}

	public List<WebElement> getCategories() {
		return ebayHome_page.categories;
	}

	public void clickLink(String link) {
		switch(link) {
		case "Tecnología":
			ebayHome_page.technologyLink.click();
			break;
		case "Moda":
			ebayHome_page.fashionLink.click();
			break;
		case "Deportes":
			ebayHome_page.sportLink.click();
			break;
			
		}
			
	}
	
	
}
