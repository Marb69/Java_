public class employee {
    
    String name;
    String possition;
    double salary;

    public employee (String name,String possition,double salary){

         this.name = name;
         this.possition = possition;
         this.salary = salary;
    }

    public void displayEmployee(){

        System.out.println("Employee: "+ name);
        System.out.println("Possition: " + possition);
        System.out.println("salary: "+ salary);

    }

    public double raisedsalary(double percent){

        return salary+=percent;
    }
}
