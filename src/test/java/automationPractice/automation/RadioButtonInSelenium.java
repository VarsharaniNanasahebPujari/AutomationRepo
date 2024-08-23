package automationPractice.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonInSelenium {
	WebDriver driver;
	
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
		
		
	}
	public void getRadio() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		
		System.out.println("radio1 isDisplayed:"+radio1.isDisplayed());
		System.out.println("radio1 isEnabled:"+radio1.isEnabled());
		System.out.println("radio1 before clicking:"+radio1.isSelected());
		radio1.click();
		System.out.println("radio1 after clicking:"+radio1.isSelected());
	    Thread.sleep(3000);
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RadioButtonInSelenium r=new RadioButtonInSelenium ();
		r.setUp();
		r.getRadio();

	}

}
