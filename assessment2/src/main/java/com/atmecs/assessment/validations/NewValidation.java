package com.atmecs.assessment.validations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;


public class NewValidation  {
	static Findloc loc = new Findloc();
	static LogReport log = new LogReport();
	
	public static void redirectionPageValidation(String expectedtitle,WebDriver driver) {
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle, "Redirection of page is unsuccesful");
		log.info("Page redirect to properpage");
		}

	public static void breadcrubValidation(String expectedbreadcrumb) {
		String actualbreadcrub=CommonUtlity.getElement(loc.getlocator("loc.breadcrumb.txt")).getText();
		System.out.println(actualbreadcrub);
		Assert.assertEquals(actualbreadcrub,expectedbreadcrumb,"Breadcrumb is not matched");
		log.info("Breadcrumb validate properly");
		}
}
