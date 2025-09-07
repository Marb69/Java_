import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       


      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter Number of Employee: ");
      int numb = scanner.nextInt();
      scanner.nextLine();

      employee em[] = new employee[numb];
       int list = 0;
       

      do{

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Possition: ");
        String possition = scanner.nextLine();
        System.out.print("Enter Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        em[list] = new employee(name,possition,salary);

        list++;
      }while(numb!=list);


      for (employee employee : em) {
        
        employee.displayEmployee();
         
      System.out.print("Enter Name employee to raised salary: ");
      String Name = scanner.nextLine();
        
        if(Name.equalsIgnoreCase(employee.name)){

          System.out.print("Enter per to raised the salary of employee: ");
          double per = scanner.nextDouble();
          scanner.nextLine();
          employee.raisedsalary(per);
   
        }

      }

    
   for (employee employee : em) {
    
    employee.displayEmployee();
   }
      

      




/*
 *  book bookList[] = new book[5];

      bookList[0] = new book("Inibig", "Wala", 2005);
      bookList[1] = new book("Ikaw At Ako", "Ako", 2001);
      bookList[2] = new book("Pinagtagpo", "Pero di tinadhana", 2025);
       bookList[3] = new book("Di Inibig", "Pero di tinadhana", 2025);
        bookList[4] = new book("Pinagtagpo", "Pero di tinadhana", 2025);




      for (book book : bookList) {
        
        book.isOldbook();
        book.displaybook();
        System.out.println();
   
      }
 

*/
     

      /*
        student studentOne = new student("Jhon Alvert",19,"Information in Technology");
        student studentTwo = new student("Alvert",19);
        student studentThree = new student();

        student studentList[] = new student[3];

        studentList[0] = studentOne;
        studentList[1] = studentTwo;
        studentList[2] = studentThree;

        for (student student : studentList) {
          
           student.displayInfo();
           System.out.println();
        }
         
       */
       









      /*
  Scanner scanner = new Scanner(System.in);
      System.out.println("Enter car model: ");
      String model = scanner.nextLine();
      System.out.println("Enter car year: ");
      int year = scanner.nextInt();
      
     car mycar = new car(model, year);

      mycar.displayInfo();
      scanner.close();
        

      if(mycar.getModel().equalsIgnoreCase(model)){

           System.out.println("Model matches: " + mycar.getModel());

           if(mycar.getYear() == year){
            System.out.println("Year matches: " + mycar.getYear());
           }
           else{
            System.out.println("Year does not match");
           }
      }

      else{
        System.out.println("Model does not exist");
      }
 */
    }
}
