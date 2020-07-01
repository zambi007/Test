package Test.phptravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestPHP {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul.zambare\\Desktop\\Zambi\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.phptravels.net/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	/*driver.findElement(By.xpath("//*[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).clear();
	driver.findElement(By.xpath("//*[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys("MUM");
	driver.findElement(By.xpath("//*[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys(Keys.ENTER);*/
	 driver.findElement(By.xpath("//*[@data-name=\"flights\"]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div/div[2]/label")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]/a")).click();
	 Thread.sleep(9000);
	 driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]/a")).sendKeys("MUM");
	//driver.findElement(By.xpath(""))
	//driver.findElement(By.xpath(""))
	/*driver.findElement(By.xpath("//*[@data-name=\"flights\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div/div[2]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"s2id_location_from\"]")).sendKeys("MUM");
	System.out.println("Pass");*/
	
	
}	

}
