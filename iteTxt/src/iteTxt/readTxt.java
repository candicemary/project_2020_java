
package iteTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class readTxt implements Iterator<String> {

	// stream being read from
	BufferedReader in;
	// return value of next call to next()
	String nextline;

	// the structure method of TextFileItrator
	public readTxt(String filename) {
		// 打开文件并读取第一行 如果第一行存在获得第一行
		try {
			in = new BufferedReader(new FileReader(filename));
			nextline = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// if the next line is non-null then we have a next line
	@Override
	public boolean hasNext() {
		return nextline != null;
	}

	// return the next line,but first read the line that follows it
	@Override
	public String next() {
		try {
			String result = nextline;
			//if we don't have reached EOF yet
			if (nextline != null) {
				nextline = in.readLine(); // read another line
				if (nextline == null)
					in.close(); // and close on EOF
			}
			return result;
		} catch (IOException e) {
		  throw new IllegalArgumentException(e);
		}
	}
   // we don't need remove the line just read it
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args){
		String filename="‪C:/Users/Candi/Desktop/test.txt";
	    //使用增强for循环进行文件的读取
	    for(String line:new TextFile(filename)){
	    	System.err.println(line);
	    }
	
	}
}