public class person {
    

    private String name;
    private int age;


    public person(String name,int age){

        this.name = name;
        this.age = age;
    }

    public String getname(){

        return this.name;
    }

    public int getage(){
        
        return this.age;
    }

    public void setname(String name){

        this.name = name;
    }

    public void setage(int age){

        this.age = age;
    }


    public void displayInfo(){

        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
    }
}
