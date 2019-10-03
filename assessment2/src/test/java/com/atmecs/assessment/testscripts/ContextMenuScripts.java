package com.atmecs.assessment.testscripts;

import java.text.ParseException;

import org.testng.annotations.Test;

import com.atmecs.assessment.constant.log.ValidateData;
import com.atmecs.assessment.constant.testbase.TestBase;
import com.atmecs.assessment.pages.BlogSelect;
import com.atmecs.assessment.pages.ContextMenu;
import com.atmecs.assessment.validations.ContextMenuValidate;

public class ContextMenuScripts extends TestBase{
	BlogSelect blogselect= new BlogSelect();
	ContextMenu contextmenu = new ContextMenu();
	ContextMenuValidate contextmenuvalidate = new ContextMenuValidate();
	ValidateData vd = new ValidateData();
	
	@Test(priority=10)
	public void contextMenuFlow() throws InterruptedException, ParseException {
		
		contextmenu.mouseonService();
		contextmenuvalidate.servicetMenuValidate();
		
		
		contextmenu.mouseonDigitalLife();
		contextmenuvalidate.digitalLifeMenuValidate();
		contextmenu.mouseonInfraStructur();
		contextmenuvalidate.infastructureMenuValidate();
		
	}

}
