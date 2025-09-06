public class App {

     static void myMethod(){

            System.out.println("Hello world");
        }

        static String Name(String name){
               
         
            return name;
        }

        static void Age(int age){

            System.out.println("My age is " + age);
        }

        static void countdown(int n){
             
             if(n > 0){

                System.out.println(n + " ");
                countdown(n-1);
             }
        }
    public static void main(String[] args) throws Exception {
       

        myMethod();
        
        System.out.println(Name("Jhon"));

        Age(19);

        countdown(5);
    }
}
