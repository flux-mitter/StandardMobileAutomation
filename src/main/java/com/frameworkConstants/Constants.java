package com.frameworkConstants;


import lombok.Getter;

public class Constants {
	@Getter
	private static final String PATHTORESOURCES = System.getProperty("user.dir") + "/src/test/resourcess";
	@Getter
	private static final String CONFIGPROPPATH = PATHTORESOURCES + "/config.properties";
	@Getter
	private static final String RUNMANAGERPATH = System.getProperty("user.dir") + "/runManager.xlsx";
	@Getter
	private static final String CONFIGJSONPATH = PATHTORESOURCES + "/jsons/config.json";
	@Getter
	private static final String EXCELPATH = PATHTORESOURCES + "/TestData.xlsx";
	private static final String EXTENTREPORTFOLDERTPATH = System.getProperty("user.dir") + "/ExtentReport-output/";
//	private static String EXTENTREPORTFILETPATH = System.getProperty("user.dir") + "/ExtentReport-output/";
	private static String EXTENTREPORTFILETPATH = "";

	@Getter
	private static final String RUNMANAGERSHEET = "RUNMANAGER";
	@Getter
	private static final String DATASHEET = "DATA";
	@Getter
	private static final int EXPLICITLYWAITTIME = 30;

}
