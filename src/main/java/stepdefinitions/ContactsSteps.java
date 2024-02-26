package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsSteps {
	WebDriver driver;
	
	@Then("user moves to the contact page")
	public void user_moves_to_the_contact_page() throws InterruptedException {
		driver.findElement(By.linkText("Contacts")).click();
		   String title = driver.getTitle();
		   Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
		   Thread.sleep(2000);
	}
	
	@When("clicks on the new contact button")
	public void clicks_on_the_new_contact_button() {
		 driver.findElement(By.name("new")).click();
	}
	
	@Then("new contact page is displayed")
	public void new_contact_page_is_displayed() {
		String title = driver.getTitle();
		  Assert.assertEquals(title, "Contact Edit: New Contact ~ Salesforce - Developer Edition");
	}
	
	@Then("User enters contact details {string} and {string} and {string}")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String Accountname) {
		 driver.findElement(By.id("name_firstcon2")).sendKeys(firstname);
		 driver.findElement(By.id("name_lastcon2")).sendKeys(lastname);
		 driver.findElement(By.id("con4")).sendKeys(Accountname);
		
	}
	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		driver.findElement(By.name("save_new")).click();
	}

}

	
/*	@Then("user moves to the contact page")
	public void user_moves_to_the_contact_page() throws InterruptedException {
	   driver.findElement(By.linkText("Contacts")).click();
	   String title = driver.getTitle();
	   Assert.assertEquals(title, "Contacts: Home ~ Salesforce - Developer Edition");
	   Thread.sleep(2000);
	}
	
	@When("clicks on the new contact button")
	public void clicks_on_the_new_contact_button() {
		 driver.findElement(By.name("new")).click();
	}
	
	@Then("new contact page is displayed")
	public void new_contact_page_is_displayed() {
		String title = driver.getTitle();
	   Assert.assertEquals(title, "Contact Edit: New Contact ~ Salesforce - Developer Edition");
	}
	
	@Then("^User enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String Accountname) {
		 driver.findElement(By.id("name_firstcon2")).sendKeys(firstname);
		 driver.findElement(By.id("name_lastcon2")).sendKeys(lastname);
		 driver.findElement(By.id("con4")).sendKeys(Accountname);
		
	}	
	
	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		driver.findElement(By.name("save_new")).click();
	*/
	



	



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

