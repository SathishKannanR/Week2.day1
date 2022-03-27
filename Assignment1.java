package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("democsr");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement((By.linkText("CRM/SFA"))).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathish");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sathish");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing Team");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathishkannan11@gmail.com");
		 WebElement we=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select se=new Select(we);
		 se.selectByVisibleText("New York");
		 //se.selectByValue("NY");
		 //se.selectByIndex(38);
		 driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
		 System.out.println("Title of the page is:" +title);
		 
		 
	}

}
