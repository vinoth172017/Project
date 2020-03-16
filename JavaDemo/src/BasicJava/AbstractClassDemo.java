package BasicJava;

abstract class Base
{
	int empNo=1000;
	String empName="Chandru";
	
	abstract void display();
	
	void displayName()
	{
		System.out.println("The Name is: "+empName);
	}
}

class Derived extends Base
{
	void display()
	{
		System.out.println("in Derived Class");
	}
	
	void displaySalary()
	{
		System.out.println("Salary: "+1000);
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Base b1 = new Base();
	
	Derived d1 = new Derived();
	d1.display();
	
	
	}

}
