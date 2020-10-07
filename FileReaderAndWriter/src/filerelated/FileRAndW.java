package filerelated;
import java.io.*;

public class FileRAndW {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt");//创建一个File 
		try (InputStream words = new FileInputStream(file)) {//从外部资�?获将数�?�字节移动到java 程�?中----�?�获�?�字节�?
			
			byte[]data = new byte[1024];// 创建一个长度是1024的byte 类型数组，用�?�存储读�?�到的数�?�
			
			words.read(data);//读�?�到的数�?�存储在byte里 . words是指此次实际读�?�到的字节个数
			System.out.println("File Context:" + new String(data));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
