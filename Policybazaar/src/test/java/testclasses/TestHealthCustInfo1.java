package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pomclasses.POMHealthCustInfo1;

public class TestHealthCustInfo1 {
	WebDriver driver; POMHealthCustInfo1 submit;

	@Parameters("browserName")

	@BeforeTest
	public void launchBrowser(String browser)
	{
	if (browser.equals("Chrome"))
	{
	WebDriver  driver=new ChromeDriver();
	}
	if (browser.equals("Firefox"))
	{
	WebDriver  driver=new FirefoxDriver();
	}
	if (browser.equals("Opera"))
	{
	WebDriver  driver=new OperaDriver();
	}
	if (browser.equals("Ie"))
	{
	WebDriver  driver=new InternetExplorerDriver();
	}
	}
	@BeforeClass
	public void allObjects()
	{
	driver = new ChromeDriver();
	submit = new POMHealthCustInfo1(driver);
	}

	@BeforeMethod
	public void loginToApplication()
	{
	driver.get("https://health.policybazaar.com/?pq=health0&new=1&utm_content=home_v12");
	driver.manage().window().maximize();
	}

	@Test
	public void customInfoClickable()
	{
		submit.checkRadioSelf();
	submit.checkRadioSpouse ();
	submit.checkRadioSon ();
	submit.checkRadioDaughter ();
	submit.checkRadioFather ();
	submit.checkRadioMother ();
	submit.checkRadioGrandFather ();
	submit.checkRadioGrandMother ();
	submit.checkRadioFatherInLaw ();
	submit.checkRadioMotherInLaw ();
	submit.checkTabContinue ();
	submit.checkLinkPolicy ();
	submit.checkLinkTermsOfUse ();
	submit.checkLinkDisclaimer ();

	}
	@AfterMethod
	public void logoutApplication()
	{
		
	}
	@AfterClass
	public void clearAllObjects()
	{
		
	}
	@AfterTest
	public void clearDriver()
	{
	driver.gc();
	driver=null;
	driver.close();
	}

}
