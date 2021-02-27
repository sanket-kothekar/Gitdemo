import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crizbuzztabular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31024/wel-vs-can-final-super-smash-2020-21");
		
	
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    
		table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		 
		 for(int i=0;i<count;i++)
		 {
			
			
			 System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
		 }
	
  // System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size());
	}
	
}
