import by.itclass.Stack;

import java.util.Arrays;

public class Runner3 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        stack1.push(10);

        stack2.push(12);
        stack2.push(11);
        stack2.push(10);
        stack2.push(9);
        stack2.push(8);
        stack2.push(404);
        stack2.push(228);
        stack2.push(1337);
        stack2.push(69);
        stack2.push(420);
        stack2.push(7);
        stack2.push(6);

        System.out.println(Arrays.toString(stack1.getStorage()));
        System.out.println(Arrays.toString(stack2.getStorage()));

    }

}
