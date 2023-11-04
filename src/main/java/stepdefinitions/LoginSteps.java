package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.junit.*;
//import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("mansi@hon.com");
		driver.findElement(By.id("password")).sendKeys("Manu@123");
		
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		//Assert.assertEquals(driver.getTitle().contains("Home"),"Home page should be visible");
		String Actual = driver.findElement(By.id("home_Tab")).getText();
		Assert.assertEquals("Home", Actual);
		
	}

	@When("user enters in-valid username and in-valid password")
	public void user_enters_in_valid_username_and_in_valid_password() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("123@hon.com");
		driver.findElement(By.id("password")).sendKeys("anu@123");
		Thread.sleep(3000);
	}

	@Then("user should get a error message")
	public void user_should_get_a_error_message() {
		//Assert.assertEquals(driver.findElement(By.id("error")).getText(),"Please check your credentials");
		String Actual = driver.findElement(By.id("error")).getText();
		String expected ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 Assert.assertEquals(expected, Actual);
	}
	
	@When("user clicks on the forgot password button")
	public void user_clicks_on_the_forgot_password_button() {
		driver.findElement(By.id("forgot_password_link")).click();
	}
	
	@When("user enters the valid username")
	public void user_enters_the_valid_username() {
		driver.findElement(By.id("un")).sendKeys("mansi@hon.com");
	}

	@When("user clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		driver.findElement(By.id("continue")).click();
	}

	@Then("user	should get a password reset message")
	public void user_should_get_a_password_reset_message() {
	    String Actual =driver.findElement(By.xpath("//*[@id=\"forgotPassForm\"]/div/p[1]")).getText();
		Assert.assertEquals("We’ve sent you an email with a link to finish resetting your password.", Actual);
	}

	@When("select the rememberMe check box")
	public void select_the_remember_me_check_box() {
		driver.findElement(By.id("rememberUn")).click();
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page1() throws InterruptedException {
		String Actual = driver.findElement(By.id("home_Tab")).getText();
		Assert.assertEquals("Home", Actual);
		Thread.sleep(3000);
	}

	@When("user click on the usermenu button")
	public void user_click_on_the_usermenu_button() throws InterruptedException {
		driver.findElement(By.id("userNavLabel")).click();
	//	driver.findElement(By.xpath("//div[@id ='userNav-menuItems']/a")).click();
		Thread.sleep(3000);
	}

	@When("user click on the logout button")
	public void user_click_on_the_logout_button() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("user should see username is displayed in username field")
	public void user_should_see_username_is_displayed_in_username_field() {
		Assert.assertEquals(driver.findElement(By.xpath("//span['idcard-identity']")).getText(),"username sholuld be displayed in username field");
	//	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='label usernamelabel']")).getText(),"username sholuld be displayed in username field");
		
	}



	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

