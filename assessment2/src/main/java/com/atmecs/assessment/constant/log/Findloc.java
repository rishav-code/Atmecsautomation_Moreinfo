package com.atmecs.assessment.constant.log;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.assessment.util.ReadProp;

public class Findloc {
	static Properties assessment;

	public Findloc() {
		try {
			assessment = ReadProp.loadProperty(FilePath.LOCATOR_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getlocator(String key) {
		String value = assessment.getProperty(key);
		return value;

	}

}
