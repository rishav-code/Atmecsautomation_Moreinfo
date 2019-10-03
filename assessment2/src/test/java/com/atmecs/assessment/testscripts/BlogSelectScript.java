package com.atmecs.assessment.testscripts;

import java.text.ParseException;

import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.pages.BlogSelect;
import com.atmecs.assessment.validations.BlogValidation;

public class BlogSelectScript extends TestBase {

	BlogSelect blogselect= new BlogSelect();
	BlogValidation blogvalidate = new BlogValidation();
	ValidateData vd = new ValidateData ();
	@Test(priority=11)
	public void blogFlow() throws InterruptedException, ParseException {
		blogselect.goToBlog();
		
		blogvalidate.blogTitleValidation();
		blogvalidate.contentValidation();
		blogvalidate.breadcumvalid();
		
		blogvalidate.alertHandle();
		
	}

}
