package day2.stackandqueue.queueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue =new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeue: "+ queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

}
