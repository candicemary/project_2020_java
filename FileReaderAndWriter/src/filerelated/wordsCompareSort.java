package filerelated;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
			List<String> listE = new ArrayList<String>();
			String str = "";
			Integer inte = null;
			int minh = 1000;
			int maxh = 1000;
			int minw = 1000;
			int maxw = 1000;
			String name = "";

			while ((str = br.readLine()) != null) {// line 一直读读到 line 为空为止
				listE.add(str);
				if (str != null) {
					inte = Integer.valueOf(str);
				}
				if (str.startsWith("#")) {
					continue;
				}
				String[] subStr = str.split("\t");
				String height = subStr[1];
				String weight = subStr[2];

				double h = Double.parseDouble(height);
				double w = Double.parseDouble(weight);
				if (minh > h) {
					int ll = (int) h;
					minh = ll;
					name = subStr[0];
				}
				if (maxh < h) {
					int ll = (int) h;
					maxh = ll;
					name = subStr[0];

				}
				if (minw > w) {
					int ww = (int) w;
					minw = ww;
					name = subStr[0];
				}
				if (maxw > w) {
					int mw = (int) w;
					maxw = mw;
					name = subStr[0];
				}

			}

			Collections.sort(listE);
			int size = listE.size();
			if (size % 2 == 1) {

			}

			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output11.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));
			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				out.write(line);
			}

			out.close();
		} catch (Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}

	}
}
