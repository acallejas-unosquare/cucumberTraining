package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Common_Actions;
import actions.EbayAdvanceSearch_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	Common_Actions common_actions;
	EbayHome_Actions ebHomeActions;
	String URL = "https://www.ebay.com";
	
	public EbayHome_Steps(Common_Actions common_actions, EbayHome_Actions ebHomeActions) {
		this.common_actions = common_actions;
		this.ebHomeActions = ebHomeActions;
	}
	
	 @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() throws InterruptedException {
		common_actions.goToURL(URL);
        Thread.sleep(3000);
    }
	 
    @When("I click on Advance Link")
    public void i_click_on_advance_link() {
    	ebHomeActions.clickAdvanceLink();
    }
    
    @Then("I navigate to Advance Search Page")
    public void i_navigate_to_advance_search_page() {
        String expURL = "https://www.ebay.com/sch/ebayadvsearch";
        String currentURL = common_actions.getCurrentURL();
        
        if (!expURL.equals(currentURL)) {
        	fail("The page is not the expected");
        }
    }
    
    @When("I search for {string}")
	public void i_search_for_iphone(String str1) {
    	ebHomeActions.fillSearchField(str1);
    	ebHomeActions.clickSeachBtn();
	}

	@Then("I validate at least {int} search items present")
	public void i_validate_at_least_search_items_present(int count) {
		String itemCount = ebHomeActions.getResultCount();
	    itemCount = itemCount.replace(",", "");
	    itemCount = itemCount.replace(".", "");
	    int itemCountInt = Integer.parseInt(itemCount);
	    if(itemCountInt < count) {
	    	fail("It's expected to get at least 1000 results");
	    }
	}
	
	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) throws InterruptedException {
		ebHomeActions.fillSearchField(string);
		List<WebElement> cat = ebHomeActions.getCategories();
		for(WebElement e: cat) {
			if(e.getText().trim().equals(string2)) {
				e.click();
				break;
			}
		}
		ebHomeActions.clickSeachBtn();
	    Thread.sleep(1000);
	}
	
	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		ebHomeActions.clickLink(string);
		Thread.sleep(3000);
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		String currentURL = common_actions.getCurrentURL();
		String currentTitle = common_actions.getCurrentTitle();
		if(!currentURL.equals(url)) {
			fail("The URL is not the expected the current URL is " + currentURL);
		}
		if(!currentTitle.contains(title)) {
			fail("The title is not the expected the current title is " + currentTitle);
		}
	}
}
