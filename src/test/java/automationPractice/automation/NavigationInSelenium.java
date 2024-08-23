package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigationInSelenium {
	WebDriver driver;
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	public void getNavigation()throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		WebElement link_forgot=driver.findElement(By.linkText("Forgotten password?"));
		link_forgot.click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		
		
		
		
	}
	public static void main(String[] args)throws InterruptedException
	{
	NavigationInSelenium n=new NavigationInSelenium();
	n.setup();
	n.getNavigation();
	}
	

}
