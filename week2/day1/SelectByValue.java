package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

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
		WebElement selectindustry = driver.findElementById("createLeadForm_industryEnumId");
		Select industry = new Select(selectindustry);
		industry.selectByValue("IND_AEROSPACE");
		Thread.sleep(2000);
		industry.selectByValue("IND_HARDWARE");
		Thread.sleep(2000);
		industry.selectByValue("IND_SOFTWARE");
		Thread.sleep(2000);
		industry.selectByValue("IND_DISTRIBUTION");
		Thread.sleep(2000);
		industry.selectByValue("IND_FINANCE");
		Thread.sleep(2000);
		industry.selectByValue("IND_GEN_SERVICES");
		Thread.sleep(2000);
		industry.selectByValue("IND_HEALTH_CARE");
		Thread.sleep(2000);
		industry.selectByValue("IND_INSURANCE");
		Thread.sleep(2000);
		industry.selectByValue("IND_MANUFACTURING");
		Thread.sleep(2000);
		industry.selectByValue("IND_MEDIA");
		Thread.sleep(2000);
		industry.selectByValue("IND_NON_PROFIT");
		Thread.sleep(2000);
		industry.selectByValue("IND_REAL_ESTATE");
		Thread.sleep(2000);
		industry.selectByValue("IND_RETAIL");
		Thread.sleep(2000);
		industry.selectByValue("IND_ETAILER");
		Thread.sleep(2000);
		industry.selectByValue("IND_TELECOM");
		Thread.sleep(2000);
		industry.selectByValue("IND_PRESS");
		Thread.sleep(2000);
		driver.close();
	}

}
