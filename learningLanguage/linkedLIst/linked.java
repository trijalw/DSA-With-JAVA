class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
};

class Link  {

    // generating node at start
    Node head;
    void GenerationAtStart (int data) {
            Node temp = new Node(data);
            Node tempo;
            if (head != null) {
                tempo = head;
                head = temp;
                head.next = tempo;
                return;
            }
            if (head==null){
            head = new Node(data);
            }
        }

    void InsertionAtEnd (int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (temp == null) {
            head = newNode;
            return;
        }

        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void InsertionInBetween (int data , int pos) {
        Node temp = head;
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if (temp == null) {
            head = newNode;
            return;
        }
        for (int i = 0;i<pos-1 && temp.next!=null;i++) {
            temp = temp.next;
        }

        if (temp.next ==null) {
            System.out.println("Positon does not exist");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    void Traverse () {
        Node temp = head;

        if (temp == null) {
            System.out.println("Insert elements into the linked list first");
            return;
        }
        while (temp !=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            if (temp==null) {
                System.out.println();
            }
        }
    }

    void deleteFirst () {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteNodeAtPosition (int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }        
        Node temp = head;
        for (int i = 0;i<pos-1&&temp!=null;i++) {
            if (temp.next == null) {
                System.out.println("The positon does not exist");
                return;
            }
            temp = temp.next;
            

        }
        if (temp ==null) {
            System.out.println("Position does not exist");
            return;
        }
        temp.next = temp.next.next;
    }
    
    void SearchNode (int key) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        int pos = 0;
        while (temp!=null) {
            if (temp.data == key ) {
                System.out.println("The element is at the positon "+pos);
                return;
            }
            pos ++;
            temp = temp.next;
        }
        System.out.println("Element not present in list");
    }
    void Reverse() {
        Node prev = null;
        Node temp = head;
        Node tempo;
        while (temp != null) {
            tempo = temp.next;  // Store the next
            temp.next = prev;   // Reverse the link
            prev = temp;        // store current in prev
            temp = tempo;       // move current ahead
        }
        head = prev;
        Traverse();
    }
    // Detect cycle in linked list
    void Cycle() {
        
    }

    // Middle of the Linked List
    void Middle() {
        Node temp = head;
        int pos = 0;
        Node tempo = head;
        while (temp!=null) {
            pos ++;
            temp = temp.next;
        }
        pos = pos /2;
        while (pos>-1) {
            if (pos==0) {
                System.out.println(tempo.data);
            }
            tempo = tempo.next;
            pos--;
        }
    }

}


class linked {
    public static void main (String[] args) {
    
        Link link = new Link();
        link.GenerationAtStart(5);
        link.InsertionAtEnd(10);
        link.GenerationAtStart(1);
        link.InsertionInBetween(6, 2);
        link.Traverse();
        link.SearchNode(5);
        link.SearchNode(100);
        link.deleteFirst();
        link.Traverse();
        link.deleteNodeAtPosition(2);
        link.Traverse();
        link.Reverse();
        link.InsertionAtEnd(3);
        link.InsertionAtEnd(10);
        link.InsertionAtEnd(50);
        link.Traverse();
        link.Middle();
    }

    // size tracking do afterwards after learning time complexity
    // insert at beginning (proper) with size tracking
    // edge case handling afterwards
}
