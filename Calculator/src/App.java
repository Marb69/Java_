import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        
        Scanner scanner = new Scanner(System.in);

        try {

         boolean Exit = true;
         
         do{

              System.out.println("===calculator===");
            int sum = 0;
         System.out.println("1.Addition");
         System.out.println("2.Subtraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("5.Exit");
          
            System.out.print("Select operation: ");
              int inputChoice = scanner.nextInt();2
         switch (inputChoice) {
            case  1:
                
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                sum = num1 + num2;
                System.out.println("Sum: " + sum);

                break;
            case 2:
                System.out.print("Enter first number: ");
                int num3 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num4 = scanner.nextInt();
                sum = num3 - num4;
                System.out.println("Subtraction: " + sum);
                break;
            case 3:
                System.out.print("Enter first number: ");
                int num5 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num6 = scanner.nextInt();
                sum = num5 * num6;
                System.out.println("Multiplication: " + sum);
                break;
            case 4:
                System.out.print("Enter first number: ");
                int num7 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num8 = scanner.nextInt();
                if (num8 != 0) {
                    sum = num7 / num8;
                    System.out.println("Division: " + sum);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:

                Exit = false;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            default:
                break;
         }
       

         }while(Exit);


        } catch (Exception e) {
           System.out.println(e);
        }


       


    }
}
