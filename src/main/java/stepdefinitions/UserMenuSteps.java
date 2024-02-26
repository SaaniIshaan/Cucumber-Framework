package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserMenuSteps {
	WebDriver driver;
	
	@When("user clicks on the usermenu dropdown")
	public void user_clicks_on_the_usermenu_dropdown() {
		driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("userNavLabel")).click();
	}

	@Then("usermenu dropdown items should be displayed")
	public void usermenu_dropdown_items_should_be_displayed() {
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 List<WebElement> usermenuItems = driver.findElements(By.xpath("//div[@id='userNav-menuItems']/a"));
	 String Expected []= {"My Profile", "My Settings","Developer Console","Switch to Lightning Experience","Logout"};
	 String Actual = driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a")).getText();
	 Assert.assertEquals(Expected, Actual);
	 
	}



}
