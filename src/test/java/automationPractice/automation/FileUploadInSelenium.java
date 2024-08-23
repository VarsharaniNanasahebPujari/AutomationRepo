package automationPractice.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class FileUploadInSelenium {
	WebDriver driver;
	String file_path="C:\\Users\\LENOVO\\Desktop\\profile creation details.txt";
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
	}
	public void selectFile() throws AWTException, InterruptedException
	{
		WebElement sel_file=driver.findElement(By.id("uploadfile_0"));
		Actions ac=new Actions(driver);
		ac.click(sel_file).build().perform();
		
		
		StringSelection ssfile_path=new StringSelection(file_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssfile_path,null);
		
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement accept_term=driver.findElement(By.id("terms"));
		accept_term.click();
		
		WebElement btn_submit=driver.findElement(By.id("submitbutton"));
		btn_submit.click();
		
		
		
		
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		FileUploadInSelenium f=new FileUploadInSelenium();
		f.setup();
		f.selectFile();

	}

}
