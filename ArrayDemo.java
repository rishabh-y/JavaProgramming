//Array Initialisation and printing elements....

import java.io.*;
import java.util.Scanner;

class ArrayDemo{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr1={4,2,3,5,67,90};
		int[] arr2= new int[5];
		System.out.println("Enter 5 elements in array ");
		for(int i=0;i<arr2.length ;i++){
			arr2[i]= scan.nextInt();
		}

		System.out.println("===================================");
		System.out.println("Hard Coded Array");
		for(int ele:arr1){
			System.out.println(ele);
		}
		System.out.println("====================================");
		System.out.println("Soft Coded Array");

		for(int ele:arr2){
			System.out.println(ele);
		}


	}
}