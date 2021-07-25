package node;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 25-07-2021
 * Time: 20:44
 */

public class Node {
    private int data;
    private Node previousNode, nextNode;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
