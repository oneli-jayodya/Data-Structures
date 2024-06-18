package dataStructuers;

import java.util.Scanner;

public class ArraySearch {

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
		
		//get search number
		System.out.print("\nEnter the element : ");
		int element = input.nextInt();
		
		//search element
		for(int i=0; i<size; i++) {
			if(array[i] == element) {
				System.out.print("index of the search element : "+array[i]+" = "+i);
				break;
			}
		}
		
		
		input.close();

	}

}
