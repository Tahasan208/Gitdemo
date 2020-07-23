package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Addntech_Soft\\Selenium\\Selenium Framework2\\Framework\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		System.out.println(prop.getProperty("url"));
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Addntech_Soft\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Addntech_Soft\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\Addntech_Soft\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
