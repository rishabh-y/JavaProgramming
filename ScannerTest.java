import java.io.*;
import java.util.Scanner;

class ScannerTest{

	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Enter RollNO : ");
		int rollNo = scan.nextInt();
		System.out.println("Enter your name : ");
		String name = scan.next();
		System.out.println("Enter the fees: ");
		double fees = scan.nextDouble();
		System.out.println("===========================");
		System.out.println("Name : " + name +"\n" + "RollNO: "+rollNo+"\n"+"Fees: "+ fees );
	}
}