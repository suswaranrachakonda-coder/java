public class InterruptDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds.");
                Thread.sleep(5000);
                System.out.println("Thread woke up after sleep.");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        });

        thread.start();

        try {
            // Main thread sleeps for 2 seconds before interrupting
            Thread.sleep(2000);
            System.out.println("Main thread is interrupting the sleeping thread.");
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted: " + e.getMessage());
        }
    }
}
