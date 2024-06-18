package dataStructuers;

public class LinkedList {
	   
	   private Node first;

	   // create an empty linked list 
	   public LinkedList(){
	      first = null;
	   }

	   //insert link at the first location
	   public void insertFirst(int key, int data){
	      
	      Node link = new Node(key,data);
	      link.next = first;
	      first = link;
	      
	   }

	   //delete first item
	   public Node deleteFirst(){
		   
	      Node tempLink = first;
	      first = first.next;
	      return tempLink;
	      
	   }

	   //display the list
	   public void display(){
		   
	      Node current = first;
	      System.out.print("( ");
	      while(current != null){
	         current.display();
	         current = current.next;
	         System.out.print(" ");
	      }
	      System.out.print(" )");
	      
	   }

	   //find a link with given key
	   public Node find(int key){
		   
	      Node current = first;

	      if(first == null){
	         return null;
	      }

	      while(current.key != key){
	         //if it is last node
	         if(current.next == null){
	            return null;
	         }else{
	            //go to next link
	            current = current.next;
	         }
	      }      
	      //if data found,
	      return current;
	   }

	   //delete a link with given key
	   public Node delete(int key){
	      
	      Node current = first;
	      Node previous = null;
	      
	      if(first == null){
	         return null;
	      }

	      //navigate through list
	      while(current.key != key){
	         
	         if(current.next == null){
	            return null;
	         }else{
	            previous = current;
	            //move to next link
	            current = current.next;             
	         }
	      }

	      //found a match, update the link
	      if(current == first) {
	         //change first to point to next link
	         first = first.next;
	      }else {
	    
	         previous.next = current.next;
	      }    
	      return current;
	   }


	   //is list empty
	   public boolean isEmpty(){
	      return first == null;
	   }
	   
	   public int length(){
	      int length = 0;
	      for(Node current = first; current!=null;
	         current = current.next){
	         length++;
	      }
	      return length;
	   }
	   
	   public void sort(){
	      int i, j, k, tempKey, tempData ;
	      Node current,next;
	      int size = length();
	      k = size ;
	      for ( i = 0 ; i < size - 1 ; i++, k-- ) {
	         current = first ;
	         next = first.next ;
	         for ( j = 1 ; j < k ; j++ ) {            
	            if ( current.data > next.data ) {
	               tempData = current.data ;
	               current.data = next.data;
	               next.data = tempData ;
		 
		           tempKey = current.key;
		           current.key = next.key;
		           next.key = tempKey;
	            }
	            current = current.next;
	           next = next.next;                        
	         }
	      }
	   }

	   public LinkedList reverse() { 
	      LinkedList reversedlist = new LinkedList();
	      Node nextLink = null;     
	      reversedlist.insertFirst(first.key, first.data);

	      Node currentLink = first;       
	      // insert current link before first and move ahead.
	      while(currentLink.next != null){
	         nextLink = currentLink.next;      
	         reversedlist.insertFirst(nextLink.key, nextLink.data); 
	         currentLink = currentLink.next;            
	      }      
	      return reversedlist;
	   }

	   public void concatenate(LinkedList list){
	      if(first == null){
	         first = list.first;
	      }
	      if(list.first == null){
	         return;
	      }
	      Node temp = first;

	      while(temp.next !=null) {
	         temp = temp.next;
	      }
	      temp.next = list.first;       
	   }
}
