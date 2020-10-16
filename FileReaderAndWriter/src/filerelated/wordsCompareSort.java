package filerelated;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class wordsCompareSort {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			String pathName = "C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\BRead.txt";
			File filename = new File(pathName);
			// ArrayList list = new ArrayList()
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			BufferedReader br = new BufferedReader(reader);
			String str = "";
			int minh = 1000;
			int maxh = 1000;
			int minw = 1000;
			int maxw = 1000;
			String name ="";
			
			while ((str = br.readLine()) != null) {// line 一直读读到 line 为空为止
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
				}
				if(maxh<h) {
					int ll = (int) h;
					maxh =ll;
					name =subStr[0];
					
				}
				if(minw>w) {
					int ww =(int)w;
					minw
					
				}
			
			}
			
			br.close();

			File writeWords = new File("C:\\Users\\Candi\\Desktop\\JavaTest\\ReadandWrite\\output00.txt");
			writeWords.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writeWords));

			out.close();
		} catch (Exception e) {
			System.out.println("抛出异常" + e);
			e.printStackTrace();

		}

	}
}
