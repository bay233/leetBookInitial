package data;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author bay
 * @date 2021/1/21
 */
public class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int count = 0;

    /** Initialize your data structure here. */
    public MyStack() {}

    /** Push element x onto stack. */
    public void push(int x) {
        if ((++count & 1) == 1){
            execPush(this.q1, this.q2, x);
        }else{
            execPush(this.q2, this.q1, x);
        }
    }

    private void execPush(Queue<Integer> q1, Queue<Integer> q2, int x){
        q1.add(x);
        q1.addAll(q2);
        q2.clear();
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return (count & 1) == 1? q1.poll(): q2.poll();
    }

    /** Get the top element. */
    public int top() {
        return (count & 1) == 1? q1.peek(): q2.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (count & 1) == 1? q1.isEmpty(): q2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }

}
