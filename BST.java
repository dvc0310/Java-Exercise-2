
public class BST<T extends Comparable<T>> {

	private class Node {
		private T data;
		private Node left, right;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node root;

	/* This has been written for you */
	public void add(T x) {
		if (root == null) {
			root = new Node(x);
		} else {
			addHelper(x, root);
		}
	}
	
	/* This has been written for you */
	private void addHelper(T x, Node localRoot) {
		int comparison = x.compareTo(localRoot.data);
		if (comparison < 0) {
			if (localRoot.left == null) {
				localRoot.left = new Node(x);
			} else {
				addHelper(x, localRoot.left);
			}
		} else if (comparison > 0) {
			if (localRoot.right == null) {
				localRoot.right = new Node(x);
			} else {
				addHelper(x, localRoot.right);
			}
		}
	}
	
	
	/* This has been written for you */
	public boolean method1(T x) {
		return method1Helper(x, root);
	}
	
	private boolean method1Helper(T x, Node localRoot) {
		gradingTrace(localRoot);   // leave this statement at the top of this method
		
		if (localRoot == null) {
			return false;
		}

		if (localRoot.data.compareTo(x) == 0) {
			return true;
		} else {
			if (localRoot.data.compareTo(x) > 0) {
				return method1Helper(x, localRoot.left);
			}
			if (localRoot.data.compareTo(x) < 0) {
				return method1Helper(x, localRoot.right);
			}
		}
		return false;
	}
	
	
	/* This has been written for you */
	public int method2() {
		return method2Helper(root);
	}
	
	private int method2Helper(Node localRoot) {
		if (localRoot == null) {
			return 0;
		}
		
		if ((localRoot.right != null && localRoot.left == null) || (localRoot.left != null && localRoot.right== null)) {
			return method2Helper(localRoot.left) + method2Helper(localRoot.right); 
		}else {
			if (localRoot.right != null) {
				return method2Helper(localRoot.right); 
			}
			if (localRoot.left != null) {
				return method2Helper(localRoot.left); 
			}
		}
		
		
		return 1;
	
		
	}	
	
	
	
	
	/* DO NOT MODIFY ANYTHING BELOW THIS POINT */
	
	public String gradingString;
	
	private void gradingTrace(Node n) {
		if (n != null) {
			gradingString += n.data;
		}
	}
	
}
