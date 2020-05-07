package simpleLinkedList;

public class LinkedList {
    Node head;
    public void add(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }else {
            Node iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = node;
        }
    }

    public void addFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void addAt(int data, int index){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node iterator = head;
        for (int i = 0; i < index - 1 ; i++) {
            iterator = iterator.next;
        }
        node.next = iterator.next;
        iterator.next = node;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteAt(int index){
        Node iterator1 = head;
        Node iterator2 = head;

        for (int i = 0; i <index -1 ; i++) {
            iterator1 = iterator1.next;
        }
        for (int i = 0; i < index +1 ; i++) {
            iterator2 = iterator2.next;
        }
        iterator1.next = iterator2;
    }

    public int getElementByIndex(int index){
        Node iterator = head;
        for (int i = 0; i < index ; i++) {
            iterator = iterator.next;
        }
        return iterator.data;
    }

    public int size(){
        int count = 0;
        Node iterator = head;
        while (iterator.next != null){
            count++;
            iterator = iterator.next;
        }
        count ++;
        return count;
    }

    public void print(){
        Node iterator = head;
        while (iterator.next != null){
            System.out.println("Node value is: " + iterator.data);
            iterator = iterator.next;
        }
        System.out.println("Node value is: " + iterator.data);
    }
}
