package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import genericLibaries.BaseClass;

public class AddTestingCourseToMyCartTest extends BaseClass {
	
	@Test
	public void addPythonToMyCart() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
				
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		
		demoApp.selectCategory(web,1);
		
		soft.assertEquals(selenium.getPageHeader(), "Testing");
		
		web.scrollToElement(testing.getPythonImage());
		web.dragAndDropElement(testing.getPythonImage(), testing.getMyCart());
		
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebook();

		soft.assertAll();
		
	}

	}



