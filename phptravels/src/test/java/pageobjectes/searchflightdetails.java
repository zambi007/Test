package pageobjectes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchflightdetails {
	
public WebDriver driver;
	
	By flights_button = By.xpath("//*[@data-name=\"flights\"]");
	By ROUND_TRIP = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div/div[2]/label");
    By from = By.xpath("//*[@id=\"s2id_location_from\"]/a");
    By to =   By.xpath("//*[@id=\"s2id_location_to\"]/a");
	By Search = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[4]/button");
	
	public searchflightdetails(WebDriver driver) {
	
		this.driver=driver;
		
	}


	public void searchflightpage(WebDriver driver) {


		this.driver = driver;
	}


	public WebElement flights_button()
	
	{
	
		return driver.findElement(flights_button);
				
	}
	
	public WebElement ROUND_TRIP()
	
	{
	
		return driver.findElement(ROUND_TRIP);
				
	}
	
	public WebElement to()
	
	{
	
		return driver.findElement(to);
				
	}
	
    public WebElement from()
	
	{
	
		return driver.findElement(from);
				
	}
    public WebElement Search()
	
	{
	
		return driver.findElement(Search);
				
	}
	
}
