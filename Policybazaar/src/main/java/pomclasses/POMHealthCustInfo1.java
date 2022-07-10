package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHealthCustInfo1 {
	
	// who would you like to insure?

	@FindBy (xpath="//i[@class='checkbox'])[1]")
	private WebElement  radioSelf;

	@FindBy (xpath="(//i[@class='checkbox'])[2]")
	private WebElement radioSpouse ;

	@FindBy (xpath="(//i[@class='checkbox'])[3]")
	private WebElement radioSon;

	@FindBy (xpath="(//i[@class='checkbox'])[4]")
	private WebElement radioDaughter;

	@FindBy (xpath="(//i[@class='checkbox'])[5]")
	private WebElement radioFather;

	@FindBy (xpath="(//i[@class='checkbox'])[6]")
	private WebElement radioMother;

	@FindBy (xpath="(//i[@class='checkbox'])[7]")
	private WebElement radioGrandFather;

	@FindBy (xpath="(//i[@class='checkbox'])[8]")
	private WebElement radioGrandMother;

	@FindBy (xpath="(//i[@class='checkbox'])[9]")
	private WebElement radioFatherInLaw;

	@FindBy (xpath="(//i[@class='checkbox'])[10]")
	private WebElement radioMotherInLaw;

	@FindBy (xpath="//input[@id='submitButton']")
	private WebElement tabContinue;

	@FindBy (xpath="//a[text()='Privacy Policy']")
	private WebElement linkPolicy;

	@FindBy (xpath="//a[text()='Terms of Use’]")
	private WebElement linkTermsOfUse;

	@FindBy (xpath="//a[text()=’*Disclaimer’]")
	private WebElement linkDisclaimer;

	@FindBy (xpath="(//i[@class='countMinus'])[1]")
	private WebElement linkSonCountMinus;
	@FindBy (xpath="(//i[@class='countPlus'])[1]")
	private WebElement linkSonCountPlus;
	@FindBy (xpath="((//span[@class='memCount'])[1])//span")
	private WebElement linkTotalSonCount;

	@FindBy (xpath="(//i[@class='countMinus'])[2]")
	private WebElement linkDaughterCountMinus;
	@FindBy (xpath="(//i[@class='countPlus'])[2]")
	private WebElement linkDaughterCountPlus;
	@FindBy (xpath="((//span[@class='memCount'])[2])//span")
	private WebElement linkTotalDaughterCount;


	public POMHealthCustInfo1 (WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}

	public void checkRadioSelf ()
	{
	radioSelf.click();
	}
	public void checkRadioSpouse ()
	{
	radioSpouse.click();
	}
	public void checkRadioSon ()
	{
	radioSon.click();
	}
	public void checkRadioDaughter ()
	{
	radioDaughter.click();
	}
	public void checkRadioFather ()
	{
	radioFather.click();
	}
	public void checkRadioMother ()
	{
	radioMother.click();
	}
	public void checkRadioGrandFather ()
	{
	radioGrandFather.click();
	}
	public void checkRadioGrandMother ()
	{
	radioGrandMother.click();
	}
	public void checkRadioFatherInLaw ()
	{
	radioFatherInLaw.click();
	}
	public void checkRadioMotherInLaw ()
	{
	radioMotherInLaw.click();
	}
	public void checkTabContinue ()
	{
	tabContinue.click();
	}
	public void checkLinkPolicy ()
	{
	linkPolicy.click();
	}
	public void checkLinkTermsOfUse ()
	{
	linkTermsOfUse.click();
	}
	public void checkLinkDisclaimer ()
	{
	linkDisclaimer.click();
	}

}
