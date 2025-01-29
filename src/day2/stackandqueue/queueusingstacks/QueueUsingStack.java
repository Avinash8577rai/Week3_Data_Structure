package day2.stackandqueue.queueusingstacks;

import java.util.Stack;
import java.util.Stack;
public class QueueUsingStack {

        Stack<Integer> s1= new Stack<>();
        Stack<Integer>s2= new Stack<>();
        public void enqueue(int x){
            s1.push(x);
        }
        public int dequeue() {
            if (s2.isEmpty()) {
                if (s1.isEmpty()) {
                    return -1;
                }
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        public int peek() {
            if (s2.isEmpty()) {
                if (s1.isEmpty()) {
                    return-1;
                }
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }



    }


