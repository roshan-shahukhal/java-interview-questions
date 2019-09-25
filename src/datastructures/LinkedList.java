package datastructures;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    
    Node head;
    
    void push(int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        
        head = newNode;
    }
    
    void insertAtGivenNode(Node prevNode, int data) {
        
        if (prevNode == null) {
            System.out.println("Given Node can not be null !");
            return;
        }
        
        Node newNode = new Node(data);
        
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    
    void append(int newData) {
        Node newNode = new Node(newData);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        
        lastNode.next = newNode;
    }
    
    // nth position from the end of the given linked list
    Node deleteNodeAtNthPosition(int key) {
     // First pointer will point to 
        // the head of the linked list 
        Node first = head; 
  
        // Second pointer will poin to the 
        // Nth node from the beginning 
        Node second = head; 
        for (int i = 0; i < key + 1; i++) { 
  
            // If count of nodes in the given 
            // linked list is <= N 
            if (second == null) { 
                return head;
                
            } 
            second = second.next; 
        } 
  
        // Increment both the pointers by one until 
        // second pointer reaches the end 
        while (second.next != null) { 
            first = first.next; 
            second = second.next; 
        } 
  
        // First must be pointing to the 
        // Nth node from the end by now 
        // So, delete the node first is pointing to 
        first.next = first.next.next; 
        
        return head;
    }
    
    Node bruteForceDeletionOfNodeAtNthPosition(int position) {
        Node node = head;
        printList();
        int lengthOfNode = 0;
        while (node.next != null) {
            lengthOfNode++;
            node = node.next;
        }
        
        System.out.println("length of node : " + lengthOfNode);
        node = head;
        for (int i = 0; i < lengthOfNode - position - 1; i++) {
            
            if (node.next == null) {
                return node;
            }
            node = node.next;
        }
        
        node.next = node.next.next;
        
        return head;
    }
    
    Node reverse() {
        Node previous = null, next = null;
        Node current = head;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
    
    
    void printList() {
        Node node = head;
        
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(2);
//        linkedList.insertNodeAtPosition(linkedList.head, 99, 2);
//        linkedList.push(0);
//        linkedList.append(5);
//        linkedList.deleteNodeAtNthPosition(9);
//        linkedList.reverse();
//        linkedList.bruteForceDeletionOfNodeAtNthPosition(2);
        linkedList.deleteNthPos(linkedList.head, 0);
        linkedList.printList();
    }
    
    Node insertNodeAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        }
        int counter = 0;
        Node nodes = head;
        while (nodes.next != null) {
            if (counter == (position - 1)) {
                newNode.next = nodes.next;
                nodes.next = newNode;
            } else {
                nodes = nodes.next;
            }
            counter++;
        }

        return nodes;
    }
    
    Node deleteNthPos(Node head, int position) {
        Node workingHead = head;

        int counter = 0;

        while(workingHead.next != null) {
            if (position == 0) {
                workingHead = workingHead.next;
                return workingHead;
            } else if (counter == (position - 1)) {
                workingHead.next = workingHead.next.next;
            } else {
                workingHead = workingHead.next;
            }
            counter++;
        }

        return head;
    }
}


