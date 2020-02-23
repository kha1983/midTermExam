package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsPage {
	
	WebDriver driver;
	
	public PostsPage(WebDriver driver)         {
		this.driver=driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using ="//*[contains(text(),'Posts')]")
	WebElement ClickPosts_Field;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'All Posts')]")
	WebElement ClickAllPosts_Field;
	
	public void clickAllPosts()     {
		ClickPosts_Field.click();
		ClickAllPosts_Field.click();
	}	
	public void validatepostAppeared()        {
		
		boolean status=driver.findElement(By.xpath("//*[contains(text(),'It is time for go to market now')]")).isDisplayed();
		
		if(status==true)     {
			System.out.println("Post Validation is sucessfull");
		}
		else    {
			System.out.println("Validation is not sucessfull and keep trying");
		}
	
		
	}
		
		
		
	}
	



