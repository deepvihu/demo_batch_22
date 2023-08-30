package Step_def;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AppDemo.DemoAmazon.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class Log123 {
	WebDriver driver=null;
	LoginFactory log;
	String un,p;
	
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@When("user credentials enter username & password")
	public void user_credentials_enter_username_password(io.cucumber.datatable.DataTable credentials) {
		log=new LoginFactory(driver);
		List<List<String>> cells= credentials.cells();
		log.swagu(cells.get(0).get(0));
		log.swagp(cells.get(0).get(1));
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		log.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		Utility.Capture(driver);
		driver.close();
}
}

