public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.add(3);
        sll.add(4);
        sll.printValues();
        System.out.println("Find Node 10: " + sll.find(10));
        System.out.println("Find Node 8: " + sll.find(8));
        sll.removeAt(2);
        System.out.println("Find Node 10: " + sll.find(10));
        sll.printValues();
        sll.removeAt(4);
    }
}