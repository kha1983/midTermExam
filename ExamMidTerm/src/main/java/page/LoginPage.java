package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)         {
		this.driver=driver;
	}
	
	//Element Library
	@FindBy(how = How.ID, using ="user_login")
	WebElement UserName_Field;
	
	@FindBy(how = How.ID, using = "user_pass")
	WebElement Password_Field;
	
	@FindBy(how = How.ID, using ="wp-submit")
	WebElement Submit_Button;
	
	public void login()      {
		UserName_Field.sendKeys("opensourcecms");
		
	
		Password_Field.sendKeys("opensourcecms");
		

		Submit_Button.click();
	}
	public String getPageTitle()    {
		return driver.getTitle();
	}
	

}
