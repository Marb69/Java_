public class highschool extends Student {
    
    public highschool(String name,int age,int StudentId,String course){

        super(name, age, StudentId, course);
        
    }

    @Override
    void study() {
    

        System.out.println("Study at highschool");
        
    }
}
