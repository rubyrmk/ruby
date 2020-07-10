package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		System.out.println(text);
		if(text.equals(driver.findElementByXPath("//button[text()='Find Leads']").getText())) {
			System.out.println("Find Leads page loaded success");
		}else {
			System.out.println("Failed to load Find Leads page");
		}
		driver.findElementByXPath("//span[text()='Phone']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("93");
		Thread.sleep(2000);				
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadid = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").getText();
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
		Thread.sleep(2000);
		String text2 = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		System.out.println(text2);
		if(text2.equals(driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText())) {
			System.out.println("View Leads page loaded success");
		}else {
			System.out.println("View to load Find Leads page");
		}
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String Deleted = driver.findElementByXPath("//div[text()='No records to display']").getText();
		String sl = "No records to display";
		if(sl.contentEquals(Deleted)) {
			System.out.println("SUCCESFULLY deleted a lead");
		}else {
			System.out.println("FAILED to delete a lead");
		}
		driver.close();
	}

}
