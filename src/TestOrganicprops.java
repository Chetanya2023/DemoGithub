import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrganicprops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://103.240.34.122:8085");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		String Phonenumber = "9876543210";
		String Emailid ="test@mailinator.com";
		
		driver.findElement(By.id("txtUserName")).sendKeys("Test User");
		driver.findElement(By.id("txtUserNumbner")).sendKeys(Phonenumber);
		driver.findElement(By.id("txtUserEmail")).sendKeys(Emailid);
		driver.findElement(By.xpath("(//label[@class='custom-control custom-radio custom-control-inline']) [2]")).click();
		driver.findElement(By.id("btnRegister")).click();
		String mobval = driver.findElement(By.id("error-txtCommonMsg")).getText();
		
		
		if (Phonenumber.length() == 10 && Emailid.contains("@") && Emailid.contains(" .com"))
		{
		
			driver.findElement(By.id("txtUserNumbner")).sendKeys(Phonenumber);
			driver.findElement(By.id("txtUserEmail")).sendKeys(Emailid);
			driver.findElement(By.xpath("(//label[@class='custom-control custom-radio custom-control-inline']) [2]")).click();
			driver.findElement(By.id("btnRegister")).click();
			
		}	
			
		else if( Phonenumber.length() <10 )
		{
			System.out.println(driver.findElement(By.id("error-txtUserNumbner")).getText());
			System.out.println("Phonenumber is long");
		}
		
		else if(Phonenumber.length() >10)
		{
			System.out.println(driver.findElement(By.id("error-txtUserNumbner")).getText());
			System.out.println("Phonenumber is short");
		}
		
		else if(Phonenumber.isBlank() )
		{
			System.out.println(driver.findElement(By.id("error-txtUserNumbner")).getText());
			
			System.out.println("Blank Mobile Number");
		
		}
		
		else if (Emailid.isBlank())
		{
		
			System.out.println(driver.findElement(By.id("error-txtUserEmail")).getText());
			System.out.println("Blank Email");
		}
		
		else if ( ! Emailid.contains("@") && ! Emailid.contains(" .com"))
		{
			System.out.println(driver.findElement(By.id("error-txtUserEmail")).getText());
			System.out.println("Wrong Email");
		}

		/*else if  ( mobval.contains("Mobile number is already exits"))
		{
			driver.findElement(By.id("txtUserNumbner")).clear();
			driver.findElement(By.id("txtUserNumbner")).sendKeys(Phonenumber);
			System.out.println("Ok");
		}
		driver.findElement(By.id("btnRegister")).click(); */
		
		/*Thread.sleep(2000);
	     String validation = driver.findElement(By.id("error-txtCommonMsg")).getText();
	     //System.out.println(validation);
	     
	     /* if (validation.contains("Email is already exits"))
	     {
	    	 driver.findElement(By.id("txtUserEmail")).clear();
	    	 driver.findElement(By.id("txtUserEmail")).sendKeys(Emailid);
	     }*/

		   
		
		/*driver.findElement(By.id("txtUserName")).sendKeys("Test User");
		driver.findElement(By.id("txtUserNumbner")).sendKeys("9876543210");
		driver.findElement(By.id("txtUserEmail")).sendKeys("test@mailinator.com");
		//driver.findElement(By.xpath("//span[text()='Agent']")).click();
		driver.findElement(By.xpath("(//label[@class='custom-control custom-radio custom-control-inline']) [2]")).click();
		driver.findElement(By.id("btnRegister")).click();
		
		
		Thread.sleep(2000);
		
		String mobval = driver.findElement(By.id("error-txtCommonMsg")).getText();
		if( mobval.contains("Mobile number is already exits"))
		{
			driver.findElement(By.id("txtUserNumbner")).clear();
			driver.findElement(By.id("txtUserNumbner")).sendKeys("9876542222");
		}
		driver.findElement(By.id("btnRegister")).click();
		
		Thread.sleep(2000);
	     String validation = driver.findElement(By.id("error-txtCommonMsg")).getText();
	     //System.out.println(validation);
	     if (validation.contains("Email is already exits"))
	     {
	    	 driver.findElement(By.id("txtUserEmail")).clear();
	    	 driver.findElement(By.id("txtUserEmail")).sendKeys("test125@mailinator.com");
	     }
	     
	    driver.findElement(By.id("btnRegister")).click();
	    driver.findElement(By.id("btnLogin1")).click();
	     
	driver.findElement(By.linkText("POST PROPERTY")).click();
	driver.findElement(By.id("Commercial")).click();
	driver.findElement(By.xpath("//a[text()='Shop']")).click();
	driver.findElement(By.id("txtTitle")).sendKeys("Test Property");
	driver.findElement(By.xpath("(//div[@id='Washrooms'] /a[@class='appart_btn']) [3]")).click();*/
	
	}
}
