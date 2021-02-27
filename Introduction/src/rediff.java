import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sanket");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1233445");
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
	}

}
