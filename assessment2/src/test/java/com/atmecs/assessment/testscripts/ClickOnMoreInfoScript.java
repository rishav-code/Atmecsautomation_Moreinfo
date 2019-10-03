package com.atmecs.assessment.testscripts;

import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.dataprovider.TestDataInputThree;
import com.atmecs.assessment.dataprovider.TestDataInputTwo;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.validations.NewValidation;

public class ClickOnMoreInfoScript extends TestBase{
	@Test(priority = 1, dataProvider = "Explorenow", dataProviderClass = TestDataInputThree.class)
	public void clickOnExploreNow(String title,String breadcrumb) {
		
		CommonUtlity.clickElement((loc.getlocator("loc.exploremore.click")));
		String exploreactualtitle=driver.getTitle();
		System.out.println(exploreactualtitle);
		NewValidation.redirectionPageValidation(title, driver);
		NewValidation.breadcrubValidation(breadcrumb);
		driver.navigate().back();
		
		
	}
	int count = 0;

	public Findloc loc = new Findloc();
	

	@Test(priority = 2, dataProvider = "breadcrum", dataProviderClass = TestDataInputTwo.class)
	public void clickOnMoreInfo(String title, String breadcrumb) {
		
	
		    count++;
			CommonUtlity.scrollIntoview((loc.getlocator("loc.moreinfo.common.click")).replace("xxx", "" + count));
			CommonUtlity.scrollDownPage(-300);
			CommonUtlity.clickElement((loc.getlocator("loc.moreinfo.common.click")).replace("xxx", "" + count));
			String titleqw =driver.getTitle();
			System.out.println(titleqw);
			NewValidation.redirectionPageValidation(title, driver);
			NewValidation.breadcrubValidation(breadcrumb);
			driver.navigate().back();

}
}