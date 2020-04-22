public class MyStack {
    private int[] arr;
    private int size;
    private int index;
    public MyStack(){};
    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public Boolean isFull(){
        if(index == size) return true;
        else return false;
    }
    public Boolean isEmpty(){
        if(index==0) return true;
        else return false;
    }
    public void push(int data){
        if(isFull()) throw new StackOverflowError("Stack is full");
        arr[index] = data;
        index++;
    }
    public int pop(){
        if(isEmpty()) throw new StackOverflowError("Stack is null");
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public void show(){
        for (int x : arr) System.out.println(x);
    }
}
