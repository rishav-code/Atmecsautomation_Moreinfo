package com.atmecs.assessment.constant.log;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.assessment.util.ReadProp;

public class ValidateData {

	static Properties assessment;

	public ValidateData() {
		try {
			assessment = ReadProp.loadProperty(FilePath.VALIDATION_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static String getData(String key) {
		String value = assessment.getProperty(key);
		return value;

	}

}
