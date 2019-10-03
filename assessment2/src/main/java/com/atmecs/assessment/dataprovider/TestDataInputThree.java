package com.atmecs.assessment.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.assessment.constant.log.FilePath;
import com.atmecs.assessment.util.ProvideData;

public class TestDataInputThree {
	@DataProvider(name = "Explorenow")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE2, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}



}
