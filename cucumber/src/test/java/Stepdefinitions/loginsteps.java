package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageobject.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	WebDriver driver= null;
	loginpage login;
	@Given("user is on dsalgo homepage")
	public void user_is_on_dsalgo_homepage() {
		driver=new ChromeDriver();
		   login=new loginpage(driver);
		   
		   driver.manage().window().maximize();
	   driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks on Datastructure dropdown")
	public void user_clicks_on_datastructure_dropdown() throws InterruptedException {
		Thread.sleep(3000);
		
	    login.clickDatastructures();
		
	}

	@Then("user can see six different datastructure entries")
	public void user_can_see_six_different_datastructure_entries() {
	   
	}

	@And("user Selects each entries from dropdown")
	public void user_selects_each_entries_from_dropdown() throws InterruptedException {
	

	  
		Thread.sleep(3000);
	   login.clickArray();
	   Thread.sleep(3000);

	   login.clickLinkedList();
	   Thread.sleep(3000);

	   login.clickstack();
	   Thread.sleep(3000);

	   login.clickQueue();
	   Thread.sleep(3000);

	   login.clickTree();
	   Thread.sleep(3000);

	   login.clickGraph();
	}


	@Then("alertmessage is showing as' You are not logged in'")
	public void alertmessage_is_showing_as_you_are_not_logged_in() {
		driver.switchTo().alert().getText();   
	}

	@Given("User is on Dsalgo homepage1")
	public void user_is_on_dsalgo_homepage1() throws InterruptedException {
		Thread.sleep(3000);

		driver.get("https://dsportalapp.herokuapp.com/home");    
	}

	@When("User clicks Getstarted button in Datastructure topics")
	public void user_clicks_getstarted_button_in_datastructure_topics() throws InterruptedException {
		Thread.sleep(3000);

	    login.clickGetstarted();
	}
	@Given("user is on dsalgo portal homepage")
	   
	public void user_is_on_dsalgo_portal_homepage() throws InterruptedException {
		driver=new ChromeDriver();
		   login=new loginpage(driver);
		   Thread.sleep(3000);

		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks Register link")
	public void user_clicks_register_link() throws InterruptedException {
		Thread.sleep(3000);

	  login.ClickRegister();
}

	@Then("User will redirect to register page")
	public void user_will_redirect_to_register_page() throws InterruptedException {
		driver=new ChromeDriver();
		   login=new loginpage(driver);
		   Thread.sleep(3000);

		driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks sign in link")
	public void user_clicks_sign_in_link() throws InterruptedException {
		Thread.sleep(3000);
	   login.clickSignin();
	}

	@Then("User will redirect to login page")
	public void user_will_redirect_to_login_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://dsportalapp.herokuapp.com/home");
	}

}
