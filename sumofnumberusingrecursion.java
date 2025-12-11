public class sumofnumberusingrecursion {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        int num=20;
        int result=sum(num);
        System.out.println("Sum of first " + num + " natural numbers is: " + result);
    }
    
}
