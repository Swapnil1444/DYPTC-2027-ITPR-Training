import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\ITPR_Training_phase_2\\src\\abc.txt");
//		FileWriter fw = new FileWriter("C:\\Users\\USER\\eclipse-workspace\\ITPR_Training_phase_2\\src\\abc.txt",true);
//		char[] ch = {'a','b','c','d'};
//		
//		fw.write("Hello World...!!");
//		fw.flush();
		
		FileReader fr = new FileReader(f);
		char ch[] = new char[(int) f.length()];
		fr.read(ch);
//		for(int i=0;i<f.length();i++) {
//			System.out.print(ch[i]);
//		}
//		for (char c : ch) {
//			System.out.print(c);
//		}
		int[] arr= {1,2,3,4};
		for(int a : arr) {
			a = a * 2;
			System.out.print(a);
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		System.out.println();
		
		

	}

}
