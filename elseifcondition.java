public class elseifcondition {
    public static void main(String[] args) {
       int english=62;
         int math=76;
        int science=70;
        int social=80;
        int java=69;
        int sum= english+math+science+social+java;
        int average= sum/5;
        System.out.println("average is: " + average);
         if (average >=90) {
            System.out.println("Grade A");
        } else if (average >=80) {
            System.out.println("Grade B");
        } else if (average >=70) {
            System.out.println("Grade C");
        } else if (average >=60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
    
}
