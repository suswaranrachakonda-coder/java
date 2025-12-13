public class student {
    String name;
    int age;
    public void display(){
System.out.println("Name: " + name + " and age: "+age);
    }
    public static void main(String[] args) {
        student s1  = new student();
        s1.name = "sai kumar";
        s1.age = 20;
        s1.display();
    }
}
