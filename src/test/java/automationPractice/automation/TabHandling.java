package automationPractice.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandling {
	WebDriver driver;
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	public void getTab()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		String main_window=driver.getWindowHandle();
		System.out.println(main_window);
		
		WebElement btn_openTab=driver.findElement(By.xpath("//a[@id='opentab']"));
		btn_openTab.click();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabHandling t=new TabHandling();
		t.setup();
		t.getTab();

	}

}
