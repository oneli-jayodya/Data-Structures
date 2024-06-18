package dataStructuers;

public class Main {

	 public static void main(String args[]){
	      LinkedList list = new LinkedList();
	        
	      list.insertFirst(1, 10);
	      list.insertFirst(2, 20);
	      list.insertFirst(3, 30);
	      list.insertFirst(4, 1);
	      list.insertFirst(5, 40);
	      list.insertFirst(6, 56);

	      System.out.print("\n List: ");  
	      
	      //display list
	      list.display();
	      System.out.println("\n");
	      
	      //delete all
//	      while(!list.isEmpty()){            
//	         Node temp = list.deleteFirst();
//	         System.out.print("Deleted value:");  
//	         temp.display();
//	         System.out.println("");
//	      }         
	      
//	      System.out.print("List after deleting all items: ");          
//	      list.display(); 

	      //find index/node
	      Node foundLink = list.find(3);
	      if(foundLink != null){
	        System.out.print(" Element 30 found: ");  
	         foundLink.display();
	         System.out.println("\n");  
	      }else{
	         System.out.println(" Element not found.\n");  
	      }

	      //delete element
	      list.delete(4);
	      System.out.print(" List after deleting 4 th index: ");  
	      list.display();
	      System.out.println("\n"); 
	      
	      //find element
	      foundLink = list.find(4);
	      if(foundLink != null){
	         System.out.print(" Element found: ");  
	         foundLink.display();
	         System.out.println("");  
	      }else{
	         System.out.print(" Element in 4th index not found.");  
	      }
	      System.out.println("\n");
	      
	      //sort list
	      list.sort();
	      System.out.print(" List after sorting: ");  
	      list.display();
	      System.out.println("\n"); 
	      System.out.print(" Reverse of the list: ");  
	      LinkedList list1 = list.reverse();
	      list1.display();
	      System.out.println("\n"); 
	      
	      LinkedList list2 = new LinkedList();

	      list2.insertFirst(9, 50);
	      list2.insertFirst(8, 40);
	      list2.insertFirst(7, 20);

	      //add
	      list.concatenate(list2);
	      System.out.print(" List after Adding: ");  
	      list.display();
	      System.out.println(""); 
	   }

}
