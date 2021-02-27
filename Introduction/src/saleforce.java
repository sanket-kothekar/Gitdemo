import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
	/*	driver.findElement(By.id("username")).sendKeys("Sanket");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();*/
	
		//System.out.println(driver.findElement(By.cssSelector("#error")).getText());   /*getting error print*/
		
		/* 
		 * x p a t h writing t a g n a m e[@attributes='values']
		 * or            *[@attributes='values']
		 * 
		 * c s s  t a g n a m e[attribute='values']
		 * or 
		 * [attribute='values']
		 * 
		 */
		driver.findElement(By.cssSelector("#username")).sendKeys("sanket");
		driver.findElement(By.cssSelector("#password")).sendKeys("12222222");
	}

}
