package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class AccountsSteps {
	WebDriver driver;
	

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Actual = driver.findElement(By.id("home_Tab")).getText();
		Assert.assertEquals("Home", Actual);
	}

	@When("user clicks on the accounts link")
	public void user_clicks_on_the_accounts_link() {
		driver.findElement(By.id("Account_Tab")).click();
	}

	@Then("account page should be displayed")
	public void account_page_should_be_displayed() {
    String Actual = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();
    String Expected = "Accounts Home Page";
    	Assert.assertEquals( Expected, Actual);
	}

	@When("user clicks on the new button")
	public void user_clicks_on_the_new_button() {
		driver.findElement(By.name("new")).click();
	}

	@Then("new account edit page should be displayed")
	public void new_account_edit_page_should_be_displayed() {
		String Actual = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();
	    String Expected = "Accounts Edit Page";
	    	Assert.assertEquals( Expected, Actual);
	}

	@When("user enters the account name")
	public void user_enters_the_account_name() {
		driver.findElement(By.name("acc2")).sendKeys("PiyushA1");
	}

	@When("select type as technology partner")
	public void select_type_as_technology_partner() {
		WebElement dropDown = driver.findElement(By.name("acc6"));
		Select s = new Select(dropDown);
		s.selectByValue("Technology Partner");
	
	}

	@When("select customer priority as high")
	public void select_customer_priority_as_high() {
		WebElement dropDown1 = driver.findElement(By.name("00NHu00000PIrjl"));
		// WebElement dropDown1 = driver.findElement(By.xpath("//div[@class['labelCol']"));
		Select se = new Select(dropDown1);
		se.selectByVisibleText("High");
	}
	
	@When("click on the save button")
	public void click_on_the_save_button() {
		WebElement Save = driver.findElement(By.name("save"));
		Save.click();
	}
	
	@Then("New account page should be displayed")
	public void new_account_page_should_be_displayed() {
		String Actual = driver.findElement(By.xpath("//h2[@class='topName']")).getText();
		String Expected = "AccountName";
		Assert.assertEquals( Expected, Actual);
	}


}