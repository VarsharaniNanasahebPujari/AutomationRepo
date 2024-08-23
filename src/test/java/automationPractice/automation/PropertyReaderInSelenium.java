package automationPractice.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class PropertyReaderInSelenium 
{
	WebDriver driver;
	String url;
	String password1;
	String email1;
	String project_path;
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
	}
	
	public void read_propertis_file() throws IOException
	{
		File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\properties_testdata\\Testdata.properties");
	    FileInputStream fin=new FileInputStream(f);
	    Properties p=new Properties();
	    p.load(fin);
	   url =p.getProperty("url");
	   email1=p.getProperty("email");
	   password1=p.getProperty("password");
	   
	    
	    
	
	}
	 public void facebooklogin() 
	 
	 {
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys(email1);
		
		WebElement txt_pass=driver.findElement(By.id("pass"));
		txt_pass.sendKeys(password1);
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
	 }
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//System.out.println(System.getProperty("user.dir"));
		PropertyReaderInSelenium p=new PropertyReaderInSelenium();
		p.read_propertis_file();
		p.setup();
		p.facebooklogin();

	}

}
