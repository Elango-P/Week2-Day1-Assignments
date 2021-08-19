package week2.day1;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  WebElement webUser = driver.findElement(By.id("username"));
	 webUser.sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();

	 // create lead
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elango");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ela");
	 WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	 countrycode.clear();
	 countrycode.sendKeys("5");
	 
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("TestLeaf");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Student");
	 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/15/93");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestEngineer");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing&Development");
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("190");
	 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9856");
	 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Testing");
	 
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing The Software By Automation");
	 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("TestLeaf gives you a Bright Future if you WorkHard");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("890");
	 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("54653");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9867645435");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("KrishnaKumar");
	 
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("b.elango93@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm ");
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Elango");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sanjay");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("SAP Colony");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("RsPuram");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("658947");
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("768564");
	  
	 WebElement dropDown1 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select countryDown = new Select(dropDown1);
	countryDown.selectByValue("IND");
	 WebElement dropDown2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select stateDown = new Select(dropDown2);
stateDown.selectByVisibleText("TAMILNADU");
	 WebElement dropDown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	 Select curDown = new Select(dropDown3);
	curDown.selectByValue("INR");
	 
	
	 WebElement dropDown6 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select indDown = new Select(dropDown6);
	 indDown.selectByIndex(9);
	 WebElement dropDown7 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select ownrDown = new Select(dropDown7);
	 ownrDown.selectByIndex(3);
	 
	 
	 
	 WebElement dropDown4 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select dropDown = new Select(dropDown4);
	dropDown.selectByVisibleText("Employee");
	 WebElement dropDown5 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select mrcDown = new Select(dropDown5);
	 mrcDown.selectByValue("CATRQ_AUTOMOBILE");
	 
	 
	 String text = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	 System.out.println("Firstname:" +text);
	 String title = driver.getTitle(); 
	 String title2 = "View Lead | opentaps CRM";
	 if(title.equals(title2))
			 {
	 System.out.println("The title matches:"+ title );
			 }
	 else
	 {
		 System.out.println("The title mismaches:" + title);
	 }
	 driver.findElement(By.className("smallSubmit")).click();
	}

}
