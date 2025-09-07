public class teacher extends person {
    
     private String subject;

     public teacher(String name, int age,String subject){

        super(name, age);
        this.subject = subject;
     }

     public String getsubject(){

        return this.subject;
     }

     public void setsubject(String subject){

        this.subject = subject;
     }

     public void displayTeacher(){

        displayInfo();
        System.out.println("Subject: "+ this.subject);
     }
}
