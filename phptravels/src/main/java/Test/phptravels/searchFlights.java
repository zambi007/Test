package Test.phptravels;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageobjectes.searchflightdetails;
import resources.basedata;

public class searchFlights extends basedata {

	
@Test

	
	public void searchflightsnavigation() throws IOException, InterruptedException {
	
	basedata bd= new basedata();
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
	
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\data.properties");
    prop.load(fis);
    searchflightdetails search = new searchflightdetails(driver);
    bd.selection();
    search.from().sendKeys(prop.getProperty("from"));
	Thread.sleep(1000);
	//search.from().sendKeys(Keys.ARROW_DOWN);
	System.out.println("Pass");
	search.to().sendKeys(Keys.ENTER);
	search.to().click();
	search.to().sendKeys(prop.getProperty("to"));
	Thread.sleep(1000);
	search.from().sendKeys(Keys.ENTER);
	bd.Departcelender();
	bd.Returncelender();
	bd.passenger();
	searchflightdetails searchbutton = new searchflightdetails(driver);
	searchbutton.Search().click();;
	
		
}
}

		


