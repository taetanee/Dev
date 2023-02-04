package dev;



public class DevTree {
	private int count = 0;

	public class Node {
		private Object data;
		private Node left;
		private Node right;

		private Node(Object data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}



	public static void main(String[] args) {
		//Node node1 = tree.addNode(1);

	}
}