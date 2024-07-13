import java.util.NoSuchElementException;

class BSTree{
	BSTNode root;
	
	BSTNode insert (int value, BSTNode node) {
		
		if(node == null) 
			node = new BSTNode(value);
		else if(node.value > value)
			node.left = insert(value, node.left);
		else if(node.value < value)
			node.right = insert(value, node.right);
		else
			throw new IllegalArgumentException("value already in BST");
		
		return node;
	}
	
	void insert(int value){
		root = insert(value, root);
	}
	
	void preOrderTraversal(BSTNode node){
		if(node != null){
			System.out.print(node + ", ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	void postOrderTraversal(BSTNode node){
		if(node != null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node + ", ");
		}
	}
	
	void inOrderTraversal(BSTNode node){
		if(node != null){
			inOrderTraversal(node.left);
			System.out.print(node + ", ");
			inOrderTraversal(node.right);
		}
	}
	
	void traversal(String order){
		System.out.print(order + "order:[");
		if(order == "Pre")
			preOrderTraversal(root);
		else if(order == "Post")
			postOrderTraversal(root);
		else if(order == "In")
			inOrderTraversal(root);
		else
			throw new IllegalArgumentException("Order should Pre, Post or In."); 
		
		System.out.println("]");

	}
	
	BSTNode search(int value, BSTNode node){
		if(node == null)
			throw new NoSuchElementException(value + " is not available.");
		else if(node.value == value)
			return node;
		else if(node.value > value)
			return search(value, node.left);
		else
			return search(value, node.right);

	}
	
	BSTNode search(int value){
		return search(value, root);
	}
	
	BSTNode leftRotate(BSTNode node){
		BSTNode rightChild = node.right;
		node.right = rightChild.left;
		rightChild.left = node;
		return rightChild;
	}
	
	BSTNode rightRotate(BSTNode node){
		BSTNode leftChild = node.left;
		node.left = leftChild.right;
		leftChild.right = node;
		return leftChild;
	}
}

class BSTNode{
	int value;
	BSTNode left;
	BSTNode right;
	
	BSTNode(int value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

public class BSTApplication {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.insert(20);
		bst.insert(10);
		bst.insert(30);
		bst.insert(5);
		bst.insert(15);
		bst.insert(40);
		bst.traversal("Pre");
		System.out.println("Tree is balanced.");
		
		bst.insert(50);
		bst.traversal("Pre");
		System.out.println("Tree is unbalanced - Straight leg detected.");
		bst.search(20).right = bst.leftRotate(bst.search(30));
	}

}
