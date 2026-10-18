package app.services;

import app.utils.CommonUtils;

public class UpperCaseService extends CommonUtils {
	// Relationship -> IS A Relationship

	public static void convertAndShow(String value) {
		var upperValue = CommonUtils.toUpperCase(value);
		System.out.println(upperValue);
	}
}