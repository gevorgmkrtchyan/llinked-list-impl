package simpleLinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(25);
        linkedList.add(84);
        linkedList.add(12);
        linkedList.add(76);

        linkedList.add(44);
        linkedList.addFirst(5);

        linkedList.addAt(93,3);

        //linkedList.deleteFirst();
        //linkedList.deleteAt(3);

        linkedList.print();

        System.out.println("node from getElementByIndex method: " + linkedList.getElementByIndex(3));
        System.out.println("Size is: " + linkedList.size());
    }
}
