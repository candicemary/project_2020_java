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
			String pathName = "C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\BRead.txt";
			File filename = new File(pathName);
			// ArrayList list = new ArrayList()

			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			List<String[]> listE = new ArrayList<String[]>();
			String str = "";
			Integer inte = null;

			String name = "";

			while ((str = br.readLine()) != null) {// line 一直读读到 line 为空为止 // String
				if (str.startsWith("#")) {

					continue;
				}
				String[] subStr = str.split("\t");
				listE.add(subStr);
			}

			Collections.sort(listE, new Comparator<String[]>() {// 泛型、、定义list 类型string int double
				public int compare(String[] o1, String[] o2) {// 任意的两个string

					double H1 = Double.parseDouble(o1[1]);
					double H2 = Double.parseDouble(o2[1]);

					int com = (int) (H1 - H2);
					return com;// 匿名内部类的目的-排序-冒泡法-两个元素谁大谁小
				}
			});

			int size = listE.size();
			double md = 0;
			if (size % 2 == 1) {
				String[] midNumO = listE.get(size / 2 - 1);

				// 自动转化成double// 从listE 里面拿到数组
				md = Double.parseDouble(midNumO[1]);
			} else {
				String[] midNumO = listE.get(size / 2 - 1);
				String[] midNumE = listE.get(size / 2);
				double Mid2 = Double.parseDouble(midNumE[1]);
				double Mid1 = Double.parseDouble(midNumO[1]);
				md = (Mid1 + Mid2) / 2;

			}

			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output11.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));

			out.write("中位数是：" + md + "\n\n");

			for (int j = 0; j < listE.size(); j++) {
				String[] listRes = listE.get(j);
				String finalRes = "";
				for (int i = 0; i < listRes.length; i++) {
					if (i == 0) {
						finalRes = listRes[i];
					} else {
						finalRes = finalRes + "\t" + listRes[i];
					}
				}
				out.write(finalRes + "\n");
			}
			out.close();
		} catch (

		Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}

	}
}
