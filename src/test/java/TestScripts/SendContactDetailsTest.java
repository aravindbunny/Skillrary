package TestScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibaries.BaseClass;

public class SendContactDetailsTest extends BaseClass {

	@Test
	public void SendContactDetailsTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
				
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getPageLogo().isDisplayed());
		
		home.chooseEnglish();
		Map<String,String> map = excel.readDataFromExcel("sheet1");
		contact.sendDetails(map.get("FullName"), map.get("Email"),
				map.get("Subject"), map.get("Message"));
		
		soft.assertAll();

		
}
}