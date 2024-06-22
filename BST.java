package dataStructuers;

class TreeNode{
	int data;
	TreeNode leftChild;
	TreeNode rightChild;
}

class BinaryST{
	
	public TreeNode createNewNode(int n) {
		TreeNode a = new TreeNode();
		a.data = n;
		a.leftChild = null;
		a.rightChild = null;
		return a;
	}
	public TreeNode insert(TreeNode node, int value) {
		if(node == null) {
			return createNewNode(value);
		}
		if(value<node.data) {
			node.leftChild = insert(node.leftChild, value);
		}else if(value>node.data) {
			node.rightChild = insert(node.rightChild, value);
		}
		return node;
	}
	public TreeNode delete(TreeNode node, int value) {
		if(node==null) {
			return null;
		}
		
		if(value<node.data) {
			node.leftChild=delete(node.leftChild,value);
		}else if(value>node.data){
			node.rightChild = delete(node.rightChild, value);
		}else {
			if(node.leftChild == null || node.rightChild == null) {
				TreeNode temp = null;
				temp=node.leftChild == null? node.rightChild:node.leftChild;
				
				if(temp==null) {
					return null;
				}else {
					return node;
				}
			}else {
				
				TreeNode success = getSuccess(node);
				node.data = success.data;
				node.rightChild = delete(node.rightChild,4);
				return node;
			}
			
		}
		return node;
	}
	
	public TreeNode getSuccess(TreeNode node) {
		if(node == null) {
			return null;
		}
		
		TreeNode temp = node.rightChild;
		
		while(temp!=null) {
			temp = temp.leftChild;
		}
		return temp;
	}
}

public class BST {

	public static void main(String[] args) {
		BinaryST a = new BinaryST();
		TreeNode root = null;

		a.insert(root, 8);
		a.insert(root, 3);
		a.insert(root, 12);
		a.insert(root, 15);
		
		root = a.delete(root, 1);
	}

}
