public class StackClient {
    public static void main(String[] args) {
//        MyStack stack = new MyStack(4);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println("Size of stack before pop: "+ stack.size());
//        stack.show();
//        stack.pop();
//        System.out.println("=========");
//        System.out.println("Size of stack after pop: "+ stack.size());
//        stack.show();
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

//        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        //}

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
        stack.show();
    }

}
