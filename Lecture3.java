import java.util.*;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input: ");
        int x = sc.nextInt();
        
        // (1) For loop 
        int sum1 = 0 ;
        for(int i1=1;i1<=x;i1++){
            sum1 += i1;
        }
        System.out.println("Sum : "+sum1);

        // (2) While loop
        int sum2 = 0;
        int i2 = x;
        while(i2>0){    // while(ii--) is not allowed
            sum2 += i2; 
            i2--;
        }
        System.out.println("Sum: "+sum2);

        // (3) Do-While loop
        int sum3=0;
        int i3 = x;
        do{
            sum3 += i3;
        }
        while(i3>10);
        System.out.println("Sum : "+sum3);


        // Break / Continue
        String name = "Tushar ChaUhan";
        String result = "";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='U'){
                break;
            }
            else if (name.charAt(i)=='a'){
                continue;
            }
            else{
                result += name.charAt(i);
            }
        }
        System.out.println("Result : "+ result);

        sc.close();
    }
}
