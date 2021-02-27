import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class tablesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> firstsort=driver.findElements(By.xpath("//tr/td[1]"));
		
		ArrayList<String> originallist=new ArrayList<String>();
		for(int i=0;i<firstsort.size();i++)
		{
			
			originallist.add(firstsort.get(i).getText());
		}
		ArrayList<String> copielist=new ArrayList<String>();
		for(int i=0;i<originallist.size();i++)
		{
			
			copielist.add(originallist.get(i));
			
			
		}
		System.out.println("**********************");
		Collections.sort(copielist);
		for(String s: copielist)
		{
			System.out.println(s);
		}
		System.out.println("***********original List***********");
		for(String s: originallist)
		{
			System.out.println(s);
		}
		//Assert.assertTrue(originallist.equals(copielist));
	}

}
