package DSA;

public class LinkeedList {
    Node head;

    LinkeedList() {
        this.head = null;
    }

    public void createLinkedList() {
        Node node1 = new Node(18);
        this.head = node1;

        Node node2 = new Node(34);
        node1.next = node2;

        Node node3 = new Node(51);
        node2.next = node3;

        Node node4 = new Node(7);
        node3.next = node4;
    }

    public void append(Node newNode) {

		Node current = this.head;

		if (current == null) {
			this.head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}
    
    public void insert(Node newMode, int index) {
        Node current = this.head;

        if (index == 0) {
            newMode.next = this.head;
            this.head = newMode;
        } else {
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }

            if (current != null) {
                newMode.next = current.next;
                current.next = newMode;
            }
        }
    }

    public int delete(int index) {
        Node current = this.head;
        Node previous = null;
        int deletedValue = -1;

        if (index == 0) {
            deletedValue = this.head.data;
            this.head = this.head.next;
        } else {

            for (int i = 0; i < index && current != null; i++) {
                previous = current;
                current = current.next;
            }

            if (current != null) {
                deletedValue = current.data;
                previous.next = current.next;
            }

        }

        return deletedValue;
    }

    public void displayLinkedList(){
        Node current = this.head;
        while (current.next != null) {
            System.out.println(current.data + ",");
            current = current.next;
        }
    }
}
