import java.util.ArrayList;

class MyStack {

    ArrayList<String> list = new ArrayList<>();

    public String peek() {
        if (list.isEmpty()) {
            return "Stack is empty";
        }
        return list.get(list.size() - 1);
    }

    public void push(String data) {
        list.add(data);
    }

    public String pop() {
        if (list.isEmpty()) {
            return "Stack is empty";
        }
        String temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }
}

public class Browserrowser {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push("Browser");

        System.out.println("Topmost element: " + stack.peek());

        stack.pop();

        System.out.println("Topmost element after pop: " + stack.peek());
    }
}
