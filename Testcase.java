package project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import parametrization.Configuration;

public class Testcase {
	
	WebDriver driver;         //Global variable
	UtilityClass utl;
	TestData data;
	
	
	
	@BeforeClass
	public void openBrowser() {
		
	    BaseClass base = new BaseClass();// Base Class object
		base.driverInit();
		
		driver = new ChromeDriver();                          
		                                                      
		utl= new UtilityClass();    //UtilityClass object    
		                                                      
		data= new TestData(driver);
	}
	
	@AfterClass
	public void Closebrowser() {
		
	driver.close();
	}
	
	@BeforeMethod
	public void LoginToApp() {
		driver.get(Configuration.appUrl);
	}
	
	@AfterMethod
	public void RefreshPage() throws InterruptedException {
		driver.navigate().refresh();
		
		Thread.sleep(4000);
	}
	
	@Test(priority = -1)
	public void SignupTC01() throws EncryptedDocumentException,  IOException {
		data.enterFirstName(utl.readExcelData(1, 1));
		data.enterLastName(utl.readExcelData(1, 2));
		data.enterEmailID(utl.readExcelData(1, 3));
		data.enterPassword(utl.readExcelData(1, 5));
		data.selectDay(utl.readExcelData(1, 6));
		data.selectMonth(utl.readExcelData(1,7));
		data.selectYear(utl.readExcelData(1, 8));
		data.ClickOnRadioF();
		data.ClickOnRadioM();
		data.ClickOnSignUp();
	}
	
	@Test(priority= 1)
	public void signupTC02() throws EncryptedDocumentException,  IOException {
		data.enterFirstName(utl.readExcelData(4, 1));
		data.enterLastName(utl.readExcelData(4, 2));
		data.enterEmailID(utl.readExcelData(4, 3));
		data.enterPassword(utl.readExcelData(4, 5));
		data.selectDay(utl.readExcelData(4, 6));
		data.selectMonth(utl.readExcelData(4,7));
		data.selectYear(utl.readExcelData(4, 8));
		data.ClickOnRadioF();
		data.ClickOnRadioM();
		data.ClickOnSignUp();
	}
	
	@Test(priority=3)
	public void signuoTC03()throws EncryptedDocumentException,  IOException {
		data.enterFirstName(utl.readExcelData(3, 1));
		data.enterLastName(utl.readExcelData(3, 2));
		data.enterEmailID(utl.readExcelData(3, 3));
		data.enterPassword(utl.readExcelData(3, 5));
		data.selectDay(utl.readExcelData(3, 6));
		data.selectMonth(utl.readExcelData(3,7));
		data.selectYear(utl.readExcelData(3, 8));
		data.ClickOnRadioF();
		data.ClickOnRadioM();
		data.ClickOnSignUp();
	}
	
	@Test(priority=4)
	public void signuoTC04()throws EncryptedDocumentException,  IOException {
		data.enterFirstName(utl.readExcelData(5, 1));
		data.enterLastName(utl.readExcelData(5, 2));
		data.enterEmailID(utl.readExcelData(5, 3));
		data.enterPassword(utl.readExcelData(5, 5));
		data.selectDay(utl.readExcelData(5, 6));
		data.selectMonth(utl.readExcelData(5,7));
		data.selectYear(utl.readExcelData(5, 8));
		data.ClickOnRadioF();
		data.ClickOnRadioM();
		data.ClickOnSignUp();
	
	}
	
}
