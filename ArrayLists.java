package dataStructuers;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(10);  //create object from array list
		
		//insert numbers to list
		arr.add(50);
		arr.add(20);
		arr.add(35);
		
		//insert element to giving index
		arr.add(0,45);
		
		//insert element in first
		arr.addFirst(99);
		
		//insert element in last
		arr.addLast(60);
		
		//search the element is in the list
		System.out.println(" \n Is element 30 contains in the list :- "+arr.contains(30));
		
		//show array list
		System.out.println(" Array List : "+arr);
		
		//get element of index 2
		System.out.println(" Element in index 2 : "+arr.get(2));
		
		//get index of element 3
		System.out.println(" Index in element 35 : "+arr.indexOf(35));

		//update element
		arr.set(2, 80);
		System.out.println(" Update index 2 to 80 :- "+arr);
		
		//delete given index element 
		arr.remove(3);
		System.out.println(" Remove index 3:- "+arr);
		
		//delete last element
		arr.removeLast();
		System.out.println(" Remove Last Element:- "+arr);
		
		//delete first element
		arr.removeFirst();
		System.out.println(" Remove First Element:- "+arr);
	}

}
