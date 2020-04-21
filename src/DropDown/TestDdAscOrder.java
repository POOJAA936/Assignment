package DropDown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDdAscOrder 
{
	@Test
    public void runTestOnDocker() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "./config/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement dd = driver.findElement(By.id("month"));
		Select s = new Select(dd);
		ArrayList<String> l1 = new ArrayList<>();
		for (WebElement e : s.getOptions()) 
		{
			l1.add(e.getText());
		}
		ArrayList<String> l2= l1;
		Collections.sort(l2);
		Assert.assertEquals(l2, l1);
		System.out.println("sorted");
		driver.close();
	}
}