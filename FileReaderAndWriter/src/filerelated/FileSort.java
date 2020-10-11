package filerelated;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
 
public class FileSort {
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\a.txt");
        if(!file.exists())
            throw new RuntimeException("文件不存在！");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\b.txt"));
        String str = null;
        List<String> list = new ArrayList<String>();
        while((str=br.readLine())!=null){
            list.add(str);
        }
        String[] arr = new String[list.size()];
        TreeSet<Student> tr = new TreeSet<Student>();
        arr = list.toArray(arr);
        for(int i = 0; i < arr.length; i++){
            String[] line = arr[i].split(" +");
            for(int j = 0; j < line.length; j++){
                if(i == 0)
                    bw.write(line[j]+"\t");
                else{
                    tr.add(new Student(Integer.parseInt(line[0]),
                            line[1],Integer.parseInt(line[2]),
                            Integer.parseInt(line[3]),Integer.parseInt(line[4]),
                            (Integer.parseInt(line[2])+Integer.parseInt(line[3])+Integer.parseInt(line[4])/3),
                            (Integer.parseInt(line[2])+Integer.parseInt(line[3])+Integer.parseInt(line[4]))));
                }
            }
            System.out.println();
        }
        bw.write("\r\n");
        int num = 1;
        for(Iterator<Student> it = tr.iterator(); it.hasNext();){
            bw.write(it.next().toString());
            bw.write("\t"+(num++)+"\r\n");
        }
        bw.close();
    }
}
class Student implements Comparable<Student>{
    private int num;
    private String name;
    private int yw;
    private int sx;
    private int english;
    private int pj;
    private int sum;
    public Student(int num,String name,int yw,int sx,int english,int pj, int sum){
        this.num = num;
        this.name = name;
        this.yw = yw;
        this.sx = sx;
        this.english = english;
        this.pj = pj;
        this.sum = sum;
    }
    public int compareTo(Student stu) {
        int num = Integer.valueOf(stu.sum).compareTo(Integer.valueOf(this.sum));
        if(num == 0)
            return Integer.valueOf(stu.num).compareTo(Integer.valueOf(this.num));
        return num;
    }
    public String toString(){
        return num+"\t"+name+"\t"+yw+"\t"+sx+"\t"+english+"\t"+pj+"\t"+sum;
    }
}