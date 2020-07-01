package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import pageobjectes.searchflightdetails;

public class basedata {
		int ADULTS = 2;
		int CHILD =2;
		int INFANT =1;
		
		
	public static WebDriver driver;

	public Properties prop;


	public WebDriver initializeDriver() throws IOException, InterruptedException


	{
		prop =new Properties();

	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\data.properties");

	prop.load(fis);

	String browsername = prop.getProperty("browser");

	System.out.println(browsername);

	if (browsername.equals("chrome"))

	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;

	}
	else if (browsername.equals("IE") )

	{

	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");

	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();


	return driver;
	}
	else if (browsername.equals("firefox"))

	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	return driver;

	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	return driver;

	}

	public void passenger()
	
	{

		
		for (int i = 1;i<=ADULTS;i++) {
		
		
			driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
		}
		
		for (int i = 1;i<=CHILD;i++) {
			
			driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]")).click();
		
		}
		
		for (int i = 1;i<=INFANT;i++) {
			
			driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div/span/button[1]")).click();
		
		}
		
	}
	
	public void Departcelender() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//input[@id=\"FlightsDateStart\"]")).click();
		//Thread.sleep(3000);
		while(!driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/nav/div[2]")).getText().contains("Aug"))
		{
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/nav/div[3]")).click();
		}

		int count=driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).get(i).click();
		break;
		}
		}
		
		
	}
	
	public void Returncelender() {
		
		while(!driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/nav/div[2]")).getText().contains("Sept"))
		{
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/nav/div[3]")).click();
		}

		int counta=driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).size();

		for(int i=0;i<counta;i++)
		{
		String text=driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.cssSelector("[class=\"datepicker--content\"] [class=\"datepicker--cell datepicker--cell-day\"]")).get(i).click();
		break;
		}
		
	    }


	}
	
	public void selection() throws InterruptedException
	
	{
		
	    searchflightdetails search = new searchflightdetails(driver);
		search.flights_button().click();
		search.ROUND_TRIP().click();
		WebElement catagory = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[2]/div/div/a/span"));
		catagory.click();
		WebElement business =driver.findElement(By.cssSelector(("[class=\"active-result\"][data-option-array-index=\"1\"]")));
		Actions a =new Actions(driver);
		a.click(business).build().perform();
		search.from().click();
		
	}
	
	
}
