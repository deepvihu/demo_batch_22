package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {

	WebDriver driver=null;
	
	@FindBy(xpath="//*[@id=\"user-na\"]")
	@CacheLookup
	WebElement uname;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	WebElement logBtn;
	
	
//	@FindBys({
//		@FindBy(xpath="/input[@id='password']"),
//			@FindBy(id="passwrd")
//		})
//	WebElement password;
//	
//	
//	@FindAll({
//		@FindBy(xpath="/input[@id='password']"),
//		@FindBy(id="passwrd"),
//		@FindBy(name="passwrd")
//	})
//	WebElement pwd;
	

	public LoginFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void swaglogin()
	{
		uname.sendKeys("problem_user");
		pass.sendKeys("secret_sauce");
	}
	
	public void swagu(String username)
	{
		uname.sendKeys(username);
		//pass.sendKeys(password);
	}
	public void swagp(String password)
	{
		//uname.sendKeys(username);
		pass.sendKeys(password);
	}
	public void swaglog(String username, String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
	}
	public void clickbtn()
	{
		logBtn.click();
	}
	
	
}
