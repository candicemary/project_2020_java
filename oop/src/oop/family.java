package oop;

public class family {
		int age;
		String myString;
		String[]pets = new String[5];
		
		void shout() {
			myString = new String("Lucy");
			pets[0]= new String("Feifei");
			pets[1]= "Garfiled";
			pets[2]= "xiaokeai";
			pets[3]="Jiafei";
			
			String[]pets= new String[] {"feifei","Garfiled","xiaokeai","Jiafei"};
			System.out.println(myString);
			System.out.println(pets.length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		family strLearn = new family();
		
		strLearn.shout();
		
	}

}
