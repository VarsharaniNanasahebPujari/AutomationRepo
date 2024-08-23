package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LocatorxpathMethods {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		WebElement divinfo=driver.findElement(By.xpath("//div[contains(text(),'Insurance')]//parent::div//parent::div//parent::div"));
		System.out.println(divinfo.getAttribute("style"));
		
	
		WebElement CierrafollowSibling=driver.findElement(By.xpath("//div[contains(text(),'Cierra')]//following-sibling::div[2]"));
		System.out.println(CierrafollowSibling.getText());
		
		
        WebElement vegaprecedingSibling=driver.findElement(By.xpath("//div[contains(text(),'Vega')])//preceding-sibling::div[1]"));
        System.out.println(vegaprecedingSibling.getText());
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorxpathMethods m=new LocatorxpathMethods();
		m.setup();	}

}
