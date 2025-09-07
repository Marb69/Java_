public class staff extends person {
    
       
    private String position;

    public staff(String name,int age,String position){
        
        super(name, age);
        this.position = position;
    }

    public String getposition(){

        return this.position;
    }

    public void setposition(String position){

        this.position = position;
    }


    public void displayStaff(){

        displayInfo();
        System.out.println("Position: "+ position);
    }
}
