package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {

		File inputFile = new File(
				"E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJava_May2025\\InputDataFiles\\InputFile.txt");
		
		FileInputStream fis = new FileInputStream(inputFile);  // input stream, it is series of 0/1-> byte code
		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];  // it stores the data in the form of ASCII codes
		fis.read(byteArr);
		
		for(byte eachByte : byteArr)
			System.out.print(eachByte+"  ");
		System.out.println("");
		
		String str = new String(byteArr);
		System.out.println(str);
		
	}

}
