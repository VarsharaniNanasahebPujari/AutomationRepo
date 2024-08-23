package automationPractice.automation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Set;

public class WindowHandling_popup {
	WebDriver driver;
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	}
	public void click_window() throws InterruptedException
	{
		WebElement btn_window=driver.findElement(By.xpath("//button[contains(text(),'Open Window')]"));
		btn_window.click();
		String main_window=driver.getWindowHandle();
		System.out.println("parent_window:"+main_window);
		System.out.println(driver.getTitle());
		Set<String> all_window=driver.getWindowHandles();
		for(String x:all_window)
		{
			System.out.println("Window_handles:"+x);
			if(!x.equals(main_window))
			{
				driver.switchTo().window(x);
				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("Courses")).click();
				Thread.sleep(3000);
				driver.close();
				
				
			}
			driver.switchTo().window(main_window);
			Thread.sleep(3000);
			driver.close();
			
			
			
		}
		 
		
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WindowHandling_popup w=new WindowHandling_popup();
		w.setup();
		w.click_window();

	}

}
