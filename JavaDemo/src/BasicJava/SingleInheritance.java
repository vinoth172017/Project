package BasicJava;

class Base
{
	int empNo=1000;
	
	void displayEmpNo()
	{
		System.out.println("Emp No: "+empNo);
	}
}

class Derived extends Base
{
	String empName="BLT";
	
	void displayEmpName()
	{
		System.out.println("Emp Name: "+empName);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d1 = new Derived();
		d1.displayEmpNo();
		d1.displayEmpName();
		
		Base b1 = new Base();
		b1.displayEmpName();
	}

}










