package lab6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class fileStremes {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\ITPR_Training_phase_2\\src\\abc1.txt");
		if(f.exists()) {
			System.out.println("file is available...!");
		}
		else {
			System.out.println("file is not found...!");
		}

		f.createNewFile();
		
		FileWriter fw=new FileWriter(f,true);
		fw.write("hello swapnil...! ");
		fw.flush();
		System.out.println("Write file text...!");
		fw.close();
		
		FileReader fr=new FileReader(f);
		char ch[] = new char[(int) f.length()];
		fr.read(ch);
		for (char c : ch) {
      	System.out.print(c);
		}
		
		System.out.println("lenght:"+f.length());
		
		
		
		
		
	}

}
