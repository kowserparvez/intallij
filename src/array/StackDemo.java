package array;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        //last in first out ..
        Stack<Integer> myStack = new Stack<>();
        myStack.push(50);
        myStack.push(75);
        myStack.push(85);
        myStack.push(95);
        myStack.push(65);

        // retrives first element and removes it from stack
        System.out.println(myStack.pop());// prints 65
        System.out.println(myStack.peek());//gives you the element at the top of the Stack
        System.out.println(myStack.empty());// checks if the stack is empty or not
        System.out.println(myStack.peek());

//        int poppedInt = myStack.pop();
//        System.out.println(poppedInt);


    }
}
