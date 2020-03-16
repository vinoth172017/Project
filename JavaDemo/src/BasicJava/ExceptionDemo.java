package BasicJava;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=6,c;
		String name="dsf";
		try {
		//c=a/(b-6);
		//System.out.println(name.length());
		
		int x=Integer.parseInt(name);
		//System.out.println("C value is: "+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetice Excepton");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null Pointer Exception");
		}catch(NumberFormatException nfe)
		{
			System.out.println("Number Format Excepton");
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
		}
	

}
