import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
      


        try {
            
            
            Scanner sc = new Scanner(System.in);
            boolean Exit = true;

            

            do{

            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }

            }while(Exit);




        } catch (Exception e) {
            // TODO: handle exception
        }



    }
}
