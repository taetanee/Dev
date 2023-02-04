package dev;


/* 참고 : https://readerr.tistory.com/35 */

public class DevTree {
	private int count;

	DevTree(){
		count = 0;
	}

	private Node addNode(Object data){
		Node n = new Node(data);
		return n;
	}

	private class Node {
		private Object data;
		private Node left;
		private Node right;

		private Node(Object data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public void addLeft(Node node) {
			this.left = node;
			count++;
		}

		public void addRight(Node node) {
			this.right = node;
			count++;
		}

		public void deletLeft() {
			this.left = null;
			count--;
		}

		public void deletRight() {
			this.left = null;
			count--;
		}
	}

	private void preOrder(Node node) {
		if( node == null ){
			return;
		}
		System.out.print(node.data + " , ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if(node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " , ");
		inOrder(node.right);
	}

	private void postOrder(Node node) {
		if(node == null) {
			return;
		}

		inOrder(node.left);
		inOrder(node.right);
		System.out.print(node.data + " , ");
	}

	public static void main(String[] args) {
		DevTree devTree = new DevTree();
		Node node1 = devTree.addNode(1);
		Node node2 = devTree.addNode(2);
		Node node3 = devTree.addNode(3);
		Node node4 = devTree.addNode(4);
		Node node5 = devTree.addNode(5);
		Node node6 = devTree.addNode(6);
		Node node7 = devTree.addNode(7);

		/*  트리 모양
		 *        1
		 *     2     3
		 *   4  5  6   7
		 */
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);

		//순회
		devTree.preOrder(node1); //전위 순회 (1,2,4,5,3,6,7)
		System.out.println();
		devTree.inOrder(node1); //중위 순회 (4,2,5,1,3,6,7)
		System.out.println();
		devTree.postOrder(node1); //후위 순회 (4,5,2,6,7,3,1)
		System.out.println();



	}
}