public class Employee extends Person {
    

    private String position;

    public Employee (String name, String sex,int age,String position){

        super(name, age, sex);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
}
