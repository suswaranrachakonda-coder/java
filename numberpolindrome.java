public class numberpolindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed || x == reversed / 10);
    }

    public static void main(String[] args) {
        int number = 222;

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
    
}
