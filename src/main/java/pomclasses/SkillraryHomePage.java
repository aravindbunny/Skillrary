package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * This class contains elements and respective business libraries of skillrary home page
 * @author APOORVA SHEELVANTH
 */
public class SkillraryHomePage {

//Declaration

	@FindBy(xpath = "//ul[contains(@class,'home_menu')]/li[1]/a[1]")
	private WebElement dropDown;

	@FindBy(xpath = "//a[text()=' English']")
	private WebElement language;

	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;

	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsTab;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP'")
	private WebElement skillraryDemoAppLink;

//	Initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Utilization
	/*
	 * This method returns skillrary home page logo
	 * 
	 * @return
	 */
	public WebElement getLogo() {
		return logo;
	}

	/*
	 * This method used to click on the gears tab
	 */
	public void clickGearsTab() {
		gearsTab.click();
	}

	/*
	 * This method used to click on the skillrary demo app link
	 */
	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}

	public WebElement chooseEnglish() {
		return language;
	}
}
