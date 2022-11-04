package actions;

import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class Common_Actions {

		private WebDriver driver;
		private Common_Steps common_Steps;
		
		public Common_Actions(Common_Steps common_steps) {
			this.driver = common_steps.getDriver();
		}
		
		public void goToURL(String url) {
			this.driver.get(url);
		}
		
		public String getCurrentTitle() {
			return this.driver.getTitle();
		}
		
		public String getCurrentURL() {
			return this.driver.getCurrentUrl();
		}
		
		public void quitDriver() {
			this.driver.quit();
		}
}
