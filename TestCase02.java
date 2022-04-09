package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import parametrization.Configuration;

public class TestCase02 {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver driver = new ChromeDriver();
			driver.get(Configuration.appUrl);
			driver.manage().window().maximize();
			
			ExcelSignup xx = new ExcelSignup(driver);
			
			Utility util = new Utility();
			
			 //Tc 01
			 xx.enterFirstname(util.readExcelData(1, 1));
			 xx.enterlastname(util.readExcelData(1, 2));
			 xx.enterEmail(util.readExcelData(1, 3));
			 xx.enterpassword(util.readExcelData(1, 4));
			 xx.selectday(util.readExcelData(1, 6));
			 xx.selectmonth(util.readExcelData(1, 7));
			 xx.selectyear(util.readExcelData(1, 8));
	}

}
