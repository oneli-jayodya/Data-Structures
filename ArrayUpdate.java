package dataStructuers;

import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {

		int [] array = new int[10];
		int size=5;
		
		Scanner input = new Scanner(System.in);
		
		//get input from user
		System.out.println("Enter 5 integer Data : ");
		for(int j=0; j<size;j++) {
			array[j]=input.nextInt();
		}
		
		//show user inputs
		System.out.print("Array elements : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		
		//get the index where to update the element
		System.out.print("\nEnter the index : ");
		int index = input.nextInt();
				
		System.out.print("Enter the element : ");
		int element = input.nextInt();
		
		array[index]=element;
		
		//show updated array
		System.out.print("Array Updated elements : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
				
		input.close();
	}

}
