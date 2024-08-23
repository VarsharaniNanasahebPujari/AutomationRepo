package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorTagName {
	WebDriver driver;
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.manage().window().maximize();
	
	}
public void getLocator()
{
	driver.get("https://www.flipkart.com/");
	WebElement a_tag=driver.findElement(By.tagName("a"));
	System.out.println(a_tag.getAttribute("title"));                                         
	
	List<WebElement> tag_multi=driver.findElements(By.tagName("a"));
	System.out.println(tag_multi.size());
	
	for(WebElement x:tag_multi)
	{
	 System.out.println(x.getAttribute("title")+":"+x.getAttribute("href"));
	 
	}
	
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorTagName tag=new LocatorTagName();
		tag.setup();
		tag.getLocator();
		
		
		
		
		

	}

}
