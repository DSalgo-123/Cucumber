package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	public static WebDriver driver;
	By btnGetstarted=By.xpath("//button[@class='btn']");
	By btnDatastructures=By.xpath("//a[@data-toggle='dropdown']");
	By btnArray=By.xpath("//a[@href='/array']");
	By btnLinkedlist=By.xpath("//a[@href='/linked-list']");
	By btnstack=By.xpath("//a[@href='/stack']");
	By btnQueue=By.xpath("//a[@href='/queue']");
	By btnTree=By.xpath("//a[@href='/tree']");
	By btnGraph=By.xpath("//a[@href='/graph']");
	By btnGetstartedqueue=By.xpath("//a[@href='queue']");
	By txtRegister=By.xpath("//a[@href='/register']");
	//By txtUsername=By.xpath("//input[@name='username']");
	By txtusername=By.name("username");
	//By txtPassword=By.xpath("//input[@name='password1']");
	By txtpassword=By.name("password");
	//By txtPasswordConfirmation=By.xpath("//input[@name='password2']");
	By txtPasswordConfirmation=By.name("password2");
	By btnRegister=By.xpath("//input[@Value='Register']");
	By txtSignin=By.xpath("//a[@href='/login']");
	By txtUsername1=By.xpath("//input[@name='username']");
	By txtPassword1=By.xpath("//input[@name='password']");
	By btnlogin=By.xpath("//input[@type='submit']");By linktextQueueoperations=By.xpath("//a[@href='QueueOp']");
	public loginpage(WebDriver driver){

	this.driver= driver;
	}

	public void clickGetstarted() {
		
		driver.findElement(btnGetstarted).click();
	}
	public void clickDatastructures(){
		driver.findElement(btnDatastructures).click();
	}
	public void clickArray() {
		driver.findElement(btnArray).click();
	}
	public void clickLinkedList() {
		driver.findElement(btnLinkedlist).click();
	}
	public void clickstack() {
		driver.findElement(btnstack).click();
	}
	public void clickQueue() {
		driver.findElement(btnQueue).click();
	}
	public void clickTree() {
		driver.findElement(btnTree).click();
	}
	public void clickGraph() {
		driver.findElement(btnGraph).click();
	}
	public void clickgetstartedqueue() {
		driver.findElement(btnGetstartedqueue).click();
	}
	public void ClickRegister() {
		driver.findElement(txtRegister).click();
	}
	public  void enterUsername11(String Username) {
		driver.findElement(txtusername).sendKeys("Priya");
	}
	public  void enterPassword11(String Password) {
		driver.findElement(txtpassword).sendKeys("1234");
	}
	public void enterPasswordconfirmation1(String Passwordconfirmation) {
	driver.findElement(txtPasswordConfirmation).sendKeys("1234");	
	}
	public void ClickRegister11() {
		driver.findElement(btnRegister).click();
	}
	public  void enterUsername(String Username) {
		driver.findElement(txtusername).sendKeys("Dsalgo@146");
	}
	public  void enterPassword(String Password) {
		driver.findElement(txtpassword).sendKeys("Gpss@146");
	}
	public void enterPasswordconfirmation(String Passwordconfirmation) {
	driver.findElement(txtPasswordConfirmation).sendKeys("Gpss@146");	
	}
	public void ClickRegister1() {
		driver.findElement(btnRegister).click();
	}
	public void clickSignin() {
		driver.findElement(txtSignin).click();
	}
	public  void enterUsername1(String Username) {
		driver.findElement(txtusername).sendKeys("Username");
	}
	public  void enterPassword1(String Password) {
		driver.findElement(txtpassword).sendKeys("Password");
	}
	public  void clickLogin() {
		driver.findElement(btnlogin).click();
	}
	
	public void loginValidUser (String Username,String Password) {
		driver.findElement(btnGetstarted).click();
		driver.findElement(btnDatastructures).click();
		driver.findElement(btnArray).click();
		driver.findElement(btnLinkedlist).click();
		driver.findElement(btnstack).click();
		driver.findElement(btnQueue).click();
		driver.findElement(btnTree).click();
		driver.findElement(btnGraph).click();
		driver.findElement(btnGetstartedqueue).click();
		driver.findElement(txtRegister).click();
		driver.findElement(txtusername).sendKeys("Username");
		driver.findElement(txtusername).sendKeys("Username");
		driver.findElement(txtPasswordConfirmation).sendKeys("Password Confirmation");	
		driver.findElement(btnRegister).click();
		driver.findElement(txtSignin).click();
	    driver.findElement(txtusername).sendKeys("Username");
		driver.findElement(txtpassword).sendKeys("Password");
		driver.findElement(btnlogin).click();
		

		
	}
}
