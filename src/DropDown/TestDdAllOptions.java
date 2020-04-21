package DropDown;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDdAllOptions 
{
	@Test
	public void allOptions()
	{
		System.setProperty("webdriver.gecko.driver", "./config/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String a[]= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		WebElement dd = driver.findElement(By.id("month"));
		Select s = new Select(dd);
		List<WebElement> options = s.getOptions();
		for(WebElement data:options)
		{
			for(int i=0;i<options.size();i++)
			{
				if(data.getText().equals(a[i]))
				{
					i++;
				}
			}
		}
		System.out.println("all elements present");
		Assert.assertEquals(options.size(), a.length);
		System.out.println("pass");
		driver.close();
	}
}