public class student extends person {
    

     private String studentId;

     public student(String name,int age,String studentId){
         
        super(name, age);
        this.studentId = studentId;
     }

     public String getstudentId(){

        return this.studentId;
     }

     public void setstudentId(String studentId){

        this.studentId = studentId;
     }

     public void displayStudent(){

         displayInfo();
         System.out.println("Student Id: " + this.studentId);
     }
}
