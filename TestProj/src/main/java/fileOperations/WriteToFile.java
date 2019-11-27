package fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		String file="C:\\Users\\Admin\\Desktop\\abc.txt";
//		FileWriter fw = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		fw.write("This is first line\n");
//		fw.write("This is 2nd line\n");
//		fw.write("This is 3rd line\n");
//		fw.write("This is 4th line");
//		
//		System.out.println("done!!!!");
//		bw.close();
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		int count=0;
		while((str=br.readLine())!=null)
			
		{
			if(str.contains("This")){
				count++;
//				System.out.println(str);
			}
			
		}
		
		System.out.println("this line appears "+count+" times");
		
	}

}
