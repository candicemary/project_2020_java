package filerelated;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class wordsCompareSort {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			String pathName = "C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt";
			File filename = new File(pathName);
			// ArrayList list = new ArrayList();
			List<String> listE = new ArrayList<String>();
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			String str = "";

			while ((str = br.readLine()) != null) {// line 一直读读到 line 为空为止
				String[] subStr = str.split(" ");

				for (int i = 0; i < subStr.length; i++) {
					String strArray = subStr[i];
					listE.add(strArray);
				}

			}

			br.close();
			Collections.sort(listE, new Comparator<String>() {// 泛型、、定义list 类型string int double
				public int compare(String str1, String str2) {// 任意的两个string

					if (str1.length() != str2.length()) {
						return str1.length() - str2.length();// 匿名内部类的目的-排序-冒泡法-两个元素谁大谁小
					} else {
						return str1.compareTo(str2);
					}
				}
			});

			System.out.println(listE);
			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output00.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));
			for (int i = 0; i < listE.size(); i++) { // i 从0 开始跑一直跑到list.size-1的这个数组。
				String aa = listE.get(i);//
				out.write(aa);
				out.newLine();
				out.write("\r\n");
			}
			out.close();
		} catch (Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}

	}
}
