package dataStructuers;

// A linked list 
class Node {
	public int key;
	public int data;
	public Node next;

	public Node(int key, int data){
	    this.key = key;
	    this.data = data;
	}

	public void display(){
	    System.out.print("["+key+","+data+"]");
	}
}


