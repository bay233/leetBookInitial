package initial.project;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private List<Node> arr;
    private int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        if (this.arr == null){
            this.arr = new ArrayList<>();
        }
        if (x < min){
            min = x;
        }
        Node n = new Node(x, min);
        arr.add(n);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
        if (arr.size() > 0){
            min = getMin();
        }else{
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return arr.get(arr.size() - 1).val;
    }

    public int getMin() {
        return arr.get(arr.size() - 1).min;
    }


    private class Node{
        int val;
        int min;

        public Node(){}

        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}
