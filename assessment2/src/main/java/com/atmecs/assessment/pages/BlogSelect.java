package com.atmecs.assessment.pages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;
import com.atmecs.assessment.logreport.LogReport;

public class BlogSelect extends TestBase {
	LogReport log = new LogReport();
	Findloc loc = new Findloc();

	
	public void goToBlog() throws InterruptedException, ParseException {

		Findloc loc = new Findloc();
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.insigts.footer.click")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();

		CommonUtlity.isElementVisible(loc.getlocator("loc.blog.click"));
		CommonUtlity.clickOnElement(loc.getlocator("loc.blog.click"));
	
		WebElement element = driver.findElement(By.xpath(loc.getlocator("loc.1stblog.click")));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
        //CommonUtlity.clickOnElement(loc.getlocator("loc.1stblog.click"));
		
		

		


		
		

//	CommonUtlity.clickOnElement(loc.getlocator("loc.1stblog.click"));
//	Thread.sleep(3000);
//	
//	CommonUtlity.scrollDownPage(300);
//	CommonUtlity.clickOnElement(loc.getlocator("loc.blog.submit.btn"));
//	String popup= driver.switchTo().alert().getText();
//	System.out.println(popup);
//	
	}
}

/*
 * @Test(priority=2) public void selectBlog() throws InterruptedException {
 * 
 * Thread.sleep(10000); boolean
 * cd=CommonUtlity.isElementVisible(loc.getlocator("loc.1stblog.click"));
 * System.out.println(cd);
 * CommonUtlity.clickOnElement(loc.getlocator("loc.1stblog.click"));
 * CommonUtlity.scrollDownPage(300);
 * CommonUtlity.clickOnElement(loc.getlocator("loc.blog.submit.btn")); }
 * 
 * }
 */
