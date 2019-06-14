package stepDefinition;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase1 {
	
	public WebDriver driver;
	
	 

  
  @Test(priority=0)
  @Given("user is already on Login Page")
  public void user_is_already_on_Login_Page() {
      // Write code here that turns the phrase above into concrete actions
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Setups\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
      
  }

  @Test(priority=1)
  @When("title of login page is Username or Email Address")
  public void title_of_login_page_is_Username_or_Email_Address() 
  {
	    String title = driver.findElement(By.xpath("//form[@id='loginform']/p[1]/label")).getText();
		//Assert.assertTrue(title.contains(("WordPress")));
	  
     
  }
  
  
  @Test(priority=2)
  @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_and(String username, String password) {
	  
	 System.out.println(password+"    "+username);

	   driver.findElement(By.id("user_login")).sendKeys(username);
	   driver.findElement(By.id("user_pass")).sendKeys(password);
	   
  }
  
  
  @Test(priority=3)
  @Then("user clicks on login button")
  public void user_clicks_on_login_button() {
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
  }

  
  
  @Test(priority=4)
  @Then("user is on home page")
  public void user_is_on_home_page() 
  {
	  
	   String hompagetitile = driver.getTitle();
	   System.out.println(hompagetitile);
	  
	  // Assert.assertTrue(hompagetitile.contains(""));
  }
  
  
  @Test(priority=5)
  @Then("close the browser")
  public void close_the_browser() {
  	driver.close();
  }
  
  @Test(priority=6)
  @Then("click on users link at left side of website")
  public void click_on_users_link_at_left_side_of_website() 
  {
	  user_is_already_on_Login_Page();
	  user_enters_and("opensourcecms", "opensourcecms");
	  user_clicks_on_login_button();
	  
	  
	  driver.findElement(By.xpath("//div[@id='adminmenuwrap']/ul/li[5]/a")).click();
  }


@Test(priority=7)
  @Then("user moves to new user page and click on Add new button")
  public void user_moves_to_new_user_page_and_click_on_Add_new_button() {
	
      Actions act = new Actions(driver);
      WebElement newUser = driver.findElement(By.linkText("New"));
      act.moveToElement(newUser).build().perform();

	  driver.findElement(By.linkText("User")).click();
  }


@Test(priority=8)
  @Then("^user enters new user details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_new_user_details_and_and_and(String firstname, String lastname, String username1, String role,String email) {

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username1);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
	    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);
	    Select Role = new Select(driver.findElement(By.xpath("//select[@id='role']")));
	    Role.selectByVisibleText(role);
	    driver.findElement(By.id("createusersub")).click();
  }


@Test(priority=9)
  @Then("verify user is created")
  public void verify_user_is_created(String username) {
	  
		driver.findElement(By.xpath("//input[@id='user-search-input']")).sendKeys(username);
		String realusername =driver.findElement(By.xpath("//table[@class='wp-list-table widefat fixed striped users']/tbody/tr[1]/td[1]/strong/a")).getText();
		//Assert.assertEquals("", realusername);
  }
  
  

}
