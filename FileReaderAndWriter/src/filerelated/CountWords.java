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
import java.util.HashMap;
import java.util.List;

public class CountWords {

	public static void main(String[] args) {
		try {
			String pathName = "C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\ARead.txt";
			File filename = new File(pathName);
			// ArrayList list = new ArrayList();
			List<Character> listE = new ArrayList<Character>();
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			String str = "";
			HashMap<Character, Integer> hashMap = new HashMap();
			while ((str = br.readLine()) != null) {// line 一直读读到 line 为空为止
				String[] subStr = str.split(" ");

				for (int i = 0; i < subStr.length; i++) {
					String strArray = subStr[i];
					char[] chars = strArray.toCharArray();// 将字符串转换成字符
					for (char c : chars) {
						if (!hashMap.containsKey(c)) {
							hashMap.put(c, 1);
						} else {
							hashMap.put(c, hashMap.get(c) + 1);
						}
						listE.add(chars[c]);
					}

				}

			}

			br.close();
			Collections.sort(listE, new Comparator<Character>() {// 泛型、、定义list 类型string int double
				public int compare(Character ch1, Character ch2) {// 任意的两个string

					if (ch1 != ch2) {
						return ch1 - ch2;// 匿名内部类的目的-排序-冒泡法-两个元素谁大谁小
					} else {
						return ch1.compareTo(ch2);
					}
				}
			});

			System.out.println(listE);
			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output00.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));
			HashMap<Integer, Character> hashmap = new HashMap<Integer, Character>();

			for (int key : hashMap.keySet()) {

				out.write("Key: " + key + ", Value:" + hashMap.get(key));
				out.write("\r\n");
			}

			out.close();
		} catch (Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}

	}
}
