package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.PostsPage;
import page.QuickDraftPage;
import util.BrowserFactory;

public class LogInTest {
	
	WebDriver driver;
	
	@Test
	public void ValidUserShouldAbleToLogin()   throws Exception    {
		
		driver=BrowserFactory.StartBrowser();
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.login();
		
		
		QuickDraftPage quickdraftpage=PageFactory.initElements(driver, QuickDraftPage.class);
		quickdraftpage.FillUpTheForm();
		quickdraftpage.myRecentDraft();
		Thread.sleep(5000);
		
		
		PostsPage postspage=PageFactory.initElements(driver, PostsPage.class);
		postspage.clickAllPosts();
		postspage.validatepostAppeared();
		Thread.sleep(5000);
		
		
		
		driver.close();
		
		driver.quit();
	}
	

}
