//program to show method override

import java.io.*;

class Year{
	int days;
	public void get(){
		days=365;
		System.out.println("Number of days in year : "+ days);
	}
};

class LeapYear extends Year{
	public void get(){
		days = 366;
		System.out.println("Number of days in leap Year : "+ days);
	}
};

class UseYear{
	public static void main(String[] args){
		Year obj1= new Year();
		LeapYear obj2= new LeapYear();
		obj1.get();
		obj2.get();
	}
}