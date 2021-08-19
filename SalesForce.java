package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.name("UserFirstName")).sendKeys("Elango");
driver.findElement(By.name("UserLastName")).sendKeys("Ela");
driver.findElement(By.name("UserEmail")).sendKeys("b.elango93@gmail.com");
driver.findElement(By.name("UserPhone")).sendKeys("9600576361");
driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");

WebElement drpDwn = driver.findElement(By.name("UserTitle"));
Select jobDown = new Select(drpDwn);
jobDown.selectByValue("IT_Manager_AP");

WebElement drpDwn1 = driver.findElement(By.name("CompanyEmployees"));
Select jobDown1 = new Select(drpDwn1);
jobDown1.selectByIndex(3);

WebElement drpDwn2 = driver.findElement(By.name("CompanyCountry"));
Select jobDown2 = new Select(drpDwn2);
jobDown2.selectByValue("IN");
driver.findElement(By.className("checkbox-ui-label")).click();
driver.close();












	


	
}
}