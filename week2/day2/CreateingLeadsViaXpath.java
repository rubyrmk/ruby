package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateingLeadsViaXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a)[32]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='companyName' and @class='inputBox']").sendKeys("TestLeaf");
		driver.findElementByXPath("//input[@name='firstName'][@class='inputBox']").sendKeys("Gayathri");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Gopalan");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='submitButton']").click();
		Thread.sleep(3000);
		driver.close();
	}

}
