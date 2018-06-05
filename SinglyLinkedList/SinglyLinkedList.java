public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        if(head == null){
            return;
        }else if(head.next == null){
            this.head = null;
        }else{
            Node runner = head;
            while(runner.next != null){
                if(runner.next.next == null){
                    runner.next = null;
                }else{
                    runner = runner.next;
                }
            }

        }
    }

    public void printValues(){
        if(head == null){
            return;
        }else{
            Node runner = head;
            System.out.println("Values:");
            while(runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

    public Node find(int value){
        Node runner = head;
        while(runner != null){
            if(runner.value == value){
                return runner;
            }else{
                runner = runner.next;
            }
        }
        return runner;
    }

    public void removeAt(int n){
        int count = 0;
        if(n == 0){
            head = head.next;
            return;
        }else{
            count = 1;
            Node runner = head;
            Node after = head.next.next;
            while(runner != null){
                if(count == n){
                    runner.next = after;
                    return;
                }else{
                    count += 1;
                    runner = runner.next;
                    if(runner.next == null || after.next == null){
                        System.out.println("The list isn't that long. No node was removed.");
                        return;
                    }
                    after = after.next;
                }
            }
        }
        
    }
}