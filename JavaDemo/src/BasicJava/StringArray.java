package BasicJava;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String StringArray[] = new String[10];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total no of Strings");
		int totalStrings = sc.nextInt();
		
		System.out.println("Enter the list of strings");
		for(int i=0;i<totalStrings;i++)
		
			StringArray[i]=sc.next();

		System.out.println("The list of strings you entered is: ");
		for(int i=0;i<totalStrings;i++)
			System.out.println(StringArray[i]);
		
	}
}





