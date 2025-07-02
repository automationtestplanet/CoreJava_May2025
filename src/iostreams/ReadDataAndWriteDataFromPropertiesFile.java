package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadDataAndWriteDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		File propertiesFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\TestData.properties");
		FileInputStream fis = new FileInputStream(propertiesFile);

		Properties properties = new Properties();
		properties.load(fis);

		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("location"));
		System.out.println(properties.getProperty("roll.number"));
		System.out.println(properties.getProperty("qualification"));

		properties.setProperty("qualification", "Master Degree");
		System.out.println(properties.getProperty("qualification"));

		FileOutputStream fos = new FileOutputStream(propertiesFile);
		properties.store(fos, "Updated by Raju");
		fos.close();
		fis.close();
	}

}
