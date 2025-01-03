import java.util.*;            // for all lib

// import java.util.Scanner;   // for Input


public class Lecture1{
    public static void main(String[] args){

        //Output
        System.out.println("Hello World!");  
        System.out.println("Kesa ho \naap");

        // variables
        int a = 24;   
        int b = 5;
        System.out.println(a+b);

        // Data Types
        byte myByte = 100;
        short myShort = 5000;
        int myNum = 5;
        long myLong = 15000000000L;
        float myFloatNum = 5.99f;  //(Decimal at default is a double so to specify it we use 'f' at last)
        double myDoubleNum = 5.99;  // 5.99d
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        
        System.out.println("Byte value: " +myByte);
        System.out.println("Short value: " +myShort);
        System.out.println("Integer value: " + myNum);
        System.out.println("Long value: " +myLong);
        System.out.println("Float value: " + myFloatNum);
        System.out.println("Double value: " + myDoubleNum);
        System.out.println("Character value: " + myLetter);
        System.out.println("Boolean value: " + myBool);
        System.out.println("String value: " + myText);

        // Type Casting
        // Automatic casting
        int v = 9;
        double x = v;
        System.out.println(x);

        // Manual casting
        int y = 9;
        double z = (double)y;
        System.out.println(z);

        
        // Input
        Scanner sc = new Scanner(System.in);   //making instance of Scanner classs => sc Obj
        
        System.out.print("Enter the name: ");
        String inputstring1 = sc.next();                 // Read Tushar
        System.out.println("The name entered is: "+inputstring1);

        sc.nextLine();   // Consume the newline character left by next()

        System.out.print("Enter the name: ");
        String inputstring2 = sc.nextLine();          // Read Tushar Chauhan
        System.out.println("The name entered is: "+inputstring2);

        System.out.print("Enter an integer: ");
        int inputInt = sc.nextInt();  // Read an integer
        System.out.println("You entered integer: " + inputInt);

        System.out.print("Enter a double: ");
        double inputDouble = sc.nextDouble();  // Read a double
        System.out.println("You entered double: " + inputDouble);

        System.out.print("Enter a float: ");
        float inputFloat = sc.nextFloat();  // Read a float
        System.out.println("You entered float: " + inputFloat);

        System.out.print("Enter a long: ");
        long inputLong = sc.nextLong();  // Read a long
        System.out.println("You entered long: " + inputLong);

        System.out.print("Enter a byte: ");
        byte inputByte = sc.nextByte();  // Read a byte
        System.out.println("You entered byte: " + inputByte);

        System.out.print("Enter a short: ");
        short inputShort = sc.nextShort();  // Read a short
        System.out.println("You entered short: " + inputShort);

        sc.close();  // prevent resource leak




    
    }   
}