public class student {
    
    String name;
    int age;
    String course;


    public student(String name,int age,String course){

        this.name = name;
        this.age = age;
        this.course = course;
    }

    public student(String name,int age){

        this.name = name;
        this.age = age;
        this.course = "Undeclared";

    }
    public student (){
        this.name = "Unknown";
        this.age = 0;
        this.course = "Undeclared";
    }

    public void displayInfo(){
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
        System.out.println("Student course: " + this.course);
    }
}
