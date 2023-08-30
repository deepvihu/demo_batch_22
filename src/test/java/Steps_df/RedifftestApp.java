package Steps_df;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.RediffPage;

public class RedifftestApp {
	WebDriver driver;
	RediffPage red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();	
	}
	
	@When("user gives keyword in search field")
	public void user_gives_keyword_in_search_field(DataTable keyword) {
	    red=new RediffPage(driver);
	 // single value
	    List<String> cells=keyword.asList(String.class);
	 red.stext(cells.get(1));
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
