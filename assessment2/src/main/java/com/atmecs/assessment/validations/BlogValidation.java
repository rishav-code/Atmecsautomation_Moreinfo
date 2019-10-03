package com.atmecs.assessment.validations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.testng.Assert;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class BlogValidation {
	
	Findloc loc = new Findloc();
	LogReport log = new LogReport();
	public void breadcumvalid() {
		Findloc loc = new Findloc();
		LogReport log = new LogReport();
		boolean content = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.content.text"));
		Assert.assertEquals(content, true, "content dosent exist");
		log.info("content is there");
		boolean ai = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.ai.link"));
		Assert.assertEquals(ai, true, "ai dosent exist");
		log.info("ai is there");
		boolean home = CommonUtlity.isDisplayed(loc.getlocator("loc.blog.home.link"));
		Assert.assertEquals(home, true, "homedosent exist");
		log.info("home is there");
		String actual = CommonUtlity.getElement(loc.getlocator("loc.1sblog.name.bfreadcum.txt")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, ValidateData.getData("blog1breadcumText"), "wrong text");
	    log.info("sucessfully validated");
		
	}
	public void blogTitleValidation() {
		String actual=CommonUtlity.getElement(loc.getlocator("loc.1stblog.ttitle")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, ValidateData.getData("1stblogtitle"), "wrong text");
	    log.info("sucessfully title validated");
		
		
	}
	public void contentValidation() {
		String actual=CommonUtlity.getElement(loc.getlocator("loc.blog.content.text")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, ValidateData.getData("1stblogContent"), "wrong text");
	    log.info("sucessfully Content validated");
		
		
	}
//	public void dateDiffValidation() {
//		String actual=CommonUtlity.getElement(loc.getlocator("loc.date.bolg.txt")).getText();
//		System.out.println(actual);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/dd/yyyy");		 
//		 //get current date time with Date()
//		 
//		 LocalDate localDate = LocalDate.parse(actual, formatter);
//		 System.out.println(localDate);
//		 
		 
		 // Now format the date
//		 String date1= dateFormat.format(date);
//		 String date2=dateFormat.(actual);
//		 
//		 // Print the Date
//		 System.out.println(date1);
//		 Duration.between(date, actual);
		 
		
		
//	}
	public void alertHandle() {
		CommonUtlity.scrollDownPage(4500);
		CommonUtlity.clickOnElement(loc.getlocator("loc.blog.submit.btn"));
	
		
		String attribute=CommonUtlity.getElement(loc.getlocator("loc.bolog.comment.txt")).getAttribute("required");
		System.out.println(attribute);
		Assert.assertEquals(attribute, ValidateData.getData("alertMessage"), "no alert  message");
	    log.info("alert message displayed");
		
		
	}
	
}
