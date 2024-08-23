package automationPractice.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesInSelenium {
	WebDriver driver;
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	 public void locate_link() {
		 
		 //driver.get("https://www.studentstutorial.com/code-editor/?topic=html&file_name=create_submenu");
		 WebElement link_submenu3=driver.findElement(By.partialLinkText("Main Item 3"));
		
		 System.out.println(link_submenu3.getText());
		 link_submenu3.click();
		 
	 }
	 public void locate_frame_switchdriver()
	 {
		 driver.get("https://www.studentstutorial.com/code-editor/?topic=html&file_name=create_submenu");
		 WebElement framecode=driver.findElement(By.id("code"));
		 driver.switchTo().frame(framecode);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FramesInSelenium f=new FramesInSelenium();
         f.setup();
        f.locate_frame_switchdriver();
         
         f.locate_link();
	}

}
