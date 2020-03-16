package BasicJava;

class int1 implements Displayable
{
	protected int x=100;
	public void show()
	{
		System.out.println("Show method");
	}
	
	public void display()
	{
		System.out.println("Display method");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int1 i1 = new int1();
		i1.show();
		i1.display();
	}

}
