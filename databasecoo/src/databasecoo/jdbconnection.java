package databasecoo;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class jdbconnection {

public static void main(String[] args) throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub

String host="localhost";
	
String port= "3306";

Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "admin");

Statement s=con.createStatement();

ResultSet rs=s.executeQuery("select * from emp where age=21;");


while(rs.next()) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=eu");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("name"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("location"));
	/*  System.out.println(rs.getString("id"));
	  System.out.println(rs.getString("name"));
	  System.out.println(rs.getString("location"));
	  */
}

/*while(rs.next())

{

WebDriver driver= new FirefoxDriver();

driver.get("https://login.salesforce.com");

driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));

}
*/
}

}