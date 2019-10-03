package com.atmecs.assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.Findloc;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.helper.CommonUtlity;

public class ContextMenu extends TestBase {
	Findloc loc = new Findloc();

	
	public void mouseonService() {
		Actions action = new Actions(driver);
	WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.services.dpdn")));
	Action mouseover = action.moveToElement(wb).build();
	mouseover.perform();
}
	
	public void mouseonDigitalLife() {
		CommonUtlity.isElementVisible(loc.getlocator("loc.digitallife.dpdn"));
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.digitallife2.dpdn")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();
		
	
}
	
	public void mouseonInfraStructur() {
		CommonUtlity.isElementVisible(loc.getlocator("loc.infrastructure.dpdn"));
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.infrastructure.dpdn")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();
		
	}
}