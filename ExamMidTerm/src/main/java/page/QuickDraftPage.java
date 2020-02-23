package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftPage {
	
	WebDriver driver;
	
	public QuickDraftPage(WebDriver driver)         {
		this.driver=driver;
	}
	
	//Element Library
	@FindBy(how = How.NAME, using ="post_title")
	WebElement Title_Field;
	
	@FindBy(how = How.XPATH, using = "//*[@placeholder='What’s on your mind?']")
	WebElement Content_Field;
	
	@FindBy(how = How.ID, using ="save-post")
	WebElement Save_Button;
	

	public void FillUpTheForm()     {
		Title_Field.sendKeys("It is time for go to market now");
		Content_Field.sendKeys("I am absolutely ready for the market");
		Save_Button.click();
	}
	public void myRecentDraft()     {
		boolean status=driver.findElement(By.xpath("//*[contains(text(),'It is time for go to market now')]")).isDisplayed();
		
		if(status==true)     {
			System.out.println("Validation is sucessfull");
		}
		else    {
			System.out.println("Validation is not sucessfull and keep trying");
		}
		
		
		
	}

}
