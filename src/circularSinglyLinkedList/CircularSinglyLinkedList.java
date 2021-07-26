package circularSinglyLinkedList;

import node.Node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 25-07-2021
 * Time: 20:46
 */

public class CircularSinglyLinkedList {
    private Node start, last;
    private int length;


    // To get the Length of the LinkedList
    public int getLength() {
        return length;
    }



    // To insert new node in the LinkedList at the start
    public void insertAtStart (int data) {
        Node newNode = new Node(data);

        length++;

        if(start == null) {
            start = newNode;
            start.setNextNode(start);
            last = start;
            return;
        }

        Node temp = start;
        start = newNode;
        start.setNextNode(temp);
        last.setNextNode(start);
    }



    // To insert new node before start or say after last
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        length++;

        if(start == null) {
            start = newNode;
            start.setNextNode(start);
            last = start;
            return;
        }

        last.setNextNode(newNode);
        newNode.setNextNode(start);
        last = newNode;
    }



    // To delete a node present at the position start
    public void deleteFromStart () {
        if(start == null) {
            System.out.println("Your Circular LinkedList is Already Empty !!!");
            return;
        }

        start = start.getNextNode();
        last.setNextNode(start);
        length--;
    }



    // To display the elements of the LinkedList
    public void display() {
        if(start == null) {
            System.out.println("Your Circular LinkedList is Empty !!!");
            return;
        }

        Node current = start;
        int repetition = 0;

        while(repetition == 0) {
            System.out.print(current.getData());

            if(current == last) {
                System.out.print(" --> Start");
                repetition++;
                return;
            }
            else {
                System.out.print(" --> ");
            }
            current = current.getNextNode();
        }
    }
}
