package dev;



/* https://velog.io/@frombozztoang/Java-Linked-List-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0 */

public class DevLinkedList {

	public class LinkedList {
		// 첫번째 노드를 가리키는 필드
		private Node head;
		private Node tail;
		private int size = 0;

		private class Node {
			private Object data; //데이터가 저장될 필드
			private Node next;     //다음 노드를 가리키는 필드

			public Node(Object input) {
				this.data = input;
				this.next = null;
			}

			public String toString() { //노드의 내용 출력
				return String.valueOf(this.data);
			}
		}


		public void addFirst(Object input){
			Node newNode = new Node(input); //노드 생성

			newNode.next = head; //새로운 노드의 다음 노드로 헤드를 지정

			head = newNode; //head를 새로운 노드로 지정
			size++;

			if(head.next == null)
				tail = head;
		}

		Node node(int index) {
			Node x = head;
			for(int i = 0; i < index; i++)
				x = x.next;
			return x;
		}

		public void add(int k, Object input){
			// k = 0이면 첫 번째 노드에 추가하는 것, addFirst 사용
			if(k==0)
				addFirst(input);
			else {
				Node temp1 = node(k-1); //k-1번째 노드를 temp1로 지정
				Node temp2 = temp1.next; //k번째 노드를 temp2로 지정

				Node newNode = new Node(input);
				temp1.next = newNode; //temp1의 다음 노드로 새로운 노드를 지정
				newNode.next = temp2; //새로운 노드 다음 노드로 temp2 지정
				size++;

				if(newNode.next == null)
					tail = newNode;
				//새로운 노드의 다음 노드가 없다면
				//새로운 노드가 마지막 노드이기 때문에
			}

		}


		public Object removeFirst() {
			Node temp = head; //첫번째 노드를 head로 지정
			head = temp.next; //head의 값을 두번째 노드로 변경

			Object returnData = temp.data; //데이터 삭제 전 리턴할 값을 임시 변수에 담아둔다.
			temp = null;
			size--;
			return returnData;
		}

		public Object remove(int k) {
			if(k == 0)
				return removeFirst();

			Node temp = node(k-1); //k-1번째 node를 temp의 값으로 지정

			Node todoDeleted = temp.next;
			//삭제할 노드를 todoDeleted에 기록
			// 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없다.

			temp.next = temp.next.next;
			//삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정한다.

			Object returnData = todoDeleted.data;
			//삭제된 데이터를 리턴하기 위해서 returnData에 저장한다.

			if(todoDeleted == tail)
				tail = temp;

			todoDeleted = null;
			size--;
			return returnData;
		}

		public int size() {
			return size;
		}

		public Object get(int k){
			Node temp = node(k);
			return temp.data;
		}
	}


	public static void main(String[] args) {
		DevLinkedList a = new DevLinkedList();
		a.realMain();

	}
	private void realMain(){
		LinkedList l = new LinkedList();


		//[error] l.add(100, new Object());
		l.add(0,"a");
		l.add(1,"b");
		l.add(2,"c");
		l.add(3,"d");
		l.add(4,"e");
		l.add(3, "f");

		//[error] l.remove(200);
		l.remove(0);

		//[error] l.get(100);
		l.get(0);

		l.size();
	}


}