package com.atmecs.assessment.testscripts;

import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.dataprovider.TestDataInputOne;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.pages.BlogSelect;
import com.atmecs.assessment.pages.ContextMenu;
import com.atmecs.assessment.pages.Footers;

public class FootersScript extends TestBase{
	public static int count=0;
	Footers Footer = new Footers();
	

	Findloc loc = new Findloc();
	ValidateData vd = new ValidateData();


	@Test(priority = 2, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void homefooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.home.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 3, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void aboutusfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.aboutus.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 4, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void ServicesfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.services.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 5, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void patenersfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.partners.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 6, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void mediafooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.media.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 7, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void insightsfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.insight.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 8, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void careersfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.career.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

	@Test(priority = 9, dataProvider = "footervalidation", dataProviderClass = TestDataInputOne.class)
	public void contactfooterValidation(String[] ar) {
		if (count == 0) {
			CommonUtlity.clickElement(loc.getlocator("loc.contactus.header.click"));
		}
		count++;
		Footer.clickOnHeaders(count, ar);
		if (count == 4) {
			count = 0;

		}
	}

}
