package Stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.loginpage;

public class Registersteps {
	WebDriver driver= null;
	loginpage login;
	@Given("user navigates to Register page")
	public void user_navigates_to_register_page() {
		driver=new ChromeDriver();
		   login=new loginpage(driver);
		   
		   driver.manage().window().maximize();
	   
	   driver.get("https://dsportalapp.herokuapp.com/home/Register"); 
	}

	@When("User will  Enter {string} in the Username field")
	public void user_will_enter_in_the_username_field(String string) {
	   login.enterUsername("Priya");
	}

	@When("user will Enter {string} in the Password field")
	public void user_will_enter_in_the_password_field(String string) {
	    login.enterPassword("1234");
	}

	@When("User will Enter {string} in the Password Confirmation Field")
	public void user_will_enter_in_the_password_confirmation_field1(String string) {
	    login.enterPasswordconfirmation("1234");
	}

	@When("user clicks Register button1")
	public void user_clicks_register_button11() {
	    login.ClickRegister();
	}

	@Then("User get Loginfailed message")
	public void user_get_loginfailed_message() {
		 Alert alert = driver.switchTo().alert();
		 String alertText = alert.getText();
		 System.out.println("You are not logged in: " + alertText);
	}
	@When("User will  Enter {string} in the Username field1")
	public void user_will_enter_in_the_username_field1(String string) {
	   login.enterUsername("Dsalgo@146");
	}

	@When("user will Enter {string} in the Password field1")
	public void user_will_enter_in_the_password_field1(String string) {
	    login.enterPassword("Gpss@146");
	}

	@When("User will Enter {string} in the Password Confirmation Field1")
	public void user_will_enter_in_the_password_confirmation_field11(String string) {
	    login.enterPasswordconfirmation("Gpss@146");
	}

	@When("user clicks Register button2")
	public void user_clicks_register_button2() {
	    login.ClickRegister();
	}
	@Then("User get success message")
	public void user_get_success_message() {
		Alert alert = driver.switchTo().alert();
		 String alertText = alert.getText();
		 System.out.println("You are logged in: " + alertText);
	}
}	