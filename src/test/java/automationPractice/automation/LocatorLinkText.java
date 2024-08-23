package automationPractice.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement link_forgotPwd=driver.findElement(By.linkText("Forgotten password?"));
		link_forgotPwd.click();
		//WebElement partiallink_forgotPwd=driver.findElement(By.partialLinkText("Forgotten"));
		//partiallink_forgotPwd.click();
	
		
		
		
				
		

	}

}
