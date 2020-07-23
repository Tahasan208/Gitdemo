package Framework;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SingupPage;
import resources.base;

public class homePage extends base {
	@BeforeTest
	public void initilize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		LandingPage lp=new LandingPage(driver);
	    lp.getSingup().click();
	    SingupPage sp= new SingupPage(driver);
		sp.getFullName().sendKeys("Tahmid Hasan");
		sp.getRedifId().sendKeys("tahmidhasan.k");
		sp.getCheck().click();
		sp.getPassword().sendKeys("Tahasank69");
		sp.getRetypePassword().sendKeys("Tahasank69");
		sp.getAlterEmail().sendKeys("Tahmidhasan.k@gmail.com");
		sp.getClick().click();
		Select sQuestion= new Select(sp.getQuestion());
		sQuestion.selectByIndex(3);
		sp.getAnswer().sendKeys("foodlove");
		sp.getMotherName().sendKeys("Jullyiya");
		WebElement cCode= sp.getcountrycode();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cCode);
		sp.getcountrySelect().click();
		sp.getMobile().sendKeys("1234567890");
		Select day= new Select(sp.getday());
		day.selectByValue("13");
		Select month= new Select(sp.getmonth());
		month.selectByValue("08");
		Select year= new Select(sp.getyear());
		year.selectByValue("1995");
		sp.getGender().click();
		Select country = new Select(sp.getCountry());
		country.selectByValue("222");
		Thread.sleep(5000);
		sp.getSubmit().click();
		driver.switchTo().alert().accept();
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
