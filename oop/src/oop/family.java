package oop;

public class family {
		int age;
		String name = " ";
		String myString;
		String[]pets = new String[5];
		
		void shout() {
			age =10;
			myString = new String("Lucy");
			pets[0]= new String("Feifei");
			pets[1]= "Garfiled";
			pets[2]= "xiaokeai";
			pets[3]="Jiafei";
			
			String[]pets= new String[] {"feifei","Garfiled","xiaokeai","Jiafei"};
			System.out.println(myString);
			System.out.println(pets.length);
			
	
	}
		void method2(){
			shout();
			name = "ABC";
			
			System.out.println(name);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		family candice = new family();
		family candice2= new family();
		candice2.age =20;
		candice.age = 30;
		candice.age = 40;
		candice.shout();
		candice.method2();
		System.out.println(candice.age);
		System.out.println(candice2.age);
		

	}

}
