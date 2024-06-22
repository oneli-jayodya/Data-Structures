package dataStructuers;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {

		Queue <Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(8);
		q.add(4);
		System.out.println("Queue content is - "+q);
		System.out.println("Queue first element is - "+q.element());
		q.remove();
		System.out.println("After remove Queue content is - "+q);
		System.out.println("Update Queue first element is - "+q.element());
	}

}
