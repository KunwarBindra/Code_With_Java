package LinkedList;

class CreateList {
    Node head;              // represents the head of a Linked list structure of a particular instance
    private int size;       // represents the size of a Linked list structure of a particular instance
    // CreateList () {      // since size is of int type, by default it will be initialized with 0
    //     this.size = 0;
    // }
    class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    public int getSize() {
        return size;
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void reverseIterativeMethod() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursiveMethod(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursiveMethod(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String []args) {
        CreateList LinkedList = new CreateList();
        LinkedList.addLast(1);
        LinkedList.addLast(2);
        LinkedList.addLast(3);
        LinkedList.addLast(4);
        LinkedList.printList();
        LinkedList.reverseIterativeMethod();
        LinkedList.printList();

        CreateList newList = new CreateList();
        newList.addLast(11);
        newList.addLast(12);
        newList.addLast(13);
        newList.printList();
        Node newHead = newList.reverseRecursiveMethod(newList.head);
        newList.head = newHead;
        newList.printList();
    }
}
