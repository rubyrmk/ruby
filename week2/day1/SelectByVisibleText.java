package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

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
		WebElement selectsource = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(selectsource);
		source.selectByVisibleText("Cold Call");
		Thread.sleep(2000);
		source.selectByVisibleText("Conference");
		Thread.sleep(2000);
		source.selectByVisibleText("Direct Mail");
		Thread.sleep(2000);
		source.selectByVisibleText("Employee");
		Thread.sleep(2000);
		source.selectByVisibleText("Existing Customer");
		Thread.sleep(2000);
		source.selectByVisibleText("Other");
		Thread.sleep(2000);
		source.selectByVisibleText("Partner");
		Thread.sleep(2000);
		source.selectByVisibleText("Public Relations");
		Thread.sleep(2000);
		source.selectByVisibleText("Self Generated");
		Thread.sleep(2000);
		source.selectByVisibleText("Tradeshow");
		Thread.sleep(2000);
		source.selectByVisibleText("Website");
		Thread.sleep(2000);
		source.selectByVisibleText("Word of Mouth");
		Thread.sleep(2000);
		driver.close();
	}

}
