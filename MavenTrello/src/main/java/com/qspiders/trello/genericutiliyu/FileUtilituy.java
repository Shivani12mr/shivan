package com.qspiders.trello.genericutiliyu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilituy {

	public String readCommondata(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trelo.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;

	}
}
