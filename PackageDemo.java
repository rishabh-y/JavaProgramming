//First compile the Opr.java file in order ti run this program
//Using javac -d . Opr.java
import arithmetic.operations.Opr;


class PackageDemo{
	public static void main(String[] args){
		int a=10 , b= 3;
		Opr o = new Opr();
		int sum = o.sum(a,b);
		int sub = o.sub(a,b);
		System.out.println("Sum is : "+ sum);
		System.out.println("Difference is : "+ sub);
	}
}
