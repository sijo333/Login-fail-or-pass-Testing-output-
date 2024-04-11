package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class junit { 
	WebDriver driver;
	
	@Test
	public void Test1()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		String Actualtitle="Logged In Successfully | Practice Test Automation";
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		
		
		 if(Actualtitle.equalsIgnoreCase(expectedtitle))
	    {
	    	System.out.println("pass");
	    	
	    }
	    
	    else {
	    	System.out.println("fail");
	    }
	}

	@Test
	public void Test2()
	{
		driver.findElement(By.name("username")).sendKeys("studen");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		String Actualtitle="Test Login | Practice Test Automation";
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		
		
		 if(Actualtitle.equalsIgnoreCase(expectedtitle))
	    {
	    	System.out.println("pass");
	    	
	    }
	    
	    else {
	    	System.out.println("fail");
	    }
	}
	@Test
	public void Test3()
	{
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password23");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		String Actualtitle="Test Login | Practice Test Automation";
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		
		
		 if(Actualtitle.equalsIgnoreCase(expectedtitle))
	    {
	    	System.out.println("pass");
	    	
	    }
	    
	    else {
	    	System.out.println("fail");
	    }
	}
	@Test
	public void Test4()
	{
		driver.findElement(By.name("username")).sendKeys("studen");
		driver.findElement(By.name("password")).sendKeys("Password12");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		String Actualtitle="Test Login | Practice Test Automation";
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		
		
		 if(Actualtitle.equalsIgnoreCase(expectedtitle))
	    {
	    	System.out.println("pass");
	    	
	    }
	    
	    else {
	    	System.out.println("fail");
	    }
	}
	

@Before
public void Test()
{
	System.setProperty("webdriver.edge.driver","C:\\selenium\\edge web driver\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	
}
@After
public void test()	
{
	driver.close();
	}
}

