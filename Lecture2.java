import java.util.*;

public class Lecture2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int a = sc.nextInt();

        // Conditional Statements 
        // (1) if-else if-else 
        if(a > 18) {
            System.out.println("Adult");
        }
        else if(a == 18) {
            System.out.println("On the Edge");
        }
        else {
            System.out.println("Minor");
        }

        // (2) Ternary / Short hand
        String result = (a >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        // (3) Switch statement
        switch(a) {
            case 18:
                System.out.println("On the Edge");
                break;
            case 19:
                System.out.println("Adult");
                break;
            default:
                System.out.println("Minor");
                break;
        }

        sc.close();
    }
}
