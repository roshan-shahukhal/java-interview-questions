package dailyinterviewpro;


/**
 * You are given two linked-lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    Example:
    
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.

 */
public class AddNumbersInLinkedList {
    
    
    
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(2);
        
        linkedList.printAll();
        
        System.out.println(linkedList.reverse());
        
        LinkedList linkedList2 = new LinkedList();
        
        linkedList2.push(4);
        linkedList2.push(6);
        linkedList2.push(5);
        
        linkedList2.printAll();
        
        System.out.println(linkedList2.reverse());
        
        int total = linkedList.reverse() + linkedList2.reverse();
        System.out.println("Total sum : " + total);
        
        LinkedList linkedList3 = new LinkedList();
        StringBuilder str = new StringBuilder(total + "");
        String reversedNumber  = str.toString();
        System.out.println(reversedNumber);
        for (int i = 0; i < reversedNumber.length(); i++) {
            linkedList3.push(Integer.parseInt(reversedNumber.charAt(i) + ""));
        }
        
        linkedList3.printAll();
        
        
        
        
        
    }
    
    
}

class LinkedList {
    Node head;
    
    void push(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        
        head = newNode;
    }
    
    int reverse() {
        Node node = head;
        StringBuilder data = new StringBuilder();
        
        while (node.next != null) {
            data.append(node.data);
            node = node.next;
        }
        
        data.append(node.data);
        return Integer.parseInt(data.reverse().toString());
    }
    
    void printAll() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        
        System.out.print(node.data);
        System.out.println("");
    }
    
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}
