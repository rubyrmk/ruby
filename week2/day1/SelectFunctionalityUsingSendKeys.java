package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFunctionalityUsingSendKeys {

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
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Sole Proprietorship");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Partnership");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("LLC/LLP");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("S-Corporation");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Corporation");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Public Corporation");
		Thread.sleep(2000);
		driver.close();
	}

}
