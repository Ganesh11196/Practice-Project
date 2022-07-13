package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHomePage {

	@FindBy (xpath="(//i[@class='arrow'])[1]")
	private WebElement insProducts;
	@FindBy (xpath="(//i[@class='arrow'])[2]")
	private WebElement reneuProducts;
	@FindBy (xpath="(//i[@class='arrow'])[3]")
	private WebElement claim;
	@FindBy (xpath="(//i[@class='arrow'])[4]")
	private WebElement support;
	
	@FindBy (xpath="//li[@class='ruby-menu-right sign no-border  signin-link']")
	private WebElement signIn;
	
	@FindBy (xpath="(//img[@id='close-by-image'])[2]")
	private WebElement popUp;
	@FindBy (xpath="(//button[@type='button'])[1]")
	private WebElement button1;
	@FindBy (xpath="(//button[@type='button'])[2]")
	private WebElement button2;
	
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[1]")
	private WebElement termLifeIns;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[2]")
	private WebElement healthIns;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[3]")
	private WebElement investmentPlan;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[4]")
	private WebElement carIns;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[5]")
	private WebElement twoWheelerIns;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[6]")
	private WebElement familyHealth;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[7]")
	private WebElement travel;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[8]")
	private WebElement saralJivanBima;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[9]")
	private WebElement returnPlans;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[10]")
	private WebElement childSavings;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[11]")
	private WebElement retirements;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[12]")
	private WebElement groupHealth;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[13]")
	private WebElement oneCrHealth;
	@FindBy (xpath="(//div[@class='shadowHandlerBox'])[14]")
	private WebElement viewProducts;
	
	private WebDriver driver;
	public ApplicationHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void moveToInsuranceProducts() {
		Actions act=new Actions(driver);
		act.moveToElement(insProducts);
		act.perform();
	}
	public void moveToReneuProducts() {
		Actions act=new Actions(driver);
		act.moveToElement(reneuProducts);
		act.perform();
	}
	public void moveToClaim() {
		Actions act=new Actions(driver);
		act.moveToElement(claim);
		act.perform();
	}
	public void moveToSupport(){
		Actions act=new Actions(driver);
		act.moveToElement(support);
		act.perform();
		}
	public void clickOnSignIn() {
		signIn.click();
	}
	public void clickOnPopUp() {
		popUp.click();
	}
	public void clickOnButton1() {
		button1.click();
	}
	public void clickOnButton2() {
		button2.click();
	}
	public void clickOnTermLifeInsurance() {
		termLifeIns.click();
		driver.navigate().back();
	}
	public void clickOnHealthInsurance() {
		healthIns.click();
		driver.navigate().back();
	}
	public void clickOnCarInsurance() {
		carIns.click();
		driver.navigate().back();
	}
	public void clickOnTwoWheelerInsurance() {
		twoWheelerIns.click();
		driver.navigate().back();
	}
	public void clickOnFamilyHealth() {
		familyHealth.click();
		driver.navigate().back();
	}
	public void clickOnTravel() {
		travel.click();
		driver.navigate().back();
	}
	public void clickOnSaralJivanBima() {
		saralJivanBima.click();
		driver.navigate().back();
	}
	public void clickOnReturnPlans() {
		returnPlans.click();
		driver.navigate().back();
	}
	public void clickOnChildSavings(){
		childSavings.click();
		driver.navigate().back();
	}
	public void clickOnRetirements() {
		retirements.click();
		driver.navigate().back();
	}
	public void clickOngroupHealth() {
		groupHealth.click();
		driver.navigate().back();
	}
	public void clickOnOneCroreHealth() {
		oneCrHealth.click();
		driver.navigate().back();
	}
	public void clickOnViewProducts() {
		viewProducts.click();
		driver.navigate().back();
	}	
}

