package dataStructuers;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

	public static void main(String[] args) {
		
		Deque <Integer> dq = new ArrayDeque<>();
		dq.add(3);
		dq.addLast(5);
		dq.addFirst(4);
		dq.addLast(9);
		
		System.out.println(" Deque content : "+dq);
		System.out.println(" First Deque element : "+dq.element());
		dq.removeFirst();
		System.out.println(" Deque of remove first element : "+dq);
		dq.removeLast();
		System.out.println(" Deque of remove last element : "+dq);
	}

}
