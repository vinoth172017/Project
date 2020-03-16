package BasicJava;

class Polymorphism
{
	int studNo=100;
	
	void displayStud()
	{
		System.out.println("Student No: "+studNo);
	}
	
	void displayStud(String studName)
	{
		System.out.println("Student Name: "+studName);
	}
}


public class MethodOverload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism p1 = new Polymorphism();
		p1.displayStud();
		p1.displayStud("Arun");
	}

}




