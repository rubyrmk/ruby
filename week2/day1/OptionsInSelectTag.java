package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsInSelectTag {

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
		List<WebElement> industryoptions = industry.getOptions();
		System.out.println(industryoptions.size());
		for (WebElement selectoption : industryoptions) {
			Thread.sleep(2000);
			selectoption.click();
		}
		driver.close();
	}

}
