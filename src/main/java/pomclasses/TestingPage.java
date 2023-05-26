package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This classs contains elements and respective business librariesof Testing page
 * @author APOORVA SHEELVANTH
 *
 */
public class TestingPage {
	
	//Declaration
	@FindBy(xpath = "h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id = "python")
	private WebElement pythonImage;
	

	@FindBy(id = "cartArea")
	private WebElement myCart;
	
	@FindBy(xpath = "//ul/descendent::i[@class= 'fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//Utalization
		/**
		 * This method returns page header of selenium training page 
		 * @return
		 */
		public String getPageHeader() {
			return pageHeader.getText();
		}
		
		
		/**
		 * This method is used to getpython image
		 * @return
		 */
	    public WebElement getPythonImage() {
		return pythonImage;
	    }
	
	/**
	 * This method is used to get MyCart area
	 * @return
	 */
	    public WebElement getMyCart() {
			return myCart;
		    }
	    
	    /**
	     * This method is used to get facebook icon
	     * @return
	     */
	    
	    public WebElement getFacebookIcon() {
	    	return facebookIcon;
	    }
	    /**
	     * This method is used to click on facebook icon
	     */
		public void clickFacebook() {
			facebookIcon.click();
		}
	}
		

