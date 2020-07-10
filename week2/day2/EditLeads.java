package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("karthi");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
		Thread.sleep(2000);
		String text2 = driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText();
		System.out.println(text2);
		if(text2.equals(driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText())) {
			System.out.println("View Leads page loaded success");
		}else {
			System.out.println("View to load Find Leads page");
		}
		String oldcompany = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(oldcompany);
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("TestLeaf");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='submitButton' and @value='Update']").click();
		Thread.sleep(2000);
		String updatedcompany = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(updatedcompany);
		String s1 = "TestLeaf";
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("karthi");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String Leadid = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").getText();
		String s2 = (s1+" "+"("+Leadid+")");
		//System.out.println(s2);		
		if(s2.contentEquals(updatedcompany)) {
			System.out.println("SUCCESSFULLY Leads are Edited");
		}else {
			System.out.println("FAILED to Edit Leads");
		}
		driver.close();
	}

}
