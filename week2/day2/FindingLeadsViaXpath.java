package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLeadsViaXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.findElementByXPath("//form[@id='login']//input").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//form[@id='login']//input)[2]").sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElementByXPath("//form[@id='login']/p[3]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@id='label']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-panel-tc']//a)[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='frameSectionBody']//li[3]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::td[1]").click();
		Thread.sleep(3000);
		String leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']").getText();
		System.out.println(leadid);		
		driver.close();
	}

}
