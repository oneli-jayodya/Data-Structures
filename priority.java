package dataStructuers;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(2);
		pq.add(1);
		pq.add(7);
		pq.add(6);
		pq.add(3);
		
		System.out.println(" Prority Queue content : "+pq);
		System.out.println(" Head of queue : "+pq.peek());
		
		pq.remove();
		System.out.println(" Prority Queue content after remove: "+pq);
		
		System.out.print(" Prority Queue : ");
		Iterator <Integer> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.print(pq.remove()+" ");
		}
	}

}
