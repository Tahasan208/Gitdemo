package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingupPage {
	
	
	public WebDriver driver;
	
	
	By fullName=By.cssSelector("[name*='name']");
	By redifId= By.cssSelector("[name*='login']");
	By check=By.cssSelector("[name*='btnchkavail']");
	By password =By.cssSelector("[name*='passwd']");
	By rePassword=By.cssSelector("[name*='confirm_passwd']");
	By alterEmail=By.cssSelector("[name*='altemail']");
	By click=By.cssSelector("[type='checkbox']");
	By question=By.cssSelector("[name*='hint']");
	By answer=By.cssSelector("input[name*='hint']");
	By motherName= By.cssSelector("input[name*='mothername']");
	By mobile=By.id("mobno");
	By countrycode=By.cssSelector("input[id='hid_countryCode']");
	By countryselect= By.xpath("//li[contains(text(),'Bangladesh (+880)')]");
    By day=By.cssSelector("select[name*='DOB_Day']");
    By month=By.cssSelector("select[name*='DOB_Month']");
    By year= By.cssSelector("select[name*='DOB_Year']");
    By gender= By.xpath("//input[contains(@name,'gender')][1]");
    By country= By.xpath("//select[@id='country']");
    By submit=By.xpath("//input[@id='Register']");
    
public SingupPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;	
}

public WebElement getFullName()
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

public WebElement getcountrycode() {
	// TODO Auto-generated method stub
	return driver.findElement(countrycode);
}

public WebElement getQuestion() {
	return driver.findElement(question);
}
public WebElement getAnswer() {
	return driver.findElement(answer);
}
public WebElement getMotherName()
{
	return driver.findElement(motherName);
}
public WebElement getcountrySelect()
{
	return driver.findElement(countryselect);
}

public WebElement getday()
{
	return driver.findElement(day);
}
public WebElement getmonth()
{
	return driver.findElement(month);
}
public WebElement getyear()
{
	return driver.findElement(year);
}
public WebElement getGender()
{
	return driver.findElement(gender);
}
public WebElement getCountry()
{
	return driver.findElement(country);
}
public WebElement getSubmit()
{
	return driver.findElement(submit);
}
}
