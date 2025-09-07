public class college extends Student implements Innerscholarship {
    

    public college(String name,int age,int StudentId,String course){

        super(name, age, StudentId, course);
    }
             
    
    @Override
    void study() {
     
        System.out.println("Study at college");
        
    }

     @Override
     public void getScholarship() {
         System.out.println(getName() + " recieve a Scholarship");
     }
}
