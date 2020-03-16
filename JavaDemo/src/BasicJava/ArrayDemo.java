package BasicJava;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalNos;
		int intArray[] = new int[10];
		
		System.out.println("Enter the total no of Numbers");
		Scanner sc = new Scanner(System.in);
		totalNos=sc.nextInt();
	
		System.out.println("Enter the list of numbers");
		// To read list of number in the array intArray[]
		for(int i=0; i< totalNos;i++)
		intArray[i]=sc.nextInt();
	
		System.out.println("The list of numbers in the array");
		//To print list of numbers in the array intArray[]
		for(int i=0;i<totalNos;i++)
		System.out.println(intArray[i]);
		
	}

}
