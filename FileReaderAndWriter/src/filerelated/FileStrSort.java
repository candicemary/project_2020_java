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

public class FileStrSort {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			String pathName = "C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt";
			File filename = new File(pathName);
			ArrayList list = new ArrayList();
			/**
			 * List<String> ls = new ArrayList<>();
			 */

			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {// line 一直读读到 line 为空为止
				list.add(line);
				System.out.println(line);
			}

			br.close();
			Collections.sort(list, new Comparator() {// 泛型、、定义list 类型string int double
				public int compare(Object o1, Object o2) {// 任意的两个string
					String s1 = (String) o1;// 将对象o1转成string类型
					String s2 = (String) o2;
					if (s1.length() != s2.length()) {
						return s1.length() - s2.length();// 匿名内部类的目的-排序-冒泡法-两个元素谁大谁小
					}
					return s1.compareTo(s2);
				}
			});
			System.out.println(list);
			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output00.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));
			for (int i = 0; i < list.size(); i++) { // i 从0 开始跑一直跑到list.size-1的这个数组。
				Object aa = list.get(i);//
				String w = (String) aa;
				out.write(w);
			}
			out.close();
		} catch (Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}
	}

}
