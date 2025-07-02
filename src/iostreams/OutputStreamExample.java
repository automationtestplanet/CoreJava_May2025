package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStreamExample {

	public static void main(String[] args) throws Exception {
		File inputFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\InputFile.txt");

		FileInputStream fis = new FileInputStream(inputFile);
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);

		String str = new String(byteArr);
		System.out.println(str);

		String revStr = new StringBuilder(str).reverse().toString();
		System.out.println(revStr);

		fis.close();

		File outFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\OutputDataFiles\\OutputFile.txt");

		FileOutputStream fos = new FileOutputStream(outFile); // to convert the file data into output stream to store
																// the data

		byte[] byteArr2 = revStr.getBytes(); // convert the string to byte code

		fos.write(byteArr2);

		fos.flush();
		fos.close();

	}

}
