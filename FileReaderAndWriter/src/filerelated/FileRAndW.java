package small;
import java.io.*;

public class FileRAndW {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt");//创建一个File 
		try (InputStream words = new FileInputStream(file)) {//从外部资源获将数据字节移动到java 程序中----取获取字节流
			
			byte[]data = new byte[1024];// 创建一个长度是1024的byte 类型数组，用来存储读取到的数据
			
			words.read(data);//读取到的数据存储在byte里 . words是指此次实际读取到的字节个数
			System.out.println("File Context:" + new String(data));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
