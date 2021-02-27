import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
		
	/*driver.get("https://www.google.com"); 
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
	
	//change the java compiler to 1.7
	//path should be right 
	//save all driver to class path
	driver.get("https://www.yahoo.com");
	//driver.navigate().back();	
	driver.close();  */
		driver.get("https://www.facebook.com");
	/*	driver.findElement(By.id("email")).sendKeys("This is my first code");
	    driver.findElement(By.name("pass")).sendKeys("123455");
	    driver.findElement(By.linkText("Forgotten password?")).click(); 
		driver.findElement(By.cssSelector("#email")).sendKeys("1233333");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("3214444");
	*/
		
	/*	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sasssss");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sanket");
		
		
		
		driver.findElement(By.xpath("//*[@id='u_0_h']")).click(); error
		
		*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("sanker");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123455");
		driver.findElement(By.cssSelector("[type='submit']")).click(); 
	}

}
  