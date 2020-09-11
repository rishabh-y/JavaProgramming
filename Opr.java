//Compile this file using following command
// javac -d . Opr.java 
//this will create the package in the current directory
//You can also give the path intead of (.) 

package arithmetic.operations;

import java.io.*;

public class Opr{

	public int sum(int a, int b){
		int sum= a + b;
		return sum;
	}

	public int sub(int a, int b){
		int diff = a - b;
		return diff;
	}
}