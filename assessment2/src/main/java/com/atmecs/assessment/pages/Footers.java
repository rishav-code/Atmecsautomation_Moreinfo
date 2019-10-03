package com.atmecs.assessment.pages;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class Footers {
	Findloc loc = new Findloc();
	LogReport log = new LogReport();

	public void clickOnHeaders(int count, String[] ar) {
		switch (count) {
		case 1:
			WebElement wb = CommonUtlity.getElement(loc.getlocator("loc.atmecs.footer.sitemap.txt"));
			sitemapValidation(ar, wb);
			break;

		case 2:
			WebElement wb2 = CommonUtlity.getElement(loc.getlocator("loc.atmecs.footer.services.txt"));
			sitemapValidation(ar, wb2);
			break;
		case 3:
			WebElement wb3 = CommonUtlity.getElement(loc.getlocator("loc.atmecs.footer.careers.txt"));
			sitemapValidation(ar, wb3);
			break;
		case 4:
			WebElement wb4 = CommonUtlity.getElement(loc.getlocator("loc.atmecs.footer.contactus.txt"));
			sitemapValidation(ar, wb4);
			break;

		default:

		}
	}

	public void sitemapValidation(String[] ar, WebElement key) {

		String Sitemap = key.getText();
		String[] actual = Sitemap.split("\n");
		int size = actual.length;
		for (int i = 0; i < size; i++) {

			Assert.assertEquals(actual[i], ar[i], "assertion not done");
			log.info("Assertion done ");

		}

	}
}
