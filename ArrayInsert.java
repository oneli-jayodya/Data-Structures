package dataStructuers;

import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[]args) {
		
		int [] array = new int[10];
		int size=5;
		
		Scanner input = new Scanner(System.in);
		
		//get input from user
		System.out.println("Enter  5 integer Data : ");
		for(int j=0; j<size;j++) {
			array[j]=input.nextInt();
		}
		
		//show user inputs
		System.out.print("Array elements : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		
		//get the index where to add the element
		System.out.print("\nEnter the index : ");
		int index = input.nextInt();
		
		System.out.print("Enter the element : ");
		int element = input.nextInt();
		
		//Increase array size to store new element
		size++;
		
		//put correct index and move other elements
		for(int k=size; k>=index; k--) {
			array[k]=array[k-1];
		}
		array[index]=element;
		
		//show array with new added element
		System.out.print("Array with New Added Elements : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		
		input.close();
		
	}
}
