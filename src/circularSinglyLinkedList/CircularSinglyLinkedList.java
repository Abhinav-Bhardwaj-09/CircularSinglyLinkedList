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
        else if(length == 1) {
            start = null;
            last = null;
            length--;
            return;
        }

        start = start.getNextNode();
        last.setNextNode(start);
        length--;
    }



    // To delete a node present before start
    public void deletePresentAtLast() {
        if(start == null) {
            System.out.println("Your Circular LinkedList is Already Empty !!!");
            return;
        }
        else if(length == 1) {
            start = null;
            last = null;
            length--;
            return;
        }

        length--;

        int count = 1;
        Node currentNode = start;
        while (count != length-1) {
            currentNode = currentNode.getNextNode();
            count++;
        }
        currentNode.setNextNode(start);
    }



    // To delete a node present at the given position
    public void deletePresentAtGivenPosition (int position) {
        if(start == null) {
            System.out.println("Your Circular LinkedList is Already Empty !!!");
            return;
        }
        else if(length < position) {
            System.out.println("Position should be less than or equal to the length of the Circular LinkedList");
            return;
        }
        else if(position == 1) {
            deleteFromStart();
            return;
        }
        else if(position == length) {
            deletePresentAtLast();
            return;
        }

        int count = 1;
        Node currentNode = start;
        while (count != position-1) {
            currentNode = currentNode.getNextNode();
            count++;
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        length--;
    }



    // To display the elements of the LinkedList
    public void display() {
        if(start == null) {
            System.out.println("Your Circular LinkedList is Empty !!!");
            return;
        }

        Node currentNode = start;
        int repetition = 0;

        while(repetition == 0) {
            System.out.print(currentNode.getData());

            if(currentNode == last) {
                System.out.print(" --> Start");
                repetition++;
                return;
            }
            else {
                System.out.print(" --> ");
            }
            currentNode = currentNode.getNextNode();
        }
    }
}
