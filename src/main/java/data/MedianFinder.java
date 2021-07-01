package data;


import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> leftQueue = new PriorityQueue<>((o1, o2)->{
        return -o1.compareTo(o2);
    });
    private PriorityQueue<Integer> rightQueue = new PriorityQueue<>();
    int size = 0;
    double mid = 0;

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (++size % 2 == 1){
            if (num <= mid){
                leftQueue.add(num);
            }else{
                rightQueue.add(num);
                leftQueue.add(rightQueue.poll());
            }
            mid = leftQueue.peek();
        }else{
            if (num >= mid){
                rightQueue.add(num);
            }else{
                leftQueue.add(num);
                rightQueue.add(leftQueue.poll());
            }
            mid = (leftQueue.peek() + rightQueue.peek())/2.0;
        }
    }

    public double findMedian() {
       return mid;
    }

    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(1);
        System.out.println(m.findMedian());
        m.addNum(2);
        m.addNum(4);
        System.out.println(m.findMedian());
        m.addNum(5);
        System.out.println(m.findMedian());
    }
}
