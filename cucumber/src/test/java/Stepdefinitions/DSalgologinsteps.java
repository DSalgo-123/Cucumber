package Stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class DSalgologinsteps {
	WebDriver driver= null;
	loginpage login;

	@Given("^browser is open$")
	public void browser_is_open() {
	    System.out.println("Inside step-browser is open");
	   driver=new ChromeDriver();
	   login=new loginpage(driver);
	  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	   driver.manage().window().maximize();
	   driver.get("https://dsportalapp.herokuapp.com");
	}
	   
	   @When("User is on dsalgo portal page")
	   public void user_is_on_dsalgo_portal_page() {
		  // driver.get("https://dsportalapp.herokuapp.com");
	   }

	   @When("Clicks on GetStarted button")
	   public void clicks_on_get_started_button() {
	       login.clickGetstarted();
	   }

	   @Then("User has navigated to the dsalgo home page")
	   public void user_has_navigated_to_the_dsalgo_home_page() {
	      driver.get("https://dsportalapp.herokuapp.com/home");
	   }

	}

	