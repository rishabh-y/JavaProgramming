import java.io.*;

class Patientinfo{
	int age , contact_number;
	String name;
	Patientinfo(){
	age = 12;
	contact_number=92929394;
	name = "Harry";
}
};


class Patient{
	public static void main(String[] args ){
		Patientinfo p1 = new Patientinfo();
		System.out.println("Name : " +p1.name);
		System.out.println("Age : " +p1.age);
		System.out.println("Contact Number : " +p1.contact_number);
	}
}