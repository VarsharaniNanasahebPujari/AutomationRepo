package automationPractice.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxInSelenium {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	public void getCheckBox()
	{
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		System.out.println("isDisplayed:"+checkbox1.isDisplayed());
		
		System.out.println("isEnabled:"+checkbox1.isEnabled());
		System.out.println("checkbox1 before clicking:"+checkbox1.isSelected());
		checkbox1.click();
		System.out.println("checkbox1 after clicking:"+checkbox1.isSelected());
		
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		System.out.println("isDisplayed:"+checkbox2.isDisplayed());
		
		System.out.println("isEnabled:"+checkbox2.isEnabled());
		System.out.println("checkbox2 before clicking:"+checkbox2.isSelected());
		checkbox2.click();
		System.out.println("checkbox2 after clicking:"+checkbox2.isSelected());
		checkbox2.click();//clicking on selected button uncheck it
		System.out.println("clicking on selected button uncheck it:"+checkbox2.isSelected());
		driver.close();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxInSelenium c=new CheckBoxInSelenium ();
		c.setup();
		c.getCheckBox();
		
	}

}
