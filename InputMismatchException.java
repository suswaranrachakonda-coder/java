public class InputMismatchException {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
    
}
