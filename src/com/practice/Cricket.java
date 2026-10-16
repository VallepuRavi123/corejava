package com.practice;

public class Cricket {
	static String countryName="China";
	static  String boardName;
	int jersyno;
	int age;
	String cricketerName;

	public static void  main(String... args) {
		countryName="India";
		boardName="BCCI";
		int jersy_number=10;
		System.out.println("countryname : "+Cricket.countryName);
		System.out.println("Boardname : "+boardName);
		Cricket a=new Cricket();
		a.age=20;
		a.jersyno=01;
		a.cricketerName="MSD";
		System.out.println("cricketername : "+a.cricketerName);
		System.out.println("JersyNo : "+a.jersyno);
		System.out.println("Age : "+a.age);
		
		Cricket a1=new Cricket();
		a1.age=30;
		a1.jersyno=02;
		a1.cricketerName="VK";
		System.out.println("cricketername : "+a1.cricketerName);
		System.out.println("JersyNo : "+a1.jersyno);
		System.out.println("Age : "+a.age);
		
		Cricket Cricket=new Cricket();
		 String b=Cricket.cricketerName="JADEJA";
		System.out.println(b);
		System.out.println(jersy_number);
	}

}


/*a)cricketerName 
b)jersyNo 
c)age 
d)countryName 
e)boardName*/