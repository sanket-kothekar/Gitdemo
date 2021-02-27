	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//auto suggestion
public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com");

		// WebElement source= drvier.findElement(By.id(

		driver.findElement(By.id("fromCity")).sendKeys("Auran");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Hydr");

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys(Keys.ENTER);

	}

}
