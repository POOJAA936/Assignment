package DropDown;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDdDuplicates 
{
	@Test
	public void dropDown()
	{
		System.setProperty("webdriver.gecko.driver", "./config/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement dd = driver.findElement(By.id("month"));
		Select s=new Select(dd);
		TreeSet<String> l=new TreeSet<>();
		List<WebElement> options = s.getOptions();
		for(WebElement allOptions:options)
		{
			String MonthList = allOptions.getText();
			l.add(MonthList);
		}
		for(String sortMonthList:l)
		{
			System.out.println(sortMonthList);
		}
		Assert.assertEquals(options.size(), l.size());
		System.out.println("pass");
		driver.close();
	}
}