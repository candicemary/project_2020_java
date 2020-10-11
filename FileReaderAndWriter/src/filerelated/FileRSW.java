package filerelated;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 将文件中的字符串读取出来，然后对字符串进行排序，排序完成后写入到另一个文件中
 * 
 * 分析：
 * 		1.读取文件数据，使用字符流
 * 		2.读取出字符串
 * 		3.将读出来的字符串转换为字符数组
 * 		4.对字符数组进行排序
 * 		5.排序后，将数据写入另一个文件中
 */
public class FileRSW {
	public static void main(String[] args) throws IOException{
		//读取文件数据，使用字符流，方便
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\RSW.txt"));
		
		//读取出字符串
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while(-1 != (ch = br.read())) {
			sb.append((char)ch);
		}
		String oldStr = sb.toString();
		
		//将读出来的字符串转换为字符数组
		char[] arrch = oldStr.toCharArray();
		
		//对字符数组进行排序
		Arrays.sort(arrch);
		
		//排序后，将数据写入新文件中
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\outputRSW.txt"));
		StringBuilder sb2 = new StringBuilder();
		for(char c : arrch) {			
			sb2.append(c);
		}
		bw.write(sb2.toString());
		bw.flush();
		bw.close();
		
		System.out.println("Writing in to txt file done.");
	}
}
