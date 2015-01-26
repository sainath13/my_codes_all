public class BinaryTree{
	Node root;
	public void addNode(int key, String name){
		Node newNode = new Node(key, name);
		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}
				else if(key > focusNode.key){
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}	
				}
			}
		}
	}//end of addNode
	//make the first call with the root 
	public void inOrderTraversal(Node focusNode){
		if(focusNode != null){
			inOrderTraversal(focusNode.leftChild);
			System.out.println(""+focusNode.toString());
			inOrderTraversal(focusNode.rightChild);
		}
	
	}//end of inOrderTraversal


	public void preOrderTraversal(Node focusNode){
		if(focusNode != null){
			System.out.println(""+focusNode.toString());
		
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
		}
	
	}//end of postOrderTraversal

	public void postOrderTraversal(Node focusNode){
		if(focusNode != null){
		
			postOrderTraversal(focusNode.leftChild);
			postOrderTraversal(focusNode.rightChild);
			System.out.println(""+focusNode.toString());
		}
	
	}//end of postOrderTraversal

	public Node findNode(int key){
		Node focusNode = root;
			while(focusNode.key != key){
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
				}
				else{
					focusNode = focusNode.rightChild;
				}
				if(focusNode == null){
					return null;
				}
			}
			return focusNode;
	
	}

	public static void main(String[] args){
		BinaryTree myTree = new BinaryTree();
		myTree.addNode(1,"a");
		myTree.addNode(7,"j");
		myTree.addNode(8,"m");
		myTree.addNode(3,"d");
		myTree.addNode(2,"c");
		myTree.addNode(9,"b");
		myTree.inOrderTraversal(myTree.root);
		System.out.println("searching for 3 returned "+myTree.findNode(3).toString());

	}

}

class Node{
	int key;
	String name;
	Node leftChild;
	Node rightChild;

	Node(int m,String temp){
		this.key = m;
		this.name = temp;
//		this.leftchild = null;//not required
//		this.rightchild = null;//	
	}
	
	public String toString(){
		return (""+this.name+" has key "+this.key);
	}



}
