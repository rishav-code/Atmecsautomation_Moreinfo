package com.atmecs.assessment.validations;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class ContextMenuValidate {
	Findloc loc = new Findloc();
	LogReport log = new LogReport();

	public void servicetMenuValidate() {
		System.out.println(loc.getlocator("loc.services.dpdn"));

		WebElement key = CommonUtlity.getElement(loc.getlocator("loc.services.dpdn"));
		String element = key.getText();

		log.info("Redirection validation");
		System.out.println(element);
		Assert.assertEquals(element, ValidateData.getData("ServiceTitle"), "Homepage redirection is not successfull");
		log.info("Successfully redirected to Homepage");
	}

	public void digitalLifeMenuValidate() {
		boolean content = CommonUtlity.isDisplayed(loc.getlocator("loc.digitallife2.dpdn"));
		Assert.assertEquals(content, true, "Digital life dosent exist");
		log.info("Digital life option is there with content");

	}

	public void infastructureMenuValidate() {
		boolean content2 = CommonUtlity.isDisplayed(loc.getlocator("loc.infrastructure.dpdn"));
		Assert.assertEquals(content2, true, "Infrastructure and services dosent exist");
		log.info("Infrastructure and services  option is there with content");

	}

}
