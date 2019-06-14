package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestCase2  {
	
	WebDriver driver;
	
	
	/*@BeforeTest
	public void openBrowser ()
	{
		
		
	}
	  
	  @Test(priority=1)
	  @Then("click on users link at left side of website")
	  public void click_on_users_link_at_left_side_of_website() 
	  {
		  user_is_already_on_Login_Page();
		  user_enters_and("opensourcecms", "opensourcecms");
		  user_clicks_on_login_button();
		  
		  
		  driver.findElement(By.xpath("//div[@id='adminmenuwrap']/ul/li[5]/a")).click();
	  }


	@Test(priority=2)
	  @Then("user moves to new user page and click on Add new button")
	  public void user_moves_to_new_user_page_and_click_on_Add_new_button() {
		
	      Actions act = new Actions(driver);
	      WebElement newUser = driver.findElement(By.linkText("New"));
	      act.moveToElement(newUser).build().perform();

		  driver.findElement(By.linkText("User")).click();
	  }


	@Test(priority=3)
	  @Then("^user enters new user details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	  public void user_enters_new_user_details_and_and_and(String firstname, String lastname, String username1, String role,String email) {

			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username1);
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
		    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);
		    Select Role = new Select(driver.findElement(By.xpath("//select[@id='role']")));
		    Role.selectByVisibleText(role);
		    driver.findElement(By.xpath("//input[@id='createusersub']")).click();
	  }


	@Test(priority=4)
	  @Then("verify user is created")
	  public void verify_user_is_created(String username) {
		  
			driver.findElement(By.xpath("//input[@id='user-search-input']")).sendKeys(username);
			String realusername =driver.findElement(By.xpath("//table[@class='wp-list-table widefat fixed striped users']/tbody/tr[1]/td[1]/strong/a")).getText();
			//Assert.assertEquals("", realusername);
	  }
	  
	  */
	
}
