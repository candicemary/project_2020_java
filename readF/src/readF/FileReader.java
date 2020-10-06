package readF;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
	
	BufferedReader in;

    public static void main (String[] args) throws FileNotFoundException{
        Scanner fileInput = new Scanner(new File ("‪C:/Users/Candi/Desktop/test_java.txt"));

        while(fileInput.hasNext()){
            String nextLine = fileInput.nextLine();
            Scanner lineInput = new Scanner(nextLine);

            while(lineInput.hasNext()){
                System.out.print(lineInput.next() + " ");            
            }
           System.out.println();
        }
    }
}