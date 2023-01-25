package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;

		try {
			fis = new FileInputStream(new File("./src/test/resources/TestData/readData.properties"));
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
		return properties.getProperty(key);
	}
}