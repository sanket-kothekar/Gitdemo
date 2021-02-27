import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	/*	driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("google");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='top_nav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();*/
		 
		driver.findElement(By.xpath("")).sendKeys("12333");
			
	}

}
