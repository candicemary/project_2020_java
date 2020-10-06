package small;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;


public class BufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 String pathName ="C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt";
	 File filename = new File(pathName);
	 InputStreamReader reader = new InputStreamReader(
			 new FileInputStream(filename));
	 BufferedReader br = new BufferedReader(reader);
	 File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output.txt");
	 	writeWords.createNewFile();
	 BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));
	
	String line = "";
	line = br.readLine();
	while (line != null){
		
		System.out.println(line);
		out.write(line);
		out.flush();	
		line = br.readLine();
	}
	
	out.close();
	
 } catch(Exception e) {
	 e.printStackTrace();
 }
 
	}

	}

