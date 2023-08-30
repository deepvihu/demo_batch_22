package Step_def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.RediffPage;

public class RediffTest {
	WebDriver driver;
	RediffPage red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();	
	}
	@When("^user gives (.*) in search field$")
	public void user_gives_in_search_field(String keyword) {
	    red=new RediffPage(driver);
	    red.stext(keyword);
	    
	}
	@And("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		red.sbtn();
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
	driver.close();
	}
}
