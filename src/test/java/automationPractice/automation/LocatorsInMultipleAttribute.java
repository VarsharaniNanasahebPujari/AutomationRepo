package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;

public class LocatorsInMultipleAttribute {
	WebDriver driver;
	public void setup()
	{
		/*WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();*/
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		WebElement link_hindi=driver.findElement(By.xpath("//a[@dir='ltr' and @title='Hindi']"));
		System.out.println(link_hindi.getText());
		System.out.println(link_hindi.getAttribute("title"));
		
		
		
	}
	public void getMultiAttribute() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorsInMultipleAttribute ma=new LocatorsInMultipleAttribute();
		ma.setup();
		
	}

}
