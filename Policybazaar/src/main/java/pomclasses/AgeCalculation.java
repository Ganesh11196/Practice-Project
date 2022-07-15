package pomclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AgeCalculation {
	Select s;
	@FindBy(xpath="//select[@id='Self']")
	private WebElement self;
	
	@FindBy(xpath="//select[@id='Spouse']")
	private WebElement spouse;
	
	@FindBy(xpath="//select[@id='Son']")
	private WebElement son;
	
	@FindBy(xpath="//select[@id='Daughter']")
	private WebElement daughter;
	
	@FindBy(xpath="//select[@id='Father']")
	private WebElement father;
	
	@FindBy(xpath="//select[@id='Mother']")
	private WebElement mother;
	
	@FindBy(xpath="//select[@id='GrandFather']")
	private WebElement grandfather;
	
	@FindBy(xpath="//select[@id='GrandMother']")
	private WebElement grandmother;
	
	@FindBy(xpath="//select[@id='Father-in-law']")
	private WebElement fatherInLaw;
	
	@FindBy(xpath="//select[@id='Mother-in-law']")
	private WebElement motherInLaw;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement continueButton;
	
	public AgeCalculation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selfAge ()
	{
		s = new Select(self);
		s.selectByValue("32");
	}
	public void spouseAge ()
	{
		s = new Select(spouse);
		s.selectByValue("29");
	}
	public void sonAge ()
	{
		s = new Select(son);
		s.selectByValue("6");
	}
	public void daughterAge ()
	{
		s = new Select(daughter);
		s.selectByValue("4");
	}
	public void fatherAge ()
	{
		s = new Select(father);
		s.selectByValue("60");
	}
	public void motherAge ()
	{
		s = new Select(mother);
		s.selectByValue("55");
	}
	public void grandfatherAge ()
	{
		s = new Select(grandfather);
		s.selectByValue("85");
	}
	public void grandmotherAge ()
	{
		s = new Select(grandmother);
		s.selectByValue("80");
	}
	public void fatherinlawAge ()
	{
		s = new Select(fatherInLaw);
		s.selectByValue("57");
	}
	public void motherinlawAge ()
	{
		s = new Select(motherInLaw);
		s.selectByValue("54");
	}
	public void continuebutton ()
	{
		continueButton.click();
	}
}
