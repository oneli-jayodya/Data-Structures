package dataStructuers;

import java.util.Scanner;

public class ArrayDelete {

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
		
		//get the index where to remove the element
		System.out.print("\nEnter the index : ");
		int index = input.nextInt();
		
		for(int i=index; i<size; i++) {
			array[i]= array[i+1];
		}
		
		size--;
		
		input.close();
		
		//show array removing deleted element
		System.out.print("After remove Element : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
