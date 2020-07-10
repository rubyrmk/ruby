package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(2000);
		WebElement selectownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownership = new Select(selectownership);
		ownership.selectByIndex(0);
		Thread.sleep(2000);
		ownership.selectByIndex(1);
		Thread.sleep(2000);
		ownership.selectByIndex(2);
		Thread.sleep(2000);
		ownership.selectByIndex(3);
		Thread.sleep(2000);
		ownership.selectByIndex(4);
		Thread.sleep(2000);
		ownership.selectByIndex(5);
		Thread.sleep(2000);
		ownership.selectByIndex(6);
		Thread.sleep(2000);
		driver.close();
	}

}
