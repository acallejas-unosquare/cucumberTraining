package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.Common_Actions;
import actions.EbayAdvanceSearch_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvanceSearch_Steps {

	Common_Actions common_actions;
	EbayAdvanceSearch_Actions ebayAdvanceSearch_actions;
	WebDriverWait wait;
	
	public EbayAdvanceSearch_Steps(Common_Actions common_actions, EbayAdvanceSearch_Actions ebayAdvanceSearch_actions) {
		 this.common_actions = common_actions;
		 this.ebayAdvanceSearch_actions = ebayAdvanceSearch_actions;
	}
	
	@Given("I am Ebay Advance Search Page")
	public void i_am_ebay_advance_search_page() {
	     common_actions.goToURL("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I click on Ebay Logo")
	public void i_click_on_ebay_logo() {
		ebayAdvanceSearch_actions.clickEbayLogo();
	}

	@Then("I am navigate to Ebay Home Page")
	public void i_am_navigate_to_ebay_home_page() {
		String expURL = "https://www.ebay.com/";
	    String currentURL = common_actions.getCurrentURL();
	        
	    if (!expURL.equals(currentURL)) {
	    	fail("The page is not the expected");
	    }
	}
	
	@When("I advance search an item")
	public void i_advance_search_an_item(DataTable dataTable) throws InterruptedException {
		ebayAdvanceSearch_actions.fillAdvanceSearch(dataTable.cell(1, 0));
	    ebayAdvanceSearch_actions.fillExcludeWord(dataTable.cell(1, 1));
	    ebayAdvanceSearch_actions.fillMinPrice(dataTable.cell(1, 2));
	    ebayAdvanceSearch_actions.fillMaxPrice(dataTable.cell(1, 3));
	    
	    ebayAdvanceSearch_actions.clickSearchBtn();
	    Thread.sleep(3000);
	}
	
}
