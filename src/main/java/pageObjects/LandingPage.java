package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	By createacc=By.cssSelector("a[title='Create Rediffmail Account']");
	
	/*By fullName=By.name("name683152c1");
	By redifId= By.name("login683152c1");
	By check=By.name("btnchkavail683152c1");
	By password =By.name("passwd683152c1");
	By rePassword=By.name("confirm_passwd683152c1");
	By alterEmail=By.name("altemail683152c1");
	By click=By.name("chk_altemail683152c1");
	By mobile=By.id("mobno");*/
	
	

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;	
}

public WebElement getSingup() 
	{
return driver.findElement(createacc);
	}
/*public WebElement getFullName()
{
return driver.findElement(fullName);
}
public WebElement getRedifId()
{
return  driver.findElement(redifId); 
}
public WebElement getCheck()
{
return driver.findElement(check);
    
}
public WebElement getPassword()

{
return driver.findElement(password);	
}
public WebElement getRetypePassword()
{
return driver.findElement(rePassword);
}
public WebElement getAlterEmail()
{
return driver.findElement(alterEmail);
}
public WebElement getClick()
{
return driver.findElement(click);
}
public WebElement getMobile()
{
return driver.findElement(mobile);
}
*/


}
