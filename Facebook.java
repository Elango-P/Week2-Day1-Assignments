package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Test");
driver.findElement(By.name("lastname")).sendKeys("Leaf");
driver.findElement(By.name("reg_email__")).sendKeys("P.elango1452@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("P.elango1452@gmail.com");
driver.findElement(By.id("password_step_input")).sendKeys("qwerty@135");

WebElement drpDwn = driver.findElement(By.name("birthday_day"));
Select bdDwn = new Select(drpDwn);
bdDwn.selectByValue("15");

WebElement drpDwn1 = driver.findElement(By.name("birthday_month"));
Select monDwn = new Select(drpDwn1);
monDwn.selectByValue("11");

WebElement drpDwn2 = driver.findElement(By.name("birthday_year"));
Select yrDwn = new Select(drpDwn2);
yrDwn.selectByValue("1993");
driver.findElement(By.className("_8esa")).click();
driver.findElement(By.className("websubmit")).click();

		
	}

}
