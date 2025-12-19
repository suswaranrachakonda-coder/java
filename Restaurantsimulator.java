import java.util.ArrayList;
import java.util.Scanner;

class Food {
    String name;
    double price;
    int prepTime;

    Food(String name, double price, int prepTime) {
        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
    }
}

class Order {
    ArrayList<Food> items = new ArrayList<>();

    void addFood(Food food) {
        items.add(food);
    }

    void showBill() {
        double total = 0;
        int totalTime = 0;

        System.out.println("\n----- Final Bill -----");
        for (Food f : items) {
            System.out.println(f.name + " | ₹" + f.price + " | " + f.prepTime + " min");
            total += f.price;
            totalTime += f.prepTime;
        }

        System.out.println("---------------------");
        System.out.println("Total Time: " + totalTime + " minutes");
        System.out.println("Payable Amount: ₹" + total);
    }
}

public class Restaurantsimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Food> menu = new ArrayList<>();
        menu.add(new Food("Pizza", 250, 15));
        menu.add(new Food("Burger", 150, 10));
        menu.add(new Food("Pasta", 200, 12));
        menu.add(new Food("Salad", 100, 5));

        Order order = new Order();

        System.out.println(" Welcome to Restaurant");

        for (int i = 0; i < menu.size(); i++) {
            Food f = menu.get(i);
            System.out.println((i + 1) + ". " + f.name + " - ₹" + f.price + " (" + f.prepTime + " min)");
        }

        char ch;
        do {
            System.out.print("\nEnter food number: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= menu.size()) {
                order.addFood(menu.get(choice - 1));
                System.out.println("Item added!");
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Order more? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        order.showBill();
        sc.close();
    }
}
