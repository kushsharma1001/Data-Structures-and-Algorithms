#### LINKEDLIST METHODS: 
![LinkedList Methods](https://user-images.githubusercontent.com/22798697/120899268-781e5500-c64c-11eb-9f3b-d4edda894fa7.jpg)

class Boot {

    public static void main(String args[])
    {   StackBasedLinkedList list1 =new StackBasedLinkedList();
        list1.add(100);
        list1.add(101);
        list1.add(102);
        list1.printList();
        System.out.println("POLLED LAST: " + list1.pollLast());
        System.out.println("POLLED FIRST: " + list1.pollFirst());

        QueueBasedLinkedList list2 =new QueueBasedLinkedList();
        list2.add(200);
        list2.add(201);
        list2.add(202);
        list2.printList();
        System.out.println("POLLED LAST: " + list2.pollLast());
        System.out.println("POLLED FIRST: " + list2.pollFirst());
    }
}

class Node <T>{
    T data;
    Node next;

    Node(T val){
        data = val;
    }
}

//Stack based impl of Linkedlist   Add 1 : 1->null, Add 2:  2->1->null, Add 3: 3->2->1->null  its filo. first is 1 and last is 3.
class StackBasedLinkedList<T> {

    Node head;

    public void add(T element){
        Node temp = new Node(element);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    public void printList(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public T pollLast(){  //retrieves and removes first element.  1, 2 , 3 -->  3
        if(this.head == null)
            return null;

        Node temp = head;
        head = head.next;
        return (T) temp.data;
    }

    public T pollFirst(){  //retrieves and removes first element.  1, 2 , 3 -->  1
        if(this.head == null)
            return null;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        return (T) temp.data;
    }

}

//Queue based impl of Linkedlist   Add 1 : 1->null, Add 2:  1->2->null, Add 3: 1->2->3->null   its fifo.
class QueueBasedLinkedList<T> {

    Node head;

    public void add(T element){
        Node temp = new Node(element);
        if(head == null){
            head = temp;
        }
        else{
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = temp;
        }
    }

    public void printList(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public T pollLast(){  //retrieves and removes first element.  1, 2 , 3 -->  3
        if(this.head == null)
            return null;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        return (T) temp.data;
    }

    public T pollFirst(){  //retrieves and removes first element.  1, 2 , 3 -->  1
        if(this.head == null)
            return null;

        Node temp = head;
        head = head.next;
        return (T) temp.data;
    }

}

Find loop in a linkedlist: https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/ <br/>
Middle element in a linkedlist: https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/ <br/>
Reverse a linkedlist: https://www.geeksforgeeks.org/reverse-a-linked-list/ <br/>
Add element at specified index position in linkedlist: https://www.geeksforgeeks.org/insert-a-node-at-a-specific-position-in-a-linked-list/ <br/>
Sort a linkedlist: https://www.geeksforgeeks.org/merge-sort-for-linked-list/ <br/>
Implement stack using linkedlist: https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/ <br/>

