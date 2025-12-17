import java.util.ArrayList;


class MyStack {

    ArrayList<Integer> list = new ArrayList<>();

   
    public void push(int data) {
        list.add(data);
    }

   
    public int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }

   
    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }
}

// Main class
public class StackDemo {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(18);
        stack.push(15);
        stack.push(58);
        stack.push(72);
        stack.push(19);

        System.out.println("Topmost element:");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("Topmost element after pop:");
        System.out.println(stack.peek());
    }
}
