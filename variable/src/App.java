public class App {
    public static void main(String[] args) throws Exception {

        String Hello = "Hello, World!"; // Non-primitive data type

        // premitive data types

        int year = 2024;
        double version = 10.1;
        float price = 199.99f;
        boolean isActive = true;
        char inital = 'H';

        // end

        // printing all the variables
        System.out.println("String sample: " + Hello);
        System.out.println("Integer sample: " + year);
        System.out.println("Double sample: " + version);
        System.out.println("Float sample: " + price);
        System.out.println("Boolean sample: " + isActive);
        System.out.println("Character sample: " + inital);
        // end

        System.out.println();
        // reassigning values

        Hello = "Hello,Java!";
        year = 2025;
        version = 15.1;
        price = 20.33f;
        isActive = false;
        inital = 'J';

        System.out.println("New value: " + Hello);
        System.out.println("New value: " + year);
        System.out.println("New value: " + version);
        System.out.println("New value: " + price);
        System.out.println("New value: " + isActive);
        System.out.println("New value: " + inital);

        // end

        System.out.println();

        // concatination

        System.out.println(Hello + " this is year " + year + " version " + version + " the price is " + price
                + " i'm active true or false " + isActive + " the First letter of java is " + inital);

        // end
        System.out.println();

        //Widening casting

          int intValue = 20;
           System.out.println(" Int value: " + intValue);
          double intTodouble = intValue;
          System.out.println("Widening casting " + intTodouble);

        //end
System.out.println();

        //Narrowing casting

           double dValue = 10.22f;
           System.out.println("double value " + dValue);
           int Ivalue = (int) dValue;
           
           System.out.println("narrowing casting "+Ivalue);
        //end

        System.out.println();
        // math operation

        int num1 = 5;
        int num2 = 3;

        System.out.println("this is the sum of num1 and num2 => " + (num1 + num2));

        System.out.println("The addtion: " + (num1 + num1));
        System.out.println("The multiplication: " + (num1 * num2));
        System.out.println("The division: " + (num1 / num2));
        System.out.println("The substraction: " + (num1 - num2));

        // end
        System.out.println();

        // String

        String helloWorld = "Hello";

        System.out.println("Hello length " + helloWorld.length());
        System.out.println("upper case " + helloWorld.toUpperCase());
        System.out.println("lower case " + helloWorld.toLowerCase());
       

        // end

        System.out.println();
        // array

        String studentList[] = { "Student1", "Student2", "student3" };

        System.out.println(studentList[0]);
        System.out.println(studentList[1]);
        System.out.println(studentList[2]);

        // end

        
    }
}
